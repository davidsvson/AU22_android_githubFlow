package com.example.githubflow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    lateinit var emil : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(emil)

    }
}


//1. en person skapar projektet
//2. samma person gör en git init
//3. samma person skapar ett projekt på github och pushar upp projektet

//ALLA andra gör en clone
//alal skapr sin egen branch git checkout -b branchname
//gör förändringar

//pusha upp din gren till github ( git push origin branchname)
//på github gör en pull request
//någon annan ( ej jag) mergar min pullrequest på github

//jag byter gren till main



// EMIL TESTAR GREJER


