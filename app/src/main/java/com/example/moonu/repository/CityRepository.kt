package com.example.moonu.repository

import com.example.moonu.model.City

class CityRepository {
    fun getAllData(): List<City> {
        return listOf(
            City(
                id = 0,
                name = "Chicago",
                timeZone = "CST",
                time = 2.0,
                isCurrent = true,
                date = "aaa"
            ),
            City(
                id = 1,
                name = "Seoul",
                timeZone = "Pacific",
                time = 112.0,
                isCurrent = false,
                date = "aaa"
            ),
            City(
                id = 2,
                name = "CC",
                timeZone = "CST",
                time = 2.0,
                isCurrent = false,
                date = "aaa"
            ),
            City(
                id = 3,
                name = "DD",
                timeZone = "CST",
                time = 2.0,
                isCurrent = false,
                date = "aaa"
            ),
            City(
                id = 4,
                name = "EE",
                timeZone = "CST",
                time = 2.0,
                isCurrent = false,
                date = "aaa"
            )
        )
    }
}