package com.kalamou.tuto1

object DataStore {
    val userInformations = UserInformations("", "", null)

    fun getData(): UserInformations{
        return userInformations
    }

    fun setData(userInformations: UserInformations){
        this.userInformations.prenom = userInformations.prenom
        this.userInformations.nom = userInformations.nom
        this.userInformations.age= userInformations.age
    }
}

data class UserInformations(
    var prenom: String? = "",
    var nom: String? = "",
    var age: String? = "",
)