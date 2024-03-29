package br.senai.sp.jandira.triproom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxColors
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.triproom.ui.theme.TripRoomTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TripRoomTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun TripRoomLogin() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Box(
                modifier = Modifier
                    .height(40.dp)
                    .width(120.dp)
                    .background(
                        color = Color(0xff7d8cc4),
                        shape = RoundedCornerShape(bottomStart = 16.dp)
                    )
            ) {

            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 35.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Card(
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp),
                shape = CircleShape,
                CardDefaults.cardColors(containerColor = Color(0xff7d8cc4))

            ) {

            }
        }
        Column(
            modifier = Modifier
                .padding(start = 16.dp, top = 30.dp)
        ) {
            Text(
                text = "Login",
                color = Color(0xff7d8cc4),
                fontSize = 48.sp,
                fontWeight = FontWeight.ExtraBold
            )
            Text(
                text = "Please, sign in to continue",
                color = Color(0xffA09C9C),
                fontSize = 14.sp
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, top = 70.dp)
        ) {

            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {
                    Text(text = "E-mail")
                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xff7d8cc4),
                    focusedBorderColor = Color(0xff7d8cc4)
                ),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .fillMaxWidth()
            )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {
                    Text(text = "Senha")
                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xff7d8cc4),
                    focusedBorderColor = Color(0xff7d8cc4)
                ),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp)
            )
        }

        Row(
            modifier = Modifier
                .padding(top = 30.dp, end = 16.dp)
                .align(alignment = Alignment.End)
        ) {
            Button(
                modifier = Modifier
                    .height(50.dp)
                    .width(130.dp),
                shape = RoundedCornerShape(16.dp),
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xff7d8cc4))
            ) {

                Text(text = "SIGN IN", color = Color(0xffffffff))
                Icon(
                    imageVector = Icons.Outlined.KeyboardArrowRight,
                    contentDescription = "Seta"
                )
            }
        }

        Row(
            modifier = Modifier
                .padding(top = 30.dp, end = 16.dp)
                .align(alignment = Alignment.End)
        ) {
            Text(
                text = "Don't have an account?",
                color = Color(0xffA09C9C),
                fontSize = 12.sp
            )
            Text(
                text = "Sign Up",
                color = Color(0xff7d8cc4),
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalAlignment = Alignment.Bottom
        ) {
            Box(
                modifier = Modifier
                    .height(40.dp)
                    .width(120.dp)
                    .background(
                        color = Color(0xff7d8cc4),
                        shape = RoundedCornerShape(topEnd = 16.dp)
                    )


            )
        }

    }
}


