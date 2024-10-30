package com.example.similiar_gmail

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmailAdapter(private val emailList: List<Email>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val senderIcon: TextView = itemView.findViewById(R.id.senderIcon)
        val senderName: TextView = itemView.findViewById(R.id.senderName)
        val emailTitle: TextView = itemView.findViewById(R.id.emailTitle)
        val emailSnippet: TextView = itemView.findViewById(R.id.emailSnippet)
        val emailTime: TextView = itemView.findViewById(R.id.emailTime)
        val starIcon: ImageView = itemView.findViewById(R.id.starIcon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_email, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emailList[position]

        holder.senderIcon.text = email.senderIcon
        holder.senderName.text = email.senderName
        holder.emailTitle.text = email.emailTitle
        holder.emailSnippet.text = email.emailSnippet
        holder.emailTime.text = email.time

        // Cập nhật biểu tượng ngôi sao dựa trên trạng thái đánh dấu
//        if (email.isStarred) {
//            holder.starIcon.setImageResource(R.drawable.ic_star_filled)
//        } else {
//            holder.starIcon.setImageResource(R.drawable.ic_star_border)
//        }

        // Nhấn vào biểu tượng ngôi sao để thay đổi trạng thái đánh dấu
        holder.starIcon.setOnClickListener {
            email.isStarred = !email.isStarred
            notifyItemChanged(position)
        }
    }

    override fun getItemCount() = emailList.size
}