package it.czerwinski.blog.domain

data class Project(
    val id: String,
    val title: String,
    val abstract: String?,
    val url: String
)
