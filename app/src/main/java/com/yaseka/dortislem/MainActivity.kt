package com.yaseka.dortislem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var sayi1 : Int? = null
    var sayi2 : Int? = null
    var sonuc: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sum(view : View){

        sayi1 = sayi1Text.text.toString().toIntOrNull()
        sayi2 = sayi2Text.text.toString().toIntOrNull()

        if(sayi1 == null || sayi2 == null){
            sonucText.text = "Sayı girmeyi unutmayınız!"
        } else {
            sonuc = sayi1!! + sayi2!!
            sonucText.text = "Sonuç: ${sonuc}"
        }



    }

    fun sub(view: View){
        sayi1 = sayi1Text.text.toString().toIntOrNull()
        sayi2 = sayi2Text.text.toString().toIntOrNull()

        if(sayi1 == null || sayi2 == null){
            sonucText.text = "Sayı girmeyi unutmayınız!"
        } else {
            sonuc = sayi1!! - sayi2!!
            sonucText.text = "Sonuç: ${sonuc}"
        }


    }

    fun divide(view: View){
        sayi1 = sayi1Text.text.toString().toIntOrNull()
        sayi2 = sayi2Text.text.toString().toIntOrNull()

        if(sayi1 == null || sayi2 == null){
            sonucText.text = "Sayı girmeyi unutmayınız!"
        } else {
            sonuc = sayi1!! / sayi2!!
            sonucText.text = "Sonuç: ${sonuc}"
        }
    }

    fun multiply(view: View){
        sayi1 = sayi1Text.text.toString().toIntOrNull()
        sayi2 = sayi2Text.text.toString().toIntOrNull()

        if(sayi1 == null || sayi2 == null){
            sonucText.text = "Sayı girmeyi unutmayınız!"
        } else {
            sonuc = sayi1!! * sayi2!!
            sonucText.text = "Sonuç: ${sonuc}"
        }
    }


}