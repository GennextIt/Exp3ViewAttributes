package com.gennextit.exp3viewattributes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RobolectricActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robo_electric);

        Button btnStartNextAct = (Button)findViewById(R.id.startNextActivity);
        Button btnShowToast = (Button)findViewById(R.id.showToast);

        btnStartNextAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RobolectricActivity.this,RobolectricSecondActivity.class));
            }
        });

        btnShowToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RobolectricActivity.this,"Hello world",Toast.LENGTH_LONG).show();
            }
        });
    }
}