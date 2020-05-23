package com.nytimes.articles.databinding;
import com.nytimes.articles.R;
import com.nytimes.articles.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentArticleDetailsBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.loadingProgress, 1);
        sViewsWithIds.put(R.id.textTitle, 2);
        sViewsWithIds.put(R.id.textPublishedDate, 3);
        sViewsWithIds.put(R.id.textContent, 4);
    }
    // views
    @NonNull
    public final android.widget.ProgressBar loadingProgress;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    public final android.widget.TextView textContent;
    @NonNull
    public final android.widget.TextView textPublishedDate;
    @NonNull
    public final android.widget.TextView textTitle;
    // variables
    @Nullable
    private com.nytimes.articles.viewmodel.ArticleDetailsViewModel mArticleDetailViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentArticleDetailsBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds);
        this.loadingProgress = (android.widget.ProgressBar) bindings[1];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textContent = (android.widget.TextView) bindings[4];
        this.textPublishedDate = (android.widget.TextView) bindings[3];
        this.textTitle = (android.widget.TextView) bindings[2];
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
        if (BR.articleDetailViewModel == variableId) {
            setArticleDetailViewModel((com.nytimes.articles.viewmodel.ArticleDetailsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setArticleDetailViewModel(@Nullable com.nytimes.articles.viewmodel.ArticleDetailsViewModel ArticleDetailViewModel) {
        this.mArticleDetailViewModel = ArticleDetailViewModel;
    }
    @Nullable
    public com.nytimes.articles.viewmodel.ArticleDetailsViewModel getArticleDetailViewModel() {
        return mArticleDetailViewModel;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static FragmentArticleDetailsBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static FragmentArticleDetailsBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<FragmentArticleDetailsBinding>inflate(inflater, com.nytimes.articles.R.layout.fragment_article_details, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static FragmentArticleDetailsBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static FragmentArticleDetailsBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.nytimes.articles.R.layout.fragment_article_details, null, false), bindingComponent);
    }
    @NonNull
    public static FragmentArticleDetailsBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static FragmentArticleDetailsBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/fragment_article_details_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new FragmentArticleDetailsBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): articleDetailViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}