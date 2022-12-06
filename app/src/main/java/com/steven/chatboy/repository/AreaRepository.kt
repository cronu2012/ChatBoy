package com.steven.chatboy.repository

import androidx.annotation.DrawableRes
import com.steven.chatboy.R
import com.steven.chatboy.model.Area

class AreaRepository {
    private val areaList = listOf<Area>(
        Area(
            id = 1,
            name = "台北市",
            image = R.drawable.area_taipei
        ),
        Area(
            id = 2,
            name = "新北市",
            image = R.drawable.area_hsinpei
        ),
        Area(
            id = 3,
            name = "基隆市",
            image = R.drawable.area_keelong
        ),
        Area(
            id = 4,
            name = "桃園市",
            image = R.drawable.area_taoyuan
        ),
        Area(
            id = 5,
            name = "新竹市",
            image = R.drawable.area_hsinchu
        ),
        Area(
            id = 6,
            name = "台中市",
            image = R.drawable.area_taichung
        ),
        Area(
            id = 7,
            name = "高雄市",
            image = R.drawable.area_kaohsiung
        ),
        Area(
            id = 8,
            name = "宜蘭市",
            image = R.drawable.area_yilan
        )
    )

    val getAll:()->List<Area> = {
        areaList
    }
}