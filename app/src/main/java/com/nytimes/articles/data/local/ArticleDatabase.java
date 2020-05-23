package com.nytimes.articles.data.local;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.nytimes.articles.data.local.dao.ArticleDao;
import com.nytimes.articles.data.local.entity.ArticleEntity;

/**
 * File Description
 * <p>
 * Author: Mohammad Saleem
 * Created: 23/05/2020
 * Modified: 23/05/2020
 */
@Database(entities = {ArticleEntity.class}, version = 2)
public abstract class ArticleDatabase extends RoomDatabase {
    public abstract ArticleDao articleDao();
}