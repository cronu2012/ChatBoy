package com.steven.chatboy

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.steven.chatboy.fragment.HomeView


import com.steven.chatboy.repository.AreaRepository
import com.steven.chatboy.repository.MemberRepository

import com.steven.chatboy.ui.theme.*
import com.steven.chatboy.uiitem.showNavBar

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting()
        }
    }


    @Composable
    fun Greeting() {
        ChatBoyTheme {
            Column(
                modifier = Modifier.background(Gray100),

                ) {
                Column(
                    modifier = Modifier.weight(1f),

                    ) {
                    showRow()
                    when(Nav_select){
                      1 -> HomeView()
                    }

                }
                showNavBar()
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        Greeting()
    }



    @Composable
    fun showRow() {
        Row(
            modifier = Modifier
                .padding(top = 12.dp, start = 12.dp, end = 12.dp, bottom = 6.dp)
                .fillMaxWidth()
                .border(width = 1.dp, color = First_info_border_color)
                .background(color = Color.White),
        ) {
            Image(
                painterResource(R.drawable.slutgirl),
                "頭像",
                modifier = Modifier
                    .clip(CircleShape)
                    .size(60.dp)
            )
            Column(
                modifier = Modifier.padding(10.dp)
            ) {
                Text(
                    text = "歡迎回來",
                    color = Color.Gray,
                    fontSize = 10.sp
                )
                Text(
                    text = "香山淫娃",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
            }
        }
    }


}


