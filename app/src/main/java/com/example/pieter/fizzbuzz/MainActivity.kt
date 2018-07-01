package com.example.pieter.fizzbuzz

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    private fun Int.isDivisibleBy(divisor : Int) = this % divisor == 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        for (integer in 1..100) {
            when {
                integer.isDivisibleBy(15) -> Timber.d("FizzBuzz")
                integer.isDivisibleBy(3) -> Timber.d("Fizz")
                integer.isDivisibleBy(5) -> Timber.d("Buzz")
                else -> Timber.d(integer.toString())
            }
        }
    }
}
