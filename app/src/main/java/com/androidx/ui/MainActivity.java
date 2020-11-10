package com.androidx.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.androidx.ui.adapter.SimpleHomeAdapter;

public class MainActivity extends AppCompatActivity {

    private final Context mContext = this;
    private final String[] mItems = {"SlidingTabLayout", "CommonTabLayout", "SegmentTabLayout"};
    private final Class<?>[] mClasses = {SlidingTabActivity.class, CommonTabActivity.class, SegmentTabActivity.class};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView lv = new ListView(mContext);
        lv.setCacheColorHint(Color.TRANSPARENT);
        lv.setFadingEdgeLength(0);
        lv.setAdapter(new SimpleHomeAdapter(mContext, mItems));

        lv.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(mContext, mClasses[position]);
            startActivity(intent);
        });
        setContentView(lv);
    }
}
