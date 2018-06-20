package com.lee.wheel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_date).setOnClickListener(this);
        findViewById(R.id.btn_password).setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
        case R.id.btn_date:
            startActivity(new Intent(this, WheelViewDateActivity.class));
            break;
            
        case R.id.btn_password:
            startActivity(new Intent(this, WheelViewPasswordActivity.class));
            break;
        }
    }
}
