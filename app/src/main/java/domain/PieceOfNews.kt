package it.czerwinski.blog.domain

import org.joda.time.LocalDate

data class PieceOfNews(
    val id: Int,
    val title: String,
    val abstract: String?,
    val url: String,
    val date: LocalDate
)
