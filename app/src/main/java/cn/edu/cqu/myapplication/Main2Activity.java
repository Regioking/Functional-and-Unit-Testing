package cn.edu.cqu.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private Button button2;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buttonClicked();
    }

    protected void buttonClicked(){
        button2  = findViewById(R.id.button2);
        editText = findViewById(R.id.editText);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String text =  editText.getText().toString();
                Toast.makeText(Main2Activity.this,text,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
