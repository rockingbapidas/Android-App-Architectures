package com.bapidas.news.data.db.dao;

import android.database.Cursor;
import androidx.paging.DataSource;
import androidx.paging.DataSource.Factory;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.paging.LimitOffsetDataSource;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.bapidas.news.ui.model.Article;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NewsArticlesDao_Impl implements NewsArticlesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Article> __insertionAdapterOfArticle;

  private final EntityInsertionAdapter<Article> __insertionAdapterOfArticle_1;

  private final EntityDeletionOrUpdateAdapter<Article> __deletionAdapterOfArticle;

  private final EntityDeletionOrUpdateAdapter<Article> __updateAdapterOfArticle;

  public NewsArticlesDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfArticle = new EntityInsertionAdapter<Article>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Article` (`publishedAt`,`title`,`description`,`urlToImage`,`sourceName`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Article value) {
        if (value.getPublishedAt() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getPublishedAt());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        if (value.getUrlToImage() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getUrlToImage());
        }
        if (value.getSourceName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getSourceName());
        }
      }
    };
    this.__insertionAdapterOfArticle_1 = new EntityInsertionAdapter<Article>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Article` (`publishedAt`,`title`,`description`,`urlToImage`,`sourceName`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Article value) {
        if (value.getPublishedAt() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getPublishedAt());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        if (value.getUrlToImage() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getUrlToImage());
        }
        if (value.getSourceName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getSourceName());
        }
      }
    };
    this.__deletionAdapterOfArticle = new EntityDeletionOrUpdateAdapter<Article>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Article` WHERE `publishedAt` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Article value) {
        if (value.getPublishedAt() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getPublishedAt());
        }
      }
    };
    this.__updateAdapterOfArticle = new EntityDeletionOrUpdateAdapter<Article>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Article` SET `publishedAt` = ?,`title` = ?,`description` = ?,`urlToImage` = ?,`sourceName` = ? WHERE `publishedAt` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Article value) {
        if (value.getPublishedAt() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getPublishedAt());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        if (value.getUrlToImage() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getUrlToImage());
        }
        if (value.getSourceName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getSourceName());
        }
        if (value.getPublishedAt() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPublishedAt());
        }
      }
    };
  }

  @Override
  public long insert(final Article obj) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfArticle.insertAndReturnId(obj);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Long> insert(final Article... obj) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfArticle_1.insertAndReturnIdsList(obj);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Long> insert(final List<? extends Article> obj) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfArticle.insertAndReturnIdsList(obj);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int delete(final Article obj) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__deletionAdapterOfArticle.handle(obj);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int delete(final List<? extends Article> obj) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__deletionAdapterOfArticle.handleMultiple(obj);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int update(final Article obj) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfArticle.handle(obj);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int update(final List<? extends Article> obj) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfArticle.handleMultiple(obj);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public DataSource.Factory<Integer, Article> getNewsArticles() {
    final String _sql = "SELECT * FROM Article";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new DataSource.Factory<Integer, Article>() {
      @Override
      public LimitOffsetDataSource<Article> create() {
        return new LimitOffsetDataSource<Article>(__db, _statement, false , "Article") {
          @Override
          protected List<Article> convertRows(Cursor cursor) {
            final int _cursorIndexOfPublishedAt = CursorUtil.getColumnIndexOrThrow(cursor, "publishedAt");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(cursor, "title");
            final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(cursor, "description");
            final int _cursorIndexOfUrlToImage = CursorUtil.getColumnIndexOrThrow(cursor, "urlToImage");
            final int _cursorIndexOfSourceName = CursorUtil.getColumnIndexOrThrow(cursor, "sourceName");
            final List<Article> _res = new ArrayList<Article>(cursor.getCount());
            while(cursor.moveToNext()) {
              final Article _item;
              final String _tmpPublishedAt;
              _tmpPublishedAt = cursor.getString(_cursorIndexOfPublishedAt);
              final String _tmpTitle;
              _tmpTitle = cursor.getString(_cursorIndexOfTitle);
              final String _tmpDescription;
              _tmpDescription = cursor.getString(_cursorIndexOfDescription);
              final String _tmpUrlToImage;
              _tmpUrlToImage = cursor.getString(_cursorIndexOfUrlToImage);
              final String _tmpSourceName;
              _tmpSourceName = cursor.getString(_cursorIndexOfSourceName);
              _item = new Article(_tmpPublishedAt,_tmpTitle,_tmpDescription,_tmpUrlToImage,_tmpSourceName);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }

  @Override
  public int getNewsArticlesCount() {
    final String _sql = "SELECT COUNT(publishedAt) FROM Article";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
