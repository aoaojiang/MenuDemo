package com.example.jiangpei.menudemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        registerForContextMenu(label1)
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)

        if (v?.id == R.id.label1) {
            menuInflater.inflate(R.menu.label_menu, menu)
        }
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

            R.id.labelItem1 -> Toast.makeText(this, menuItem.title, Toast.LENGTH_SHORT).show()
            R.id.labelItem2 -> Toast.makeText(this, menuItem.title, Toast.LENGTH_SHORT).show()
        }
    }


    fun popup_menu(view: View) {
        val popupMenu = PopupMenu(this, view)
        popupMenu.menuInflater.inflate(R.menu.label_menu, popupMenu.menu)
        popupMenu.show()
    }
}
