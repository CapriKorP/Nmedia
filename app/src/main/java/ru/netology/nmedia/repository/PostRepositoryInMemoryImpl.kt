package ru.netology.nmedia.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ru.netology.nmedia.dto.Post

class PostRepositoryInMemoryImpl : PostRepository {
    private var post = Post(
        id = 1,
        author = "Нетология. Университет интернет-профессий будущего",
        content = "Познакомитесь с Kotlin — современным языком разработки Android-приложений. Он создан на основе Java, но более прост в работе. Узнаете, как перейти в разработке с Java на Kotlin в одном проекте, о совместимости языков, а также начнёте программировать на Kotlin.",
        published = "32 мая в 24:61",
    )

    private val data = MutableLiveData(post)
    override fun get(): LiveData<Post> = data
    override fun like() {
        post = post.copy(
            likedByMe = !post.likedByMe,
            likes = if (!post.likedByMe) post.likes + 1 else post.likes - 1
        )
        data.value = post
    }

    override fun share() {
        post = post.copy(
        share = post.share + 1
        )
        data.value = post
    }
}