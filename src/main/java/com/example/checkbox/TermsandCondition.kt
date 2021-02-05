package com.example.checkbox

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class TermsandCondition : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_termsand_condition)
        supportActionBar!!.title="Lotus App"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        var accept:Button=findViewById(R.id.acceptbutton)
        var decline:Button=findViewById(R.id.declinebutton)
        accept.setOnClickListener {
            val intent = Intent()
            intent.putExtra("keyName", 2)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }

        decline.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}