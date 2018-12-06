package com.example.iproz.mycreateapp

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.iproz.mycreateapp.model.EventModel
import kotlinx.android.synthetic.main.calendar_card_view.view.*
import java.util.ArrayList

class CalendarAdapter(
    val classdata: ArrayList<EventModel>,
    val context: Context
//    ,val callback: ClickRoomListenter
)

    : RecyclerView.Adapter<ViewHolder>() {

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: ViewHolder2, position: Int) {
        holder.user.text = classdata[position].user
        holder.date.text = classdata[position].date
        holder.describe.text = classdata[position].describe
        holder.timeStart.text = classdata[position].timeStart
        holder.timeEnd.text = classdata[position].timeEnd

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.calendar_card_view, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return classdata.size
    }

}
//        val code = classdata[position].passRoom
//        holder.setHolderClicked(callback, code)

class ViewHolder2(itemView: View) : RecyclerView.ViewHolder(itemView) {
    //ตาม layout
    var timeStart = itemView.tv_cardTimeStart!!
    var timeEnd = itemView.tv_cardTimeEnd!!
    var date = itemView.tv_cardDate!!
    var describe = itemView.tv_cardDetail!!
    var user = itemView.tv_cardUser!!

//    //send data to activity
//    fun setHolderClicked(callback: ClickRoomListenter, code: String) {
//        itemView.setOnClickListener {
//            callback.onClickedItem(code)
//        }
//    }
}