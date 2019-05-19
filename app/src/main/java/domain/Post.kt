package it.czerwinski.blog.domain

import org.joda.time.LocalDate

data class Post(
    val id: String,
    val title: String,
    val abstract: String?,
    val imageUrl: String?,
    val tags: List<Tag>,
    val url: String,
    val date: LocalDate
)
