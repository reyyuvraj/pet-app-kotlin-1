package com.dsckiet.petapp.view.data

import com.dsckiet.petapp.view.profilemodel.Categories


class CategoriesDataSource {
    companion object{
        fun createDataSet(): ArrayList<Categories>{
            val list = ArrayList<Categories>()
            list.add(
                Categories(
                    dp = "https://cdn.icon-icons.com/icons2/2070/PNG/512/dog_icon_125586.png",
                    pet = "Dog"
                )
            )

            list.add(
                Categories(
                    dp = "https://cdn.icon-icons.com/icons2/2070/PNG/512/dog_icon_125586.png",
                    pet = "Cat"
                )
            )

            list.add(
                Categories(
                    dp = "https://cdn.icon-icons.com/icons2/2070/PNG/512/dog_icon_125586.png",
                    pet = "fish"
                )
            )

            list.add(
                Categories(
                    dp = "https://cdn.icon-icons.com/icons2/2070/PNG/512/dog_icon_125586.png",
                    pet = "Bird"
                )
            )
            return list

        }
    }
}