package com.example.firstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var one :Button
    lateinit var two :Button
    lateinit var equal :Button
    lateinit var plus :Button
    lateinit var display :TextView

    var firstvalue  =0
    var secondvalue = 0

    var cnt = 0;





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calcydesign)
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        equal = findViewById(R.id.equal);
        plus = findViewById(R.id.plus);
        display = findViewById(R.id.display);


        one.setOnClickListener {

            Mygetvalue("1");

        }

        two.setOnClickListener {
            Mygetvalue("2");
        }

        plus.setOnClickListener {
           opratorrr("-");
        }

        equal.setOnClickListener {

            secondvalue = display.text.toString().toInt()

            display.setText("")



            if(cnt == 1)
            {
                display.text = "${firstvalue + secondvalue}"

            }else if (cnt==2)
            {
                display.text = "${firstvalue - secondvalue}"
            }

        }
    }

    private fun opratorrr(op: String) {

        var temp = 0

        temp = firstvalue   // 0  , 12
        firstvalue = display.text.toString().toInt()  // 12  , 12


        Log.d("==TEMp", "opratorrr:$temp ")
        Log.d("==FIRST", "opratorrr:$firstvalue ")
// 12 + 12 + 12

        if(cnt==1)
        {

            firstvalue = firstvalue + temp;
        }
        else if(cnt==2)
        {

            firstvalue = temp - firstvalue;
        }

        display.setText("")
        if(op=="+")
        {
            cnt = 1
        }
        else if(op=="-")
        {

            cnt = 2
        }



    }

    private fun Mygetvalue(s: String) {
        display.text  = display.text.toString() + s
    }


}