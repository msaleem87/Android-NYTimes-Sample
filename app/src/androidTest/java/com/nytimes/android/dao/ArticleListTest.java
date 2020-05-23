package com.nytimes.android.dao;

import androidx.test.espresso.Espresso;
import androidx.test.rule.ActivityTestRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.nytimes.android.R;
import com.nytimes.android.view.activity.MainActivity;
import com.nytimes.android.view.fragment.ArticleListFragment;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;


@RunWith(AndroidJUnit4.class)
public class ArticleListTest {

    @Rule
    //Activity Test Rule for the activity which contains my login fragment
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void init() {
        //Initail setup method to load my fragment in the activity before beginning to test
        mActivityRule.getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragContainer, new ArticleListFragment()).commit();
    }

    @Test
    public void OnRecyclerViewClick() throws InterruptedException {
        //Perform type action on the view with id as email
        Espresso.onView(withId(R.id.recyclerView)).perform(click());

    }

    @Test
    public void onSearchClick(){
        Espresso.onView(withId(R.id.action_search)).perform(click());

    }
}