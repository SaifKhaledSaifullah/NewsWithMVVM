package com.saif.newswithmvvm

data class NewsRespons(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)