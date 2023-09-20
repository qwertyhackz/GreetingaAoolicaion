package com.example.greetingaaoolicaion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    Button btn;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      name = findViewById(R.id.name);
      btn = findViewById(R.id.btn);
      title = findViewById(R.id.title);

btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String inputName=name.getText().toString();

        Toast.makeText(MainActivity.this,
                "Welcome "+inputName+" to our App.",
                     Toast.LENGTH_SHORT).show();


    }
});



    }
}