package it.czerwinski.blog.domain

import io.reactivex.Observable

interface NewsRepository {
    val all: Observable<List<PieceOfNews>>
}
