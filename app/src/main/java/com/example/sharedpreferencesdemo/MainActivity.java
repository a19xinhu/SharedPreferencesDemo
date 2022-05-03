package com.example.sharedpreferencesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button storePrefButton;
    private TextView labelTextView;
    private EditText inputEditView;
    private SharedPreferences myPreferenceRef;
    private SharedPreferences.Editor myPreferenceEditor;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myPreferenceRef = getPreferences(MODE_PRIVATE);

        myPreferenceEditor = myPreferenceRef.edit();

        String pref = myPreferenceRef.getString("GregerRef","Saknar data");

        labelTextView = findViewById(R.id.textLabel);
        labelTextView.setText(pref);
        inputEditView = findViewById(R.id.textInput);

        storePrefButton = findViewById(R.id.storePref);
        storePrefButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                labelTextView.setText(inputEditView.getText());
            }
        });
    }
}