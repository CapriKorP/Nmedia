package ru.netology.nmedia.dto

   data class Post(
       val id: Long,
       val author: String,
       val content: String,
       val published: String,
       val likes: Int,
       val shared: Int,
       val viewed: Int,
       val likedByMe: Boolean,
       val videoURL: String,
       val videoViewed: Int
   )