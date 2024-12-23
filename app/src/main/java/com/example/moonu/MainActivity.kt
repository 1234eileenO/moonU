package com.example.moonu

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.moonu.components.CityItem
import com.example.moonu.model.City
import com.example.moonu.repository.CityRepository
import com.example.moonu.ui.theme.MoonUTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            MoonUTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ItemRecycler(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ItemRecycler(modifier: Modifier = Modifier){
    val repository = CityRepository()
    LazyColumn(
        contentPadding =  PaddingValues(all = 12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(repository.getAllData()){ city ->
            CityItem(
                city = city
            )
        }
//        itemsIndexed(
//            items = repository.getAllData(),
//            key = { index, city ->
//                city.id
//            }
//        ) { index, city ->
//            Log.d("MainActivity", index.toString())
//            CityItem(
//                city = city
//            )
//
//        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MoonUTheme() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White)
        ) {
            ItemRecycler()
        }
    }
}