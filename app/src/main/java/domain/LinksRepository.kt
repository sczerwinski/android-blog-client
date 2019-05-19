package it.czerwinski.blog.domain

import io.reactivex.Observable

interface LinksRepository {
    val all: Observable<List<Link>>
}
