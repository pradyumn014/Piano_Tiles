package com.example.android.pianotiles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle = getIntent().getExtras();
        int score=bundle.getInt("score");
        TextView myview=(TextView)findViewById(R.id.score);
        myview.setText(""+score);
    }
    public void gameplay(View view)
    {
        Intent someName = new Intent(Main2Activity.this, MainActivity.class);
        startActivity(someName);
        finish();
    }

}
