package com.clas.harsh.explicitintenter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText id,pass;
    Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id=(EditText)findViewById(R.id.id);
        pass=(EditText)findViewById(R.id.pass);
        login=(Button)findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("u_id",id.getText().toString());
                i.putExtra("u_pass",pass.getText().toString());
                startActivity(i);
            }
        });
    }
}