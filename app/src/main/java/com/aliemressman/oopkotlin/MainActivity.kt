package com.aliemressman.oopkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aliemressman.oopkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        println("-------Sınıflar--------")
        val kullanici = Kullanici("Mehmet",65)
        val digerKullanici = Kullanici("Sude",19)

        println("-------Encapsulation-------")
        val ahmet = Sanatci("Ahmet",55,"Futbolcu")
        println(ahmet.isim)
        println(ahmet.yas)
        println(ahmet.meslek)


        println("-------Inheritance-------")

        val ayse = OzelSanatci("Ayşe",48,"Aşcı")
        println(ayse.isim)
        println(ayse.yas)
        println("Meslek : ${ayse.meslek}")
        ayse.siirYaz()

        println("-------Polymorphism-------")

        // Statik Polymorphism
        val islem = Islemler()

        println( islem.carpma())
        println( islem.carpma(5,9))
        println( islem.carpma(5,9,48))


        // Dinamik Polymorphism (override kullanımı var = bir fonksiyonun ismini tekrar kullancaksak kullanırız)

        val simsek = Kopek()
        simsek.sesCikar()
        simsek.kopekFonksiyonu()

        val kedi = Hayvan()
        kedi.sesCikar()

        println("-------Abstraction & Interface-------") // Interface'i birden fazla kalıtım alacakken kullanırız.
        // Kullanıcı sınıfı Insan sınıfından miras aldı ( Abstract) bu sayede fonksiyona ulaşabildik
        // Yukarda oluştuduğumuz kullanici objesini burda kullandık
        kullanici.insanFonksiyonu()

        var gitar = Gitar()
        gitar.marka = "Gitar markarsı"
        gitar.elektor = true

        // İnterface sayesinde ulaştığımız kısım
        gitar.bilgi()
        println(gitar.oda)

        println("-------Lambda Gösterimi-------")
        /* fun yazdigimiYazdir(string : String){
        println(yazdigimiYazdir) }
        YAPMAK YERİNE TEK KODLA YAZMAMIZI SAĞLAR. */

        val yazdigimiYazdirLambda = {verilenString : String -> println(verilenString) }
        yazdigimiYazdirLambda("test Lambda")

        val carpmaİslemiLambda = {a : Int , b : Int -> a * b }
        println(carpmaİslemiLambda(6,8))

        //İkinci şekilde gösterimi

        val carpmaLambdaV2 : (Int , Int)-> Int = {a,b -> a*b}
        println(carpmaLambdaV2(5,7))

    }
}