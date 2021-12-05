package com.saif.newswithmvvm.model

data class NewsRespons(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)