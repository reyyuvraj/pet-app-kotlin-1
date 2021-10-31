package com.dsckiet.petapp.view.data
import com.dsckiet.petapp.view.profilemodel.Pet

class PetDataSource {
    companion object{
        fun createDataSet(): ArrayList<Pet>{
            val list = ArrayList<Pet>()
            list.add(
                Pet(
                    dp = "https://cdn.icon-icons.com/icons2/2070/PNG/512/dog_icon_125586.png",
                    breed = "dog"
                )
            )
            return list

        }
    }
}
