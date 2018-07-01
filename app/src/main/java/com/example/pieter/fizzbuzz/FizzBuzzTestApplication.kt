package com.example.pieter.fizzbuzz

import android.app.Application
import timber.log.Timber

class FizzBuzzTestApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}