package com.ssq.androidviewstub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private ViewStub viewStub;
    private View stubView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        viewStub = findViewById(R.id.viewStub);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (stubView == null) {
                    if (viewStub.getParent() != null) {
                        stubView = viewStub.inflate();
                    }
                }

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
//                        stubView.setVisibility(View.GONE);
                    }
                }, 1500);
            }
        });

    }
}
