package com.tp.tse.gpa;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity {
    private Button buttonSave;
    private EditText editTextName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        init();
    }

    private void init(){
        buttonSave = findViewById(R.id.activity_form_button);
        editTextName = findViewById(R.id.activity_form_edittext_name);
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });
    }

    private void saveData() {
        String name = editTextName.getText().toString();

        if (!name.isEmpty()){
            DataManager.getInstance().addName(name);
        }

        finish();
    }
}
