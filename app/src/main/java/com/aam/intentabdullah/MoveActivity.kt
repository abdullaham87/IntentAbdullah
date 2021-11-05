package com.aam.intentabdullah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MoveActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnBackToMainPage: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move)

        btnBackToMainPage = findViewById(R.id.btn_backto_main_page)
        btnBackToMainPage.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null)
            when (v.id) {
                R.id.btn_backto_main_page -> run {
                    val intent = Intent(this, BackToMainPage::class.java)
                    startActivity(intent)
                }
            }
    }

    class BackToMainPage {

    }
}





