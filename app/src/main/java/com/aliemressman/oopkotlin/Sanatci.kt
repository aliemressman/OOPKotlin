package com.aliemressman.oopkotlin

//Encapsulation

open class Sanatci(isim : String, yas : Int, meslek : String) {
    var isim: String? = isim
        private set
        get

    var yas : Int? = yas
        private set
        get

    var meslek : String? = meslek
        private set
        get
}