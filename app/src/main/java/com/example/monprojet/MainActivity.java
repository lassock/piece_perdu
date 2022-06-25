package com.example.monprojet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayAdapter<CharSequence> adapter = new ArrayAdapter<>(this,



                R.layout.layout_item, getResources().getStringArray(R.array.labels_array));

        ((AutoCompleteTextView)findViewById(R.id.autocomplet_id)).setAdapter(adapter);
    }
}