package com.nytimes.articles.databinding;
import com.nytimes.articles.R;
import com.nytimes.articles.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentListArticlesBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.loginProgress, 3);
    }
    // views
    @NonNull
    public final android.widget.TextView errorText;
    @NonNull
    public final android.widget.ProgressBar loginProgress;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    public final android.support.v7.widget.RecyclerView recyclerView;
    // variables
    @Nullable
    private com.nytimes.articles.data.remote.Resource mResource;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentListArticlesBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds);
        this.errorText = (android.widget.TextView) bindings[1];
        this.errorText.setTag(null);
        this.loginProgress = (android.widget.ProgressBar) bindings[3];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.recyclerView = (android.support.v7.widget.RecyclerView) bindings[2];
        this.recyclerView.setTag(null);
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
        if (BR.resource == variableId) {
            setResource((com.nytimes.articles.data.remote.Resource) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setResource(@Nullable com.nytimes.articles.data.remote.Resource Resource) {
        this.mResource = Resource;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.resource);
        super.requestRebind();
    }
    @Nullable
    public com.nytimes.articles.data.remote.Resource getResource() {
        return mResource;
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
        java.lang.String resourceMessage = null;
        com.nytimes.articles.data.remote.Resource resource = mResource;

        if ((dirtyFlags & 0x3L) != 0) {



                if (resource != null) {
                    // read resource.message
                    resourceMessage = resource.getMessage();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.errorText, resourceMessage);
            com.nytimes.articles.databinding.ListBindingAdapter.setResource(this.recyclerView, resource);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static FragmentListArticlesBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static FragmentListArticlesBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<FragmentListArticlesBinding>inflate(inflater, com.nytimes.articles.R.layout.fragment_list_articles, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static FragmentListArticlesBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static FragmentListArticlesBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.nytimes.articles.R.layout.fragment_list_articles, null, false), bindingComponent);
    }
    @NonNull
    public static FragmentListArticlesBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static FragmentListArticlesBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/fragment_list_articles_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new FragmentListArticlesBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): resource
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}