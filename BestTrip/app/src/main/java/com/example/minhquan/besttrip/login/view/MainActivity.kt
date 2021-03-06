package com.example.minhquan.besttrip.login.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v4.view.ViewPager
import android.support.design.widget.TabLayout
import com.example.minhquan.besttrip.R
import com.example.minhquan.besttrip.adapter.ViewPagerAdapter
import android.graphics.Typeface
import android.widget.TextView




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        val adapter = ViewPagerAdapter(this, supportFragmentManager)
        viewPager.adapter = adapter
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        tabLayout.setupWithViewPager(viewPager)

        val appName = findViewById<TextView>(R.id.textAppName)
        val description = findViewById<TextView>(R.id.textDescription)

        val customFontTitle = Typeface.createFromAsset(assets, "fonts/KrinkesDecor.ttf")
        val customFontDescription = Typeface.createFromAsset(assets, "fonts/KrinkesRegular.ttf")

        appName.typeface = customFontTitle
        description.typeface = customFontDescription
    }


}
