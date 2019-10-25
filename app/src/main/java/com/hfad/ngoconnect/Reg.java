package com.hfad.ngoconnect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class Reg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
    }

    public void voldon(View view) {
        Intent intent1= new Intent(getBaseContext(), RegisterNewUserss.class);

        startActivity(intent1);
    }

    public void ngoreg(View view) {
        Intent intent2 = new Intent(getBaseContext(), RegisterNewUserss.class);

        startActivity(intent2);
    }
}
