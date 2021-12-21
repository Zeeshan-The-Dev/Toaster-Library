package com.zeeshan.librarypractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import com.zeeshan.toasterlibrary.ToasterMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnSimple).setOnClickListener {
            ToasterMessage.showToast(this , "Test")
        }

        findViewById<Button>(R.id.btnSuccess).setOnClickListener {
            ToasterMessage.showSuccessToast(this , "Test Success")
        }


        findViewById<Button>(R.id.btnWarning).setOnClickListener {
            ToasterMessage.showWarningToast(this , "Test Warning")
        }


        findViewById<Button>(R.id.btnError).setOnClickListener {
            ToasterMessage.showErrorToast(this , "Test Error")
        }


    }
}