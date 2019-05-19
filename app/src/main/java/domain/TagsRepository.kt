package it.czerwinski.blog.domain

import io.reactivex.Observable

interface TagsRepository {
    val all: Observable<List<Tag>>
}
