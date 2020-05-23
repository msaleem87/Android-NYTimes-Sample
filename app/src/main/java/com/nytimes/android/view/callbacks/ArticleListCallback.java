package com.nytimes.android.view.callbacks;

import com.nytimes.android.data.local.entity.ArticleEntity;

/**
 * File Description
 * <p>
 * Author: Mohammad Saleem
 * Created: 23/05/2020
 * Modified: 23/05/2020
 */
public interface ArticleListCallback {
    void onArticleClicked(ArticleEntity articleEntity);
}

