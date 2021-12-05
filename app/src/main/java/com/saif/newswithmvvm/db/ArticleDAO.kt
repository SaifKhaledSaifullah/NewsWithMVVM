package com.saif.newswithmvvm.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.saif.newswithmvvm.model.Article

@Dao
interface ArticleDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrUpdate(article: Article):Long

    @Query("SELECT * FROM articles")
    fun getAllArticles(): LiveData<List<Article>>
    @Delete
    suspend fun deleteArticle(article: Article)

}