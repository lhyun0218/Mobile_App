package com.example.shun;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        }

        public void onClicked(View v) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-7684-6515"));
            startActivity(intent);
        }
}