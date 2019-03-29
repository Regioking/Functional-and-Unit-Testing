package cn.edu.cqu.myapplication;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.util.Log;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

import static org.junit.Assert.*;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);
    private MainActivity mainActivity=null;
    @Before
    public void setUp() throws Exception {
        mainActivity = activityTestRule.getActivity();

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void onCreate() {
        Log.d("tag","onCreate()");
    }

    @Test
    public void buttonClicked() {
        Log.d("tag","BTN was clicked");
    }
    @Test
    public void testClickedButton(){
        Espresso.onView(withId(R.id.button)).perform(click());
    }
}