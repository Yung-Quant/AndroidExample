package com.example.shanekennedy.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //this will be called when the user presses send
    public void sendMessage(View view) {
        //create new intent object
        Intent intent = new Intent(this, DisplayMessage.class);
        //get information and parse it
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        //package your intent with data as necessary
        intent.putExtra(EXTRA_MESSAGE, message);
        //activate the intent
        startActivity(intent);
    }
}
