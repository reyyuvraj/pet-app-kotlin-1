package com.dsckiet.petapp.view.data

import com.dsckiet.petapp.view.profilemodel.categories


class categoriesdataSource {
    companion object{
        fun createDataSet(): ArrayList<categories>{
            val list = ArrayList<categories>()
            list.add(
                categories(
                    dp = "https://cdn.icon-icons.com/icons2/2070/PNG/512/dog_icon_125586.png",
                    pet = "Dog"
                )
            )

            list.add(
                categories(
                    dp = "https://cdn.icon-icons.com/icons2/2070/PNG/512/dog_icon_125586.png",
                    pet = "Cat"
                )
            )

            list.add(
                categories(
                    dp = "https://cdn.icon-icons.com/icons2/2070/PNG/512/dog_icon_125586.png",
                    pet = "fish"
                )
            )

            list.add(
                categories(
                    dp = "https://cdn.icon-icons.com/icons2/2070/PNG/512/dog_icon_125586.png",
                    pet = "Bird"
                )
            )
            return list

        }
    }
}