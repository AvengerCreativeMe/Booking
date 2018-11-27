package com.example.iproz.mycreateapp

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.iproz.mycreateapp.callback.ClickRoomListenter
import com.example.iproz.mycreateapp.model.Class
import com.example.iproz.mycreateapp.model.CreateClass
import kotlinx.android.synthetic.main.card_view.view.*
import java.util.ArrayList

class Adapter(val classdata:ArrayList<CreateClass>,
              val context: Context,
              val callback: ClickRoomListenter
)
    : RecyclerView.Adapter<ViewHoder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHoder {
        val view= LayoutInflater.from(context).inflate(R.layout.card_view,parent,false)

        return ViewHoder(view)
    }

    override fun getItemCount(): Int {
        return classdata.size
    }

    override fun onBindViewHolder(holder: ViewHoder, position: Int) {
        holder.name.text = classdata[position].className
        holder.comment.text = classdata[position].comment
        holder.classimg.setImageResource(R.drawable.img_c)

        val code = classdata[position].passRoom
        holder.setHolderClicked(callback, code)
    }
}

class ViewHoder(itemView: View): RecyclerView.ViewHolder(itemView){
    //ตาม layout
    var name = itemView.tv_cardTitle!!
    var comment = itemView.tv_cardComment!!
    var classimg = itemView.cardimageView!!

    //send data to activity
    fun setHolderClicked(callback: ClickRoomListenter, code: String) {
        itemView.setOnClickListener {
            callback.onClickedItem(code)
        }
    }
}