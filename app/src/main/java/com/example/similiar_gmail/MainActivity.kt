package com.example.similiar_gmail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        // Danh sách email giả lập
        val emailList = listOf(
            Email("Edurila.com", "E", "Bestselling courses", "Are you looking to learn web designing?", "12:34 PM"),
            Email("Chris Abad", "C", "Campaign Monitor", "Help make Campaign Monitor better.", "11:22 AM"),
            Email("Tuto.com", "T", "Free tutorials", "Learn programming, design, and more.", "11:04 AM"),
            Email("Support", "S", "Service updates", "Service updates and changes.", "10:26 AM"),
            Email("Matt from Ionic", "M", "New Ionic Creator", "Announcing the all-new Creator.", "9:15 AM")
        )

        // Khởi tạo adapter và gán vào RecyclerView
        val adapter = EmailAdapter(emailList)
        recyclerView.adapter = adapter
    }
}