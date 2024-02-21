package com.aliemressman.oopkotlin

//Inheritance

class OzelSanatci(isim: String, yas: Int, meslek: String) :  Sanatci(isim, yas, meslek){
//  : kullanmı sayesinde Sanatci sınıfından kalıtım alırız.
 fun siirYaz (){
     println("Şiir yazılıyoorrrr")
 }
}