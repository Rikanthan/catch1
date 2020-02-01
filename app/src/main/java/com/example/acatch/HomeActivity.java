package com.example.acatch;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);








    }

    public  void level1(View v)
    {
        Intent intent=new Intent(this, level1.class);
        startActivity(intent);
    }
    public  void level2(View v)
    {
        Intent intent=new Intent(this, level2.class);
        startActivity(intent);
    }
    public  void level3(View v)
    {
        Intent intent=new Intent(this, level3.class);
        startActivity(intent);
    }


}
