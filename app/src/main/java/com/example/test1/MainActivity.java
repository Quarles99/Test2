package com.example.test1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
//Renamed from PickActivity
    Button mSubmitButton;
    EditText mFirstNameEdit;

    //Listener for mSubmitButton that makes text displayed on mFirstNameEdit all lowercase

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSubmitButton = findViewById(R.id.mSubmitButton);
        mFirstNameEdit = findViewById(R.id.mFirstNameEdit);

        mFirstNameEdit.setText(getResources().getString(R.string.Secret));

        Toast.makeText(MainActivity.this, mFirstNameEdit.getText(), Toast.LENGTH_SHORT).show();

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFirstNameEdit.setText(mFirstNameEdit.getText().toString().toLowerCase());
            }
        });

    }

}
