package cn.edu.cqu.myapplication;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.util.Log;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

import static org.junit.Assert.*;

public class Main2ActivityTest {

    @Rule
    public ActivityTestRule<Main2Activity> activityTestRule =
            new ActivityTestRule<>(Main2Activity.class);
    private Main2Activity main2Activity=null;
    @Before
    public void setUp() throws Exception {
        main2Activity = activityTestRule.getActivity();
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
        Log.d("tag","BTN2 was clicked");
    }
    @Test
    public void testClickedButton(){
        Espresso.onView(withId(R.id.editText)).perform(typeText("123"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.button2)).perform(click());
    }
}