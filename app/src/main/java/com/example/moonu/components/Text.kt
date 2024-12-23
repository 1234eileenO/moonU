package com.example.moonu.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TitleLargeText(text: String, modifier: Modifier = Modifier){
    Text(
        text = text,
        modifier = Modifier
            .wrapContentHeight()
            .wrapContentWidth(),
        style = MaterialTheme.typography.titleLarge
        )
}

@Composable
fun BodyLargeText(text: String, modifier: Modifier = Modifier){
    Text(
        text = text,
        modifier = Modifier
            .wrapContentHeight()
            .wrapContentWidth(),
        style = MaterialTheme.typography.bodyLarge
    )
}

@Composable
fun BodyMediumText(text: String, modifier: Modifier = Modifier){
    Text(
        text = text,
        modifier = Modifier
            .wrapContentHeight()
            .wrapContentWidth(),
        style = MaterialTheme.typography.bodyMedium
    )
}

@Preview
@Composable
fun PreviewText(){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ){
        TitleLargeText(text = "preview")
        BodyLargeText(text = "preview")
        BodyMediumText(text = "preview")
    }
}