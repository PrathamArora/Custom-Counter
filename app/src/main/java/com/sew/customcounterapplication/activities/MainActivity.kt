package com.sew.customcounterapplication.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.sew.customcounterapplication.R
//import com.sew.customcounterlibrary.CustomCounter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val customCounter: CustomCounter = findViewById(R.id.customcounter)

//        customCounter.setOnValueChangeListener(object :
//            com.sew.customcounterlibrary.CustomCounter.OnValueChangeListener {
//            override fun onValueChange(oldValue: Int, newValue: Int) {
//                Toast.makeText(
//                    this@MainActivity,
//                    "Old Value $oldValue and New Value $newValue",
//                    Toast.LENGTH_LONG
//                ).show()
//            }
//        })
//
//        customCounter.setMinusButtonColor(this.resources.getColor(R.color.incrementDefaultColor, null))
//        customCounter.setPlusButtonColor(this.resources.getColor(R.color.decrementDefaultColor, null))
//        customCounter.setInitialValue(20)
    }
}
