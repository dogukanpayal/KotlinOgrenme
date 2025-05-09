package com.dogukanpayal.project1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        /*
        println("Hello World")
        println("Dogukan Payal")
        // yorum satırı

        var x = 10
        println(x)

        var y = 20
        println(x+y)

        // val Kullanılırsa o değeri sonradan değiştiremezsin fix bir değer
        val z =30
        println(z)

        var a : Int = 20
        var f : Float = 20.2f

        val pi = 3.14

        println(f)
        println(pi)

        val stringKelime = "Dogukan Payal"
        val stringKelime2 = "Bilgisayar Mühendisi"
        println(stringKelime)

        println( stringKelime.uppercase())
        println(stringKelime +" "+ stringKelime2)

        val benimStr : String
        benimStr = "Benim Stringim" // init
        println(benimStr)

        // donusturme
        val yas = "15"
        println(yas.toInt() * 20)

        val benimBool : Boolean = true

        val benimBool2 = true

        println(benimBool2)
        println(benimBool)

        val kullaiciYas = "35"
        println(kullaiciYas.toInt()>40)


        println(arrayOrnegi[1])



        var notRakam : Int
        var notString = ""
        notRakam= 2

        when(notRakam){
            0 -> notString = "Geçersiz Not"
            1 -> notString = "Geçer Not"
            else -> notString = "Böyle bir not yok"
        }
        println(notString)
        */

        val arrayOrnegi = arrayOf("Dogukan","Payal")

        for(kelime in arrayOrnegi){
            println(kelime)
        }


















    }
}