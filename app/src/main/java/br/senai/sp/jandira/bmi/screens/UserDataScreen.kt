package br.senai.sp.jandira.bmi.screens


import android.content.Context
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddChart
import androidx.compose.material.icons.filled.Deck
import androidx.compose.material.icons.filled.Numbers
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Label
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmi.R

@Composable
fun UserDataScreen(){

    val context = LocalContext.current
    val userFile = context.getSharedPreferences("user_file", Context.MODE_PRIVATE)

    val userName = userFile.getString("user_name", "")

    val nameState = remember {
        mutableStateOf("")
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFFFFFF))
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Green)
        ){
            Text(
                text = stringResource(R.string.hi) + ", $userName!",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier
                    .padding(32.dp)
                    .weight(1f)
            )

            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(4f),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ){
                Column (
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(32.dp)
                ){
                    Row (
                        modifier = Modifier
                            .fillMaxWidth()

                    ){
                        Column (
                            modifier = Modifier
                                .weight(1f),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Card(
                                modifier = Modifier
                                    .size(130.dp),
                                shape = CircleShape,
                                border = BorderStroke(
                                    width = 4.dp,
                                    brush = Brush.linearGradient(
                                        listOf(
                                            Color(0xFF00FD0B),
                                            Color(0xFFFFFFFF)
                                        )
                                    )
                                )

                            ) {
                                Image(
                                    painter = painterResource(
                                        id = R.drawable.men
                                    ),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .fillMaxSize()

                                )
                            }
                            Button(
                                onClick = {},
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(16.dp),
                                colors = ButtonDefaults
                                    .buttonColors(
                                        containerColor = Color(0xFF3F51B5)
                                    )
                            ) {
                                Text(
                                    text = stringResource(R.string.male)
                                )
                            }
                        }

                        Column (
                            modifier = Modifier
                                .weight(1f),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Card(
                                modifier = Modifier
                                    .size(130.dp),
                                shape = CircleShape,
                                border = BorderStroke(
                                    width = 4.dp,
                                    brush = Brush.linearGradient(
                                        listOf(
                                            Color(0xFF4CAF50),
                                            Color(0xFFFFFFFF)
                                        )
                                    )
                                )

                            ) {
                                Image(
                                    painter = painterResource(
                                        id = R.drawable.woman
                                    ),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .fillMaxSize()

                                )
                            }
                            Button(
                                onClick = {},
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(16.dp),
                                colors = ButtonDefaults
                                    .buttonColors(
                                        containerColor = Color(0xFF3F51B5)
                                    )
                            ) {
                                Text(
                                    text = stringResource(R.string.female)
                                )
                            }
                        }


                        }

                    Column (
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally

                    ){
                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            modifier = Modifier
                                .padding(bottom = 20.dp),
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Numbers,
                                    contentDescription = ""
                                )
                            },
                            label = {
                                Text(
                                    text = stringResource(R.string.age)
                                )
                            }

                        )

                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            modifier = Modifier
                                .padding(bottom = 20.dp),
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Deck,
                                    contentDescription = ""
                                )
                            },
                            label = {
                                Text(
                                    text = stringResource(R.string.weight)
                                )
                            }

                        )

                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            modifier = Modifier
                                .padding(bottom = 20.dp),
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.AddChart,
                                    contentDescription = ""
                                )
                            },
                            label = {
                                Text(
                                    text = stringResource(R.string.height)
                                )
                            }

                        )
                    }

                    Button(
                        onClick = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 20.dp)
                            .height(48.dp),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text(
                            text = stringResource(R.string.calculate),
                            fontSize = 26.sp
                        )
                    }



                    }
                    }


                    }


                }
            }

@Preview
@Composable
private fun UserDataScreenPreview(){
    UserDataScreen()
}