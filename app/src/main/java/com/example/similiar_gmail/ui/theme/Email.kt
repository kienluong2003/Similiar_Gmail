package com.example.similiar_gmail

data class Email(
    val senderName: String,
    val senderIcon: String,
    val emailTitle: String,
    val emailSnippet: String,
    val time: String,
    var isStarred: Boolean = false
)