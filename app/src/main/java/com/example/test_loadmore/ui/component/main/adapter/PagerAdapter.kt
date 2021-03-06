package com.example.test_loadmore.ui.component.main.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.test_loadmore.data.dto.argument.ArgumentRequestNetwork
import com.example.test_loadmore.ui.component.main._4d.Fragment_4D
import com.example.test_loadmore.ui.component.main._4k.Fragment_4K
import com.example.test_loadmore.ui.component.main.categories.CategoriesFragment
import com.example.test_loadmore.ui.component.main.live.LiveFragment
import com.example.test_loadmore.ui.component.main.top.TopFragment

class PagerAdapter(var data : ArgumentRequestNetwork, fm: FragmentActivity) : FragmentStateAdapter(fm) {

    private val arrayList: ArrayList<Fragment> = ArrayList()

    override fun getItemCount(): Int {
        return 5
    }

    fun addFragment(fragment: Fragment) {
        arrayList.add(fragment)
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return TopFragment(data.top)
            1 -> return Fragment_4D(data._4d)
            2 -> return LiveFragment(data.live)
            3 -> return Fragment_4K(data._4k)
            4 -> return CategoriesFragment(data.category)
        }
        return Fragment()
    }
}