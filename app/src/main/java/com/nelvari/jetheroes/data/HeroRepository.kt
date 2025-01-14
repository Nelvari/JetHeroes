package com.nelvari.jetheroes.data

import com.nelvari.jetheroes.model.Hero
import com.nelvari.jetheroes.model.HeroesData

class HeroRepository {

    fun getHeroes(): List<Hero> {
        return HeroesData.heroes
    }

    fun searchHeroes(query: String): List<Hero>{
        return HeroesData.heroes.filter {
            it.name.contains(query, ignoreCase = true)
        }
    }

}