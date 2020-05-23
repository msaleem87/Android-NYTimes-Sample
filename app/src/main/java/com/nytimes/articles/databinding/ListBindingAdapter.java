package com.nytimes.articles.databinding;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;

import com.nytimes.articles.data.remote.Resource;
import com.nytimes.articles.view.base.BaseAdapter;

import java.util.List;

/**
 * Binding adapters
 * <p>
 * Author: Mohammad Saleem
 * Created: 23/05/2020
 * Modified: 23/05/2020
 */
final class ListBindingAdapter{

    private ListBindingAdapter(){
        // Private Constructor to hide the implicit one
    }

    @SuppressWarnings("unchecked")
    @BindingAdapter(value = "resource")
    public static void setResource(RecyclerView recyclerView, Resource resource){
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if(adapter == null)
            return;

        if(resource == null || resource.data == null)
            return;

        if(adapter instanceof BaseAdapter){
            ((BaseAdapter)adapter).setData((List) resource.data);
        }
    }

}
