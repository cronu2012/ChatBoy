package com.steven.chatboy

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.steven.chatboy.model.Area
import com.steven.chatboy.repository.AreaRepository
import com.steven.chatboy.ui.theme.Teal200

@Composable
fun AreaItem(area: Area) {
    Column(
        modifier = Modifier
            .height(150.dp)
            .width(100.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(color = Color.White)
            .border(width = 1.dp, color = Teal200, shape = RoundedCornerShape(20.dp))
            .padding(5.dp),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Top
    ) {

        Text(
            modifier = Modifier.padding(start = 10.dp),
            text = "${area.id}",
            fontSize = 10.sp
        )

        Image(
            painter = painterResource(id = area.image),
            "地區圖片",
            modifier = Modifier
//                .clip(CircleShape)
                .weight(1f)
                .fillMaxSize()
        )

        Text(
            text = area.name,
//            textAlign = TextAlign.Center,
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
            fontSize = 10.sp,
            fontFamily = FontFamily.Monospace
        )

    }
}

@Preview
@Composable()
fun DefaultPreview() {
    AreaItem(
        area = AreaRepository().getAll().first()
    )
}