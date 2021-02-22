package com.example.androidrecyclerviewandcardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidrecyclerviewandcardview.adapter.MyAdapter
import com.example.androidrecyclerviewandcardview.model.MyModel


class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var arrayList: ArrayList<MyModel>
    lateinit var thisAdapter: MyAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rv1)
        gridLayoutManager = GridLayoutManager(applicationContext, 3,
                            LinearLayoutManager.VERTICAL, false)

        recyclerView.layoutManager = gridLayoutManager
        recyclerView.setHasFixedSize(true)

        arrayList = setupData()
        thisAdapter = MyAdapter(applicationContext, arrayList)
        recyclerView.adapter = thisAdapter
    }


    private fun setupData(): ArrayList<MyModel>{
        var items: ArrayList<MyModel> = ArrayList()

        items.add(MyModel(R.drawable.generation_1, "5 Generations of Mothers and Daughters: Great-Great-Grandma, Great-Grandma, Grandma, Mom, and Me"))
        items.add(MyModel(R.drawable.generation_2, "Last Generation Picture Taken Before Great-Grandma's Death"))
        items.add(MyModel(R.drawable.graduation_1, "Me and My Graduation Robe"))
        items.add(MyModel(R.drawable.graduation_2, "My Graduation Diploma"))
        items.add(MyModel(R.drawable.me_1, "Me with Short Hair"))
        items.add(MyModel(R.drawable.me_black_and_white, "Me with Long Hair"))

        items.add(MyModel(R.drawable.me_and_sis_and_brother, "Me and my Sister, and Brother"))
        items.add(MyModel(R.drawable.me_and_andrew_6, "Girlfriend and Boyfriend"))
        items.add(MyModel(R.drawable.me_and_andrew_5, "His and Her Shirts"))
        items.add(MyModel(R.drawable.me_and_andrew_7, "Us in a Field"))
        items.add(MyModel(R.drawable.me_and_andrew_8, "Us in Front of a Tree"))
        items.add(MyModel(R.drawable.me_and_andrew_9, "Us Engaged"))

        items.add(MyModel(R.drawable.me_and_andrew_10, "All You Need Is Love"))
        items.add(MyModel(R.drawable.me_and_andrew_11, "Us in a Black and White Photo"))
        items.add(MyModel(R.drawable.me_and_mom, "Getting Ready For Wedding"))
        items.add(MyModel(R.drawable.my_wedding_close_up, "Close Up"))
        items.add(MyModel(R.drawable.my_wedding_6, "Walking Down the Isle"))
        items.add(MyModel(R.drawable.my_wedding_3, "Kiss"))
        items.add(MyModel(R.drawable.my_wedding_1, "Now Married"))

        items.add(MyModel(R.drawable.my_wedding_2, "Our Picture Together"))
        items.add(MyModel(R.drawable.my_wedding_4, "Cake Fight"))
        items.add(MyModel(R.drawable.my_wedding_5, "Another Kiss"))
        items.add(MyModel(R.drawable.wedding_black_and_white, "Our Wedding Picture in Black and White"))
        items.add(MyModel(R.drawable.wedding_my_family, "Picture with my Parents, and Siblings"))
        items.add(MyModel(R.drawable.wedding_andrews_family, "Picture with Andrew's Parents, and Brother"))

        items.add(MyModel(R.drawable.wedding_uncle_and_his_friend, "Picture with my Uncle and Chris"))
        items.add(MyModel(R.drawable.wedding_dads_family, "Picture with Dad's Sisters"))
        items.add(MyModel(R.drawable.wedding_moms_family, "Picture with my Aunt and her Family"))
        items.add(MyModel(R.drawable.wedding_grandmas_family, "Picture with my Grandma's Sisters, their Husbands, and a Cousin"))
        items.add(MyModel(R.drawable.wedding_alex_and_friend, "Alex and his Friend"))
        items.add(MyModel(R.drawable.me_and_andrew_alex, "Brothers Hug"))

        items.add(MyModel(R.drawable.me_and_andrew_1, "Close Together"))
        items.add(MyModel(R.drawable.me_and_andrew_2, "Spin"))
        items.add(MyModel(R.drawable.me_and_andrew_3, "Another Close Up of Us Together"))
        items.add(MyModel(R.drawable.me_and_andrew_4, "Holding Each Other"))
        items.add(MyModel(R.drawable.me_and_andrew_12, "Special"))


        return items
    }
}