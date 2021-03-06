package com.nytimes.articles.view.base;

import android.support.v7.widget.RecyclerView;

import java.util.List;

/**
 * Generic Base adapter for recycler views
 * <p>
 * Author: Mohammad Saleem
 * Created: 23/05/2020
 * Modified: 23/05/2020
 */
public abstract class BaseAdapter<T extends RecyclerView.ViewHolder, D> extends RecyclerView.Adapter<T>{

    public abstract void setData(List<D> data);
}