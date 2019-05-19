package it.czerwinski.blog.domain

import io.reactivex.Observable

interface ProjectsRepository {
    val all: Observable<List<Project>>
}
