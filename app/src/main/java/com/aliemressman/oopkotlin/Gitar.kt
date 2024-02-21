package com.aliemressman.oopkotlin
// Abstraction ( soyutlama )

class Gitar: Ensturman,Dekorasyon {
    // Ensturman ve Dekorasyon sınıfı Interface sınıf olduğu için ikisini birden miras alabildik.
    var marka : String? = null
    var elektor : Boolean? = null

    //  Dekorasyon sınıfında var oda : String yaptığımız için alttaki şekilde override ettik.
    override var oda: String
        get() = ("Mutfak")
        set(value) {}


}