package com.dsckiet.petapp.view.data
import com.dsckiet.petapp.view.profilemodel.pet

class petdataSource {
    companion object{
        fun createDataSet(): ArrayList<pet>{
            val list = ArrayList<pet>()
            list.add(
                pet(
                    dp = "https://cdn.icon-icons.com/icons2/2070/PNG/512/dog_icon_125586.png",
                    breed = "dog"
                )
            )
            return list

        }
    }
}
