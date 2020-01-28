package com.example.programowanie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private Button addText;
    private Button sortText;
    private EditText addFirstNameET;
    private EditText addNameET;
    private ListView listView;
    ArrayList<String> listName = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        addText = (Button) findViewById(R.id.buttonAdd);
        addFirstNameET = (EditText) findViewById(R.id.editTextFirstName);
        addNameET = (EditText) findViewById(R.id.editTextName);
        listView = (ListView) findViewById(R.id.listview);
        sortText = (Button) findViewById(R.id.buttonSort);

        Show();

        addText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(addText.getText() != null)
                {
                    String name;

                    name = addFirstNameET.getText().toString() + " " + addNameET.getText().toString();

                    listName.add(name);




                }
            }
        });
        sortText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SortAndShow();

            }
        });

    }

    void Show()
    {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, listName);
        listView.setAdapter(arrayAdapter);
    }
    void SortAndShow()
    {
        Collections.sort(listName);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, listName);
        listView.setAdapter(arrayAdapter);
    }
}
