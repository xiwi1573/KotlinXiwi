package cn.org.xiwi.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kotlin.*
import org.jetbrains.anko.toast

class KotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        hello_kotlin.text = "hello kotlin this is my first try!"

        hello_kotlin.setOnClickListener { toast("toast from kotlin") }
    }
}
