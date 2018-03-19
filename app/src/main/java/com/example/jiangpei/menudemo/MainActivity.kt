package com.example.jiangpei.menudemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.main, menu)

        return super.onCreateOptionsMenu(menu)
    }

    fun onMenuClicked(menuItem: MenuItem) {
        when (menuItem.itemId) {
            R.id.item1 -> Toast.makeText(this, menuItem.title, Toast.LENGTH_SHORT).show()
            R.id.item2 -> Toast.makeText(this, menuItem.title, Toast.LENGTH_SHORT).show()
            R.id.item3 -> Toast.makeText(this, menuItem.title, Toast.LENGTH_SHORT).show()
            R.id.item4 -> Toast.makeText(this, menuItem.title, Toast.LENGTH_SHORT).show()
        }
    }
}
