package com.steven.chatboy

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text


import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.colorspace.Rgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview


import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.steven.chatboy.model.Member
import com.steven.chatboy.ui.theme.Teal200
import com.steven.chatboy.ui.theme.Teal700


@Composable
fun CustomerItem(member:Member){
    val context = LocalContext.current
    Row (modifier = Modifier
        .clickable(
            onClick = { showClickEvent(member = member, context = context) }
        )//點擊事件要擺在padding之前，會影響點擊範圍
        .fillMaxWidth()
        .background(Color.White)
        .border(width = 1.dp, color = Teal200)
        .padding(20.dp),

        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        Text(
            text = "${member.id}",
            color = Teal700,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = member.name,
            color = Teal700,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "${member.age} yrs",
            color = Teal700,
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal
        )
        Text(
            text = member.email,
            color = Teal700,
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal
        )

    }
}


@Composable
@Preview
fun  CustomerItemPreview(){
    CustomerItem(
        member = Member(
            id = 1,
            name = "Amy",
            age = 17,
            email = "amy0011@yahoo.com.tw"
        )
    )
}

fun showClickEvent(member:Member, context: Context){
    Toast.makeText(context, "Hello! ${member.name}!", Toast.LENGTH_LONG).show()
}