package com.example.daystwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView autoAreaTv,autoStateTv;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoAreaTv = findViewById(R.id.autoAreaTv);
        autoStateTv = findViewById(R.id.autoStateTv);
        btnNext = findViewById(R.id.btnNext);

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("ABC","DEF","GHI","JKL","MNO"));

        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this,R.layout.list_item,R.id.tvItem,arrayList);
        autoAreaTv.setAdapter(adapter);
        autoStateTv.setAdapter(adapter);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Next", Toast.LENGTH_SHORT).show();
            }
        });
    }

}