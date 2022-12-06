package com.steven.chatboy.fragment


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.steven.chatboy.AreaItem
import com.steven.chatboy.CustomerItem
import com.steven.chatboy.Nav_select
import com.steven.chatboy.repository.AreaRepository
import com.steven.chatboy.repository.MemberRepository
import com.steven.chatboy.ui.theme.Gray200
import com.steven.chatboy.ui.theme.Purple200
import com.steven.chatboy.ui.theme.Purple700
import com.steven.chatboy.ui.theme.Teal200




@Preview
@Composable
fun defaultPreview() {
    HomeView()
}

@Composable
fun HomeView() {
    Column {
        SearchBar()
        LazyRow()
        LazyColumn()
    }
}

@Composable
fun SearchBar() {
    Row(
        modifier = Modifier
            .padding(start = 12.dp, end = 12.dp, bottom = 6.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(25.dp))
            .height(50.dp)
            .background(color = Color.White),
        verticalAlignment = Alignment.CenterVertically

    ) {
        var searchText by remember { mutableStateOf("") }
        BasicTextField(
            value = searchText, onValueChange = { searchText = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp)
                .weight(1f),
        ) {
            if (searchText.isEmpty()) {
                Text(text = "搜尋你要的?", color = Gray200, fontSize = 20.sp)
            }
            it()
        }
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .aspectRatio(1f)
                .padding(2.dp)
                .clip(CircleShape)
                .background(Purple200)
                .clickable {

                }
        ) {
            Icon(
                tint = Color.White,
                imageVector = Icons.Rounded.Search,
                contentDescription = "搜尋按鈕",
                modifier = Modifier
                    .size(36.dp)
                    .align(Alignment.Center),
            )
        }
    }
}

@Composable
fun LazyRow() {
    val areaList = AreaRepository().getAll()
    LazyRow(
        modifier = Modifier.padding(bottom = 6.dp),
        contentPadding = PaddingValues(horizontal = 12.dp),
        horizontalArrangement = Arrangement.spacedBy(5.dp)
    ) {
        items(items = areaList) { item ->
            AreaItem(area = item)
        }
    }
}

@Composable
fun LazyColumn() {

    val memberList = MemberRepository().getAll()
    LazyColumn(
        modifier = Modifier.padding(horizontal = 12.dp),
        verticalArrangement = Arrangement.spacedBy(5.dp)
    ) {
        items(items = memberList) { item ->
            CustomerItem(member = item)
        }
    }
}



