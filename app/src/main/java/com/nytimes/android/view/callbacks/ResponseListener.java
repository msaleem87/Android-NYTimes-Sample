package com.nytimes.android.view.callbacks;

import com.nytimes.android.data.local.entity.ArticleEntity;

public interface ResponseListener {

    void onSuccess(ArticleEntity data);
    void onFailure(String message);
}
