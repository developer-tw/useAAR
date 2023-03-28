package com.sqtek.useaar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.sqtek.nativejnilib.NativeLib

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val aar_api = NativeLib()
        val title = findViewById<TextView>(R.id.title)
        val sum = findViewById<TextView>(R.id.sum)
        title.text = aar_api.stringFromJNI()
        sum.text = aar_api.addTwoNum(8, 9).toString()
    }
}