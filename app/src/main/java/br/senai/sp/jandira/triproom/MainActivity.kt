package br.senai.sp.jandira.triproom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxColors
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
fun TripRoomLogin(){
    Column (
        modifier = Modifier
            .fillMaxSize()
    ){

        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ){
            Box (
                modifier = Modifier
                    .height(40.dp)
                    .width(120.dp)
                    .background(
                        color = Color(0xff7d8cc4),
                        shape = RoundedCornerShape(bottomStart = 16.dp)
                    )
            ){

            }
        }

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 35.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){

            Card (
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp),
                shape = CircleShape,
                CardDefaults.cardColors(containerColor = Color(0xff7d8cc4))

            ){

            }
        }
        Column (
            modifier = Modifier
                .padding(start = 16.dp, top = 30.dp)
        ){
            Text(
                text = "Login",
                color = Color(0xff7d8cc4),
                fontSize = 48.sp,
                fontWeight = FontWeight.ExtraBold)
            Text(
                text = "Please, sign in to continue",
                color = Color(0xffA09C9C),
                fontSize = 14.sp
            )
        }
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, top = 70.dp)
        ){

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

        Row (
            modifier = Modifier
                .padding(top = 30.dp, end = 16.dp)
                .align(alignment = Alignment.End)
        ){
            Button(
                modifier = Modifier
                    .height(50.dp)
                    .width(130.dp),
                shape = RoundedCornerShape(16.dp),
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xff7d8cc4))) {

                Text(text = "SIGN IN")
            }
        }

        Row (
            modifier = Modifier
                .padding(top = 30.dp, end = 16.dp)
                .align(alignment = Alignment.End)
        ){
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
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalAlignment = Alignment.Bottom
        ){
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
fun TripRoomSignup(){

    Column (
        modifier = Modifier
            .fillMaxSize()
    ){

        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ){

            Box(
                modifier = Modifier
                    .height(40.dp)
                    .width(120.dp)
                    .background(
                        color = Color(0xff7d8cc4),
                        shape = RoundedCornerShape(bottomStart = 16.dp)
                    ))
        }

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
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

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 25.dp),
            horizontalArrangement = Arrangement.Center
        ){

            Card (
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp),
                shape = CircleShape
            ){

            }
        }

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, top = 50.dp)
                .scrollable(orientation = )
        ){

            OutlinedTextField(
                value = "LUANA",
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
                value = "LUANA",
                onValueChange = {},
                label = {
                    Text(text = "Username", color = Color(0xff000000))
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp),
                shape = RoundedCornerShape(16.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xff7d8cc4),
                    focusedBorderColor = Color(0xff7d8cc4)
                )
            )

            OutlinedTextField(
                value = "LUANA",
                onValueChange = {},
                label = {
                    Text(text = "Username", color = Color(0xff000000))
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp),
                shape = RoundedCornerShape(16.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xff7d8cc4),
                    focusedBorderColor = Color(0xff7d8cc4)
                )
            )

            OutlinedTextField(
                value = "LUANA",
                onValueChange = {},
                label = {
                    Text(text = "Username", color = Color(0xff000000))
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp),
                shape = RoundedCornerShape(16.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xff7d8cc4),
                    focusedBorderColor = Color(0xff7d8cc4)
                )
            )
        }

        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
        ){
            Checkbox(
                checked = false,
                onCheckedChange = {},
                colors = CheckboxDefaults.colors(
                    checkedColor = Color(0xff7d8cc4),
                    uncheckedColor = Color(0xff7d8cc4),
                    checkmarkColor = Color(0xff7d8cc4)
                ))
            Text(text = "Over 18?")
        }

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, top = 25.dp)
        ){
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
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TripRoomPreview() {
    TripRoomTheme {
        TripRoomSignup()
    }
}