package com.example.solomon.homework2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void check(View view){
        EditText nameinput=(EditText)findViewById(R.id.input);
        String name=nameinput.getText().toString();

        TextView tv=(TextView)findViewById(R.id.show);

        if(name.isEmpty()){
            tv.setText("please input is required");
        }else if(name.equals("solomon")){
            tv.setText("You are welcome to SOLOMON Page!");
        }else{
            tv.setText("please type the word solomon ");
        }
    }


}
