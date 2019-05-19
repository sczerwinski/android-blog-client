package it.czerwinski.blog.domain

import io.reactivex.Observable

interface PostsRepository {
    val all: Observable<List<Post>>
    fun withTag(tag: String): Observable<List<Post>>
}
