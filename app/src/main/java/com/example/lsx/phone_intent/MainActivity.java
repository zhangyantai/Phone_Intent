package com.example.lsx.phone_intent;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button dial = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dial = (Button) findViewById(R.id.dial);
        dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri callnumber=Uri.parse("tel:1234567");
                Intent intentcallnumber = new Intent(Intent.ACTION_DIAL, callnumber);
                startActivity(intentcallnumber);
            }
        });

    }

}
