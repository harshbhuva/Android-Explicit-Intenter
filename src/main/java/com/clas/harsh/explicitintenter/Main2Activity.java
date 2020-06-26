package com.clas.harsh.explicitintenter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

class Main2Activity extends AppCompatActivity {

    TextView box;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        box=(TextView)findViewById(R.id.box);
        box.setText("WELCOME \n"+getIntent().getExtras().get("u_id").toString());

    }

}
