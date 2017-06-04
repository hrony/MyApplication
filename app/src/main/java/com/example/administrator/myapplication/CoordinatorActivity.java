package com.example.administrator.myapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class CoordinatorActivity extends AppCompatActivity {
    private FloatingActionButton fab;
    public static Intent newCreate(Context context)
    {
        Intent intent = new Intent(context,CoordinatorActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator);
        initView();
    }

    private void initView() {
        fab = (FloatingActionButton) findViewById(R.id.fab);
    }
    public void click(View view)
    {
        Snackbar.make(view,"Coordinator",Snackbar.LENGTH_SHORT)
                .setActionTextColor(Color.GREEN)
                .setText("点击")
                .setAction("事件", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(CoordinatorActivity.this,"你好",Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }
}
