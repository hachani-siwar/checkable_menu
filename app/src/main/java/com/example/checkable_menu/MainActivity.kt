package com.example.checkable_menu

import android.bluetooth.BluetoothA2dp
import android.graphics.Color
import android.graphics.Color.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
         return when (item.itemId){
            R.id.chkBlue ->{

                if(item.isChecked)
                textView.setTextColor(WHITE)
                item.isChecked =!item.isChecked
                true
            }
            R.id.chkRed ->{

                if(item.isChecked)
                textView.setTextColor(BLACK)
                item.isChecked =!item.isChecked
                true

            }
            R.id.chkGreen ->{

                if(item.isChecked)
                textView.setTextColor(Color.GREEN)
                item.isChecked=!item.isChecked
                true
            }
             else ->
                 return super.onOptionsItemSelected(item)

        }



    }
}