package com.example.administrator.myapplication;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private RelativeLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //更改提交测试
        initView();
    }

    public void click(View view)
    {
        if (view.getId() == R.id.fab_search)
        Snackbar.make(textView,"Snack bar",Snackbar.LENGTH_SHORT)
                .setAction("Action", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this,"Action",Toast.LENGTH_SHORT).show();
                    }
                })
                .setActionTextColor(Color.GREEN)
                .show();
        else if (view.getId() == R.id.constraint)
        startActivity(CoordinatorActivity.newCreate(MainActivity.this));
    }


    private void initView() {
        //变为蓝墨色
        textView = (TextView) findViewById(R.id.text);
        constraintLayout = (RelativeLayout) findViewById(R.id.constraint);
    }

    public void navigationClick(View view)
    {
        startActivity(NavigationActivity.createIntent(MainActivity.this));
    }

}
