package com.example.a2labdarb_1003;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */


@LargeTest
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.a2labdarb_1003", appContext.getPackageName());
    }

    @Rule
    public ExampleInstrumentedTest<MainActivity> activityRule = new ExampleInstrumentedTest<>(MainActivity.class);

    @Test
    public void testCountSymbols() {
        Espresso.onView(ViewMatchers.withId(R.id.editUserInput)).perform(ViewActions.typeText("Hello, World!"));
        Espresso.onView(ViewMatchers.withId(R.id.spinSelectionOptions)).perform(ViewActions.click());
        Espresso.onData(ViewMatchers.hasToString("Symbols")).perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.tvMain)).check(ViewAssertions.matches(ViewMatchers.withText("13")));
    }

    @Test
    public void testCountWords() {
        Espresso.onView(ViewMatchers.withId(R.id.editUserInput)).perform(ViewActions.typeText("This is a sample sentence."));
        Espresso.onView(ViewMatchers.withId(R.id.spinSelectionOptions)).perform(ViewActions.click());
        Espresso.onData(ViewMatchers.hasToString("Words")).perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.tvMain)).check(ViewAssertions.matches(ViewMatchers.withText("5")));
    }

}