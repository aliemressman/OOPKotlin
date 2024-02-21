package com.aliemressman.oopkotlin

//Dinamik Polymorphism

class Kopek : Hayvan() {

    fun kopekFonksiyonu(){
        super.sesCikar() // Super sayesinde Hayvan Sınıfında bulunan sesCikar Fonksiyonunu kullanıyor.

    }
     override fun sesCikar(){
         println("Köpek sınıfına geldin")
    }
}