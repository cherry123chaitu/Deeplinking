package com.example.deeplinking;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Uri uri=getIntent().getData();
        if(uri!=null){
            List<String > params=uri.getPathSegments();
            String id = params.get(params.size()-1);
            Toast.makeText(MainActivity.this, "id="+id, Toast.LENGTH_SHORT).show();
        }
    }
}