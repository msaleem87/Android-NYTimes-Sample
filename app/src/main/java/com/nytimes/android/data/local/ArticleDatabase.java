package com.nytimes.android.data.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.nytimes.android.data.local.dao.ArticleDao;
import com.nytimes.android.data.local.entity.ArticleEntity;

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