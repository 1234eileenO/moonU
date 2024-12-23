package com.example.moonu.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.moonu.model.City

@Composable
fun CityItem(
    city: City
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .background(color = Color.Magenta)
            .padding(vertical = 16.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Column(
            modifier = Modifier
                .wrapContentHeight()
                .wrapContentWidth()
        ) {
            BodyMediumText(text = city.name, modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight())
            BodyMediumText(text = city.timeZone, modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight())
        }
        Row(
            modifier = Modifier
                .wrapContentHeight()
                .wrapContentWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            BodyLargeText(text = city.time.toString(), modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight())

            BodyLargeText(text = "AM", modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight())
        }
        BodyLargeText(text = city.date)
    }
}

@Preview
@Composable
fun PreviewCityItem() {
    CityItem(
        City(
            id = 0,
            name = "Chicago",
            timeZone = "CST",
            time = 2.0,
            isCurrent = true,
            date = "aaa"
        )
    )
}