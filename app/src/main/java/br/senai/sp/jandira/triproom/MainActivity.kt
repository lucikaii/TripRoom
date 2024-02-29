package br.senai.sp.jandira.triproom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
fun TripRoom(){
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
        ){

            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = { 
                        Text(text = "E-mail")
                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xff7d8cc4)
                ),
                shape = RoundedCornerShape(16.dp)
            )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {
                        Text(text = "Senha")
                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xff7d8cc4)
                ),
                shape = RoundedCornerShape(16.dp)
            )
        }

        Row {
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

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TripRoomPreview() {
    TripRoomTheme {
        TripRoom()
    }
}