package com.jameselsey.demos.androidnfc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DefaultActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.defaultactivity);
    }

    public void writeTag(View v) {
        Intent i = new Intent(this, PlainTextTagWriter.class);
        startActivity(i);
    }
}

