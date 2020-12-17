//package com.example.motyokoiapplication.ui.notifications
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.BaseAdapter
//import android.widget.ListView
//import android.widget.TextView
//import com.example.motyokoiapplication.R
//
//class ListAdapter(val context: ListView, val UserList: ArrayList<User>) : BaseAdapter() {
//
//    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
//        val view: View = LayoutInflater.from(context).inflate(R.layout.item_user, null)
//        val Name = view.findViewById<TextView>(R.id.name_tv)
//        val Email = view.findViewById<TextView>(R.id.email_tv)
//        val Place =  view.findViewById<TextView>(R.id.place_tv)
//
//        val user = UserList[position]
//
//        Name.text = user.name
//        Email.text = user.email
//        Place.text = user.place
//
//        return view
//    }
//
//    override fun getItem(position: Int): Any {
//        return UserList[position]
//    }
//
//    override fun getItemId(position: Int): Long {
//        return 0
//    }
//
//    override fun getCount(): Int {
//        return UserList.size
//    }
//}