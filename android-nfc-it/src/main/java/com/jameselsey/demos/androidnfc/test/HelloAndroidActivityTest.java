package com.jameselsey.demos.androidnfc.test;

import android.test.ActivityInstrumentationTestCase2;
import com.jameselsey.demos.androidnfc.*;

public class HelloAndroidActivityTest extends ActivityInstrumentationTestCase2<HelloAndroidActivity> {

    public HelloAndroidActivityTest() {
        super(HelloAndroidActivity.class); 
    }

    public void testActivity() {
        HelloAndroidActivity activity = getActivity();
        assertNotNull(activity);
    }
}

