package br.senai.sp.jandira.bmi

import android.content.Context
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable
fun ResultScreen(navegacao: NavHostController?) {
    var nameState = remember {
        mutableStateOf("")
    }
    val userFile = LocalContext.current.getSharedPreferences("user_file", Context.MODE_PRIVATE)

    val userHeight = userFile.getFloat("user_height", 0.0f)
    val userWeight = userFile.getFloat("user_weight", 0.0f)
    val userAge = userFile.getFloat("user_age", 0.0f)
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    listOf(
                        Color(0xFF4FBE01),
                        Color(0xFFFFFFFF)
                    )
                )
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = stringResource(R.string.YouBMI),
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                modifier = Modifier
                    .padding(38.dp)
                    .weight(1f)
            )

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(7f),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ),
                shape = RoundedCornerShape(
                    topStart = 20.dp,
                    topEnd = 20.dp
                )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(15.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Card(
                        modifier = Modifier
                            .padding(bottom = 10.dp)
                            .size(120.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        ),
                        shape = CircleShape,
                        border = BorderStroke(
                            width = 4.dp,
                            brush = Brush.linearGradient(
                                listOf(
                                    Color(0xFFFF9800),
                                    Color(0xFFFFC107)
                                )
                            )
                        )
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = "30,6",
                                color = Color.Black,
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 40.sp
                            )
                        }
                    }
                    Text(
                        text = stringResource(R.string.You_have_class),
                        color = Color.Black,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 30.sp
                    )
                    Card(
                        modifier = Modifier
                            .height(80.dp)
                            .fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxSize(),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column(
                                modifier = Modifier
                                    .weight(1f),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    text = stringResource(R.string.age)
                                )
                                Text(
                                    text = "$userAge",
                                    fontWeight = FontWeight.SemiBold
                                )

                            }
                            VerticalDivider()
                            Column(
                                modifier = Modifier
                                    .weight(1f),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    text = stringResource(R.string.weight)
                                )
                                Text(
                                    text = "$userWeight Kg",
                                    fontWeight = FontWeight.SemiBold
                                )

                            }
                            VerticalDivider()
                            Column(
                                modifier = Modifier
                                    .weight(1f),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    text = stringResource(R.string.height)


                                )
                                Text(
                                    text = "$userHeight cm",
                                    fontWeight = FontWeight.SemiBold
                                )

                            }

                        }
                    }
                    Column(
                        modifier = Modifier
                            .background(Color.DarkGray)
                            .fillMaxWidth()
                            .height(300.dp)
                    ) {

                    }
                    HorizontalDivider()
                    Button(
                        onClick = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 20.dp)
                            .height(48.dp),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text(
                            text = stringResource(R.string.NewCalc),
                            fontSize = 26.sp
                        )
                    }
                }
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun ResultScreenPreview() {
    ResultScreen(navegacao = null)

}