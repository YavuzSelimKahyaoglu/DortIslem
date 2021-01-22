package com.yaseka.dortislem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sum(view: View){
        var sayi1=sayi1Text.text.toString().toInt();
        var sayi2=sayi2Text.text.toString().toInt();

        var sonuc=(sayi1+sayi2).toString();

        sonucText.text="Sonuç: ${sonuc}";
    }

    fun sub(view: View){
        var sayi1=sayi1Text.text.toString().toInt();
        var sayi2=sayi2Text.text.toString().toInt();

        var sonuc=(sayi1-sayi2).toString();

        sonucText.text="Sonuç: ${sonuc}";
    }

    fun multiply(view: View){
        var sayi1=sayi1Text.text.toString().toInt();
        var sayi2=sayi2Text.text.toString().toInt();

        var sonuc=(sayi1*sayi2).toString();

        sonucText.text="Sonuç: ${sonuc}";
    }

    fun divide(view: View){
        var sayi1=sayi1Text.text.toString().toDouble();
        var sayi2=sayi2Text.text.toString().toDouble();

        var sonuc=(sayi1/sayi2).toString();

        sonucText.text="Sonuç: ${sonuc}";
    }
}