@Composable
fun TripRoomSignup() {

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {

            Box(
                modifier = Modifier
                    .height(40.dp)
                    .width(120.dp)
                    .background(
                        color = Color(0xff7d8cc4),
                        shape = RoundedCornerShape(bottomStart = 16.dp)
                    )
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Sign Up",
                color = Color(0xff7d8cc4),
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Create a new account",
                color = Color(0xffA09C9C),
                fontSize = 14.sp
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 25.dp),
            horizontalArrangement = Arrangement.Center
        ) {

            Card(
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp),
                shape = CircleShape,
                border = BorderStroke(width = 2.dp, color = Color(0xff7d8cc4))
            ) {
                Icon(
                    imageVector = Icons.Outlined.Person,
                    contentDescription = "foto de perfil",
                    tint = Color(0xff7d8cc4),
                    modifier = Modifier
                        .height(80.dp)
                        .width(80.dp)
                        .padding(start = 17.dp, top = 17.dp)
                )
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, top = 25.dp)
        ) {

            OutlinedTextField(
                value = "Kainan Braga",
                onValueChange = {},
                label = {
                    Text(text = "Username", color = Color(0xff000000))
                },
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xff7d8cc4),
                    focusedBorderColor = Color(0xff7d8cc4)
                )
            )

            OutlinedTextField(
                value = "kainan.braga@gmail.com",
                onValueChange = {},
                label = {
                    Text(text = "Email", color = Color(0xff000000))
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp),
                shape = RoundedCornerShape(16.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xff7d8cc4),
                    focusedBorderColor = Color(0xff7d8cc4)
                )
            )

            OutlinedTextField(
                value = "shiu123",
                onValueChange = {},
                label = {
                    Text(text = "Password", color = Color(0xff000000))
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp),
                shape = RoundedCornerShape(16.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xff7d8cc4),
                    focusedBorderColor = Color(0xff7d8cc4)
                )
            )

            OutlinedTextField(
                value = "shiu123",
                onValueChange = {},
                label = {
                    Text(text = "Confirm Password", color = Color(0xff000000))
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp),
                shape = RoundedCornerShape(16.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xff7d8cc4),
                    focusedBorderColor = Color(0xff7d8cc4)
                )
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp)
        ) {
            Checkbox(
                checked = true,
                onCheckedChange = {},
                colors = CheckboxDefaults.colors(
                    checkedColor = Color(0xff7d8cc4),
                    uncheckedColor = Color(0xff7d8cc4),
                    checkmarkColor = Color(0xffffffff)
                )
            )
            Text(text = "Over 18?")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, top = 15.dp)
        ) {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(50.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xff7d8cc4)
                )
            ) {
                Text(text = "CREATE ACCOUNT")
            }
        }

        Row(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Text(
                text = "Already have an account?",
                fontSize = 12.sp,
                color = Color(0xffA09C9C)
            )
            Text(
                text = "Sign in",
                fontSize = 12.sp,
                color = Color(0xff7d8cc4),
                fontWeight = FontWeight.Bold
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalAlignment = Alignment.Bottom
        ) {

            Box(
                modifier = Modifier
                    .height(40.dp)
                    .width(120.dp)
                    .background(
                        color = Color(0xff7d8cc4),
                        shape = RoundedCornerShape(topEnd = 16.dp)
                    )
            )
        }


    }
}


@Composable
fun TripRoomHome() {

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .height(197.dp)

        ){

            Image(
                painter = painterResource(id = R.drawable.parisfr),
                contentDescription = "paisagem",
                contentScale = ContentScale.Crop)


        }

        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ){

            Text(
                text = "Categories",
                fontSize = 16.sp,
                color = Color(0xff565454)
            )

            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){

                item{
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .height(65.dp)
                            .width(110.dp),
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xff7d8cc4)
                        )
                    ) {

                        Column (
                            modifier = Modifier
                                .fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){

                            Image(
                                painter = painterResource(id = R.drawable.montanha),
                                contentDescription = "Montanha",
                                modifier = Modifier
                                    .height(32.dp)
                                    .width(32.dp))
                            Text(
                                text = "Mountain",
                                color = Color(0xffffffff)
                            )
                        }
                    }
                }

                item{
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .height(65.dp)
                            .width(110.dp),
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xff7d8cc4)
                        )
                    ) {

                        Column (
                            modifier = Modifier
                                .fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){

                            Image(
                                painter = painterResource(id = R.drawable.ski),
                                contentDescription = "Neve",
                                modifier = Modifier
                                    .height(32.dp)
                                    .width(32.dp))
                            Text(
                                text = "Snow",
                                color = Color(0xffffffff))
                        }
                    }
                }

                item{
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .height(65.dp)
                            .width(110.dp),
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xff7d8cc4)
                        )
                    ) {

                        Column (
                            modifier = Modifier
                                .fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){

                            Image(
                                painter = painterResource(id = R.drawable.beach),
                                contentDescription = "Montanha",
                                modifier = Modifier
                                    .height(32.dp)
                                    .width(32.dp))
                            Text(
                                text = "Mountain",
                                color = Color(0xffffffff))
                        }
                    }
                }

                item{
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .height(65.dp)
                            .width(110.dp),
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xff7d8cc4)
                        )
                    ) {

                    }
                }





            }

            Spacer(modifier = Modifier.height(20.dp))
            var pesquisa = remember {
                mutableStateOf("")
            }

            OutlinedTextField(
                value = pesquisa.value,
                onValueChange = {
                    pesquisa.value = it
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                shape = RoundedCornerShape(16.dp),
                placeholder = {
                    Text(text = "Search your destiny")
                }
            )

        }

























    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TripRoomPreview() {
    TripRoomTheme {
        TripRoomHome()
        //TripRoomSignup()
    }
}