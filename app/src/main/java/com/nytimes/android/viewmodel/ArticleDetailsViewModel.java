package com.nytimes.android.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.nytimes.android.data.local.entity.ArticleEntity;
import com.nytimes.android.data.remote.repository.ArticleRepository;
import com.nytimes.android.utils.SingleLiveEvent;
import com.nytimes.android.view.callbacks.ResponseListener;

import javax.inject.Inject;

/**
 * ArticleDetails view model
 * <p>
 * Author: Mohammad Saleem
 * Created: 23/05/2020
 * Modified: 23/05/2020
 */

public class ArticleDetailsViewModel extends ViewModel {

    private String url;

    private ArticleRepository articleRepository;

    private MutableLiveData<ArticleEntity> articleEntityMutableLiveData = new MutableLiveData<>();

    private SingleLiveEvent<Void> errorMessageReceived = new SingleLiveEvent<>();

    public MutableLiveData<ArticleEntity> getArticleEntityMutableLiveData() {
        return articleEntityMutableLiveData;
    }

    public void setArticleEntityMutableLiveData(MutableLiveData<ArticleEntity> articleEntityMutableLiveData) {
        this.articleEntityMutableLiveData = articleEntityMutableLiveData;
    }

    public SingleLiveEvent<Void> getErrorMessageReceived() {
        return errorMessageReceived;
    }

    public void setErrorMessageReceived(SingleLiveEvent<Void> errorMessageReceived) {
        this.errorMessageReceived = errorMessageReceived;
    }

    @Inject
    ArticleDetailsViewModel(ArticleRepository artRepository) {
        this.articleRepository = artRepository;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void loadArticleDetails(){

        if(null != articleRepository) {
            articleRepository.loadArticleDetails(url, new ResponseListener() {
                @Override
                public void onSuccess(ArticleEntity data) {
                    articleEntityMutableLiveData.setValue(data);
                }

                @Override
                public void onFailure(String message) {
                    // Send event to UI to show thw error
                    errorMessageReceived.call();
                }
            });
        }
    }
}
