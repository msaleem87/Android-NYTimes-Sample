package com.nytimes.articles.data.local.dao;

import android.arch.lifecycle.ComputableLiveData;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.InvalidationTracker.Observer;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import android.support.annotation.NonNull;
import com.nytimes.articles.data.local.entity.ArticleEntity;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@SuppressWarnings("unchecked")
public class ArticleDao_Impl implements ArticleDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfArticleEntity;

  public ArticleDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfArticleEntity = new EntityInsertionAdapter<ArticleEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `articles`(`id`,`title`,`authors`,`publishedDate`,`url`,`content`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ArticleEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getAuthors() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAuthors());
        }
        if (value.getPublishedDate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPublishedDate());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getUrl());
        }
        if (value.getContent() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getContent());
        }
      }
    };
  }

  @Override
  public void saveArticles(List<ArticleEntity> articleEntities) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfArticleEntity.insert(articleEntities);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<ArticleEntity>> loadPopularArticles() {
    final String _sql = "SELECT * FROM articles";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new ComputableLiveData<List<ArticleEntity>>() {
      private Observer _observer;

      @Override
      protected List<ArticleEntity> compute() {
        if (_observer == null) {
          _observer = new Observer("articles") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
          final int _cursorIndexOfAuthors = _cursor.getColumnIndexOrThrow("authors");
          final int _cursorIndexOfPublishedDate = _cursor.getColumnIndexOrThrow("publishedDate");
          final int _cursorIndexOfUrl = _cursor.getColumnIndexOrThrow("url");
          final int _cursorIndexOfContent = _cursor.getColumnIndexOrThrow("content");
          final List<ArticleEntity> _result = new ArrayList<ArticleEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ArticleEntity _item;
            _item = new ArticleEntity();
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            _item.setId(_tmpId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            _item.setTitle(_tmpTitle);
            final String _tmpAuthors;
            _tmpAuthors = _cursor.getString(_cursorIndexOfAuthors);
            _item.setAuthors(_tmpAuthors);
            final String _tmpPublishedDate;
            _tmpPublishedDate = _cursor.getString(_cursorIndexOfPublishedDate);
            _item.setPublishedDate(_tmpPublishedDate);
            final String _tmpUrl;
            _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            _item.setUrl(_tmpUrl);
            final String _tmpContent;
            _tmpContent = _cursor.getString(_cursorIndexOfContent);
            _item.setContent(_tmpContent);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }
}
