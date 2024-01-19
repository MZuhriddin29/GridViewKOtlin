package com.example.gridviewkotlin

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import java.text.FieldPosition

class ImageAdapter(private val mContext: Context) : BaseAdapter() {

    private var mTI = arrayOf(
    R.drawable.image1, R.drawable.image2, R.drawable.image3,
    R.drawable.image3, R.drawable.image1, R.drawable.image2,
    R.drawable.image2, R.drawable.image3, R.drawable.image1

    )

    override fun getCount(): Int {
        return mTI.size
    }


    override fun getItem(positoin: Int): Any? {
        return null
    }

    override fun getItemId(positoin: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val imageView : ImageView
        if (convertView == null){
            imageView = ImageView(mContext)
            imageView.scaleType = ImageView.ScaleType.CENTER_CROP
            imageView.layoutParams = AbsListView.LayoutParams(500,500)

            imageView.setPadding(1,1,1,1)
        }else{
            imageView = convertView as ImageView
        }

        imageView.setImageResource(mTI[position])
        return imageView


    }
}