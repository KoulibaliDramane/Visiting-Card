package com.example.visitingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visitingcard.ui.theme.VisitingCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VisitingCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Main(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Main(modifier: Modifier = Modifier) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(
            brush = Brush.linearGradient(
                colors = listOf(Color(0xFFd9042b), Color.Black),
                start = Offset(-3000f, -2500f),
                end = Offset.Infinite
            )
        ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column (
            modifier = Modifier
                .weight(1f)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                val image = painterResource(R.drawable.miles)
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = modifier
                        .background(color = Color.Black)
                        .size(250.dp)
                )
                Text(
                    text = stringResource(R.string.name),
                    modifier = Modifier
                        .padding(top = 10.dp),
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    color = Color.White
                )
                Text(
                    text = stringResource(R.string.title),
                    modifier = Modifier
                        .padding(top = 10.dp),
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }
        }
        Column(
            modifier = Modifier
                .padding(16.dp)
                .padding(bottom = 20.dp)
        ) {
            Row (
                modifier = Modifier.padding(bottom = 10.dp)
            ){
                Icon(
                    imageVector = Icons.Filled.Call,
                    contentDescription = null,
                    modifier = Modifier.padding(end = 10.dp),
                    tint = Color.White
                )
                Text(
                    text = stringResource(R.string.contacte),
                    color = Color.White
                )
            }
            Row (
                modifier = Modifier.padding(bottom = 10.dp)
            ){
                Icon(
                    imageVector = Icons.Filled.Share,
                    contentDescription = null,
                    modifier = Modifier.padding(end = 10.dp),
                    tint = Color.White
                )
                Text(
                    text = stringResource(R.string.link),
                    color = Color.White
                )
            }
            Row (
                modifier = Modifier.padding(bottom = 10.dp)
            ){
                Icon(
                    imageVector = Icons.Filled.Email,
                    contentDescription = null,
                    modifier = Modifier.padding(end = 10.dp),
                    tint = Color.White
                )
                Text(
                    text = stringResource(R.string.devemail),
                    color = Color.White
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    VisitingCardTheme {
        Main()
    }
}