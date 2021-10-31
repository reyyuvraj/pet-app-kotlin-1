package com.dsckiet.petapp.view.data

import com.dsckiet.petapp.view.profilemodel.Profile

class PetProfileDataSource {
companion object {
    fun createDataSet(): ArrayList<Profile>{
        val list = ArrayList<Profile>()
        list.add(
            Profile(
                dp ="https://i.pinimg.com/564x/05/67/3a/05673a4496d28ccb5ffea8c4cc81e8c1.jpg",
                ownername = "Suresh",
                breed = "Labrador",
                petage = "3 years old",
                distance = "Distance: 4 km"
            )
        )

        list.add(
            Profile(
                dp ="https://i.pinimg.com/564x/05/67/3a/05673a4496d28ccb5ffea8c4cc81e8c1.jpg",
                ownername = "Ramesh",
                breed = "Labrador",
                petage = "3 years old",
                distance = "Distance: 4 km"
            )
        )

        list.add(
            Profile(
                dp ="https://i.pinimg.com/564x/05/67/3a/05673a4496d28ccb5ffea8c4cc81e8c1.jpg",
                ownername = "Suresh",
                breed = "Labrador",
                petage = "3 years old",
                distance = "Distance: 4 km"
            )
        )

        list.add(
            Profile(
                dp ="https://i.pinimg.com/564x/05/67/3a/05673a4496d28ccb5ffea8c4cc81e8c1.jpg",
                ownername = "Ramesh",
                breed = "Labrador",
                petage = "3 years old",
                distance = "Distance: 4 km"
            )
        )

        list.add(
            Profile(
                dp ="https://i.pinimg.com/564x/05/67/3a/05673a4496d28ccb5ffea8c4cc81e8c1.jpg",
                ownername = "Suresh",
                breed = "Labrador",
                petage = "3 years old",
                distance = "Distance: 4 km"
            )
        )
        return list

    }
}
}