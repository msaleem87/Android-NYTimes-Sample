package com.nytimes.articles.databinding;
import com.nytimes.articles.R;
import com.nytimes.articles.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemArticleListBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView, 4);
    }
    // views
    @NonNull
    public final android.widget.TextView authorsTxt;
    @NonNull
    public final de.hdodenhof.circleimageview.CircleImageView imageView;
    @NonNull
    private final android.support.v7.widget.CardView mboundView0;
    @NonNull
    public final android.widget.TextView timeTxt;
    @NonNull
    public final android.widget.TextView titleTxt;
    // variables
    @Nullable
    private com.nytimes.articles.data.local.entity.ArticleEntity mArticle;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemArticleListBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds);
        this.authorsTxt = (android.widget.TextView) bindings[2];
        this.authorsTxt.setTag(null);
        this.imageView = (de.hdodenhof.circleimageview.CircleImageView) bindings[4];
        this.mboundView0 = (android.support.v7.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.timeTxt = (android.widget.TextView) bindings[3];
        this.timeTxt.setTag(null);
        this.titleTxt = (android.widget.TextView) bindings[1];
        this.titleTxt.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.article == variableId) {
            setArticle((com.nytimes.articles.data.local.entity.ArticleEntity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setArticle(@Nullable com.nytimes.articles.data.local.entity.ArticleEntity Article) {
        this.mArticle = Article;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.article);
        super.requestRebind();
    }
    @Nullable
    public com.nytimes.articles.data.local.entity.ArticleEntity getArticle() {
        return mArticle;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String articleTitle = null;
        java.lang.String articleAuthors = null;
        java.lang.String articlePublishedDate = null;
        com.nytimes.articles.data.local.entity.ArticleEntity article = mArticle;

        if ((dirtyFlags & 0x3L) != 0) {



                if (article != null) {
                    // read article.title
                    articleTitle = article.getTitle();
                    // read article.authors
                    articleAuthors = article.getAuthors();
                    // read article.publishedDate
                    articlePublishedDate = article.getPublishedDate();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.authorsTxt, articleAuthors);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.timeTxt, articlePublishedDate);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.titleTxt, articleTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemArticleListBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemArticleListBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemArticleListBinding>inflate(inflater, com.nytimes.articles.R.layout.item_article_list, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemArticleListBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemArticleListBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.nytimes.articles.R.layout.item_article_list, null, false), bindingComponent);
    }
    @NonNull
    public static ItemArticleListBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemArticleListBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_article_list_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemArticleListBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): article
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}