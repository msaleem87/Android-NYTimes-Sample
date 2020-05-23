package com.nytimes.android.view.activity;

import android.os.Bundle;
import androidx.annotation.Nullable;
import android.view.MenuItem;

import com.nytimes.android.R;
import com.nytimes.android.databinding.ActivityMainBinding;
import com.nytimes.android.utils.FragmentUtils;
import com.nytimes.android.view.base.BaseActivity;
import com.nytimes.android.view.fragment.ArticleListFragment;

import static com.nytimes.android.utils.FragmentUtils.TRANSITION_NONE;
/**
 * MainActivity.
 * <p>
 * Author: Mohammad Saleem
 * Created: 23/05/2020
 * Modified: 23/05/2020
 */
public class MainActivity extends BaseActivity<ActivityMainBinding> {

    @Override
    public int getLayoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentUtils.replaceFragment(this, ArticleListFragment.newInstance(), R.id.fragContainer, false, TRANSITION_NONE);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return false;
    }
}
