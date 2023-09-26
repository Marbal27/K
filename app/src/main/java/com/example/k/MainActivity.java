package com.example.k;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText a,b,answer;
    TextView opr, zero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=findViewById(R.id.editTextNumber3);
        b=findViewById(R.id.editTextNumber4);
        answer=findViewById(R.id.editTextNumber5);
        opr=findViewById(R.id.textView2);
        zero=findViewById(R.id.textView4);
        zero.setVisibility(View.INVISIBLE);
    }

    public void plus_btn(View view){
        int a_number=Integer.parseInt(a.getText().toString());
        int b_number=Integer.parseInt(b.getText().toString());
        int c=a_number+b_number;
        answer.setText(Integer.toString(c));
        opr.setText("+");
    }
    public void min_btn(View view){
        int a_number=Integer.parseInt(a.getText().toString());
        int b_number=Integer.parseInt(b.getText().toString());
        int c=a_number-b_number;
        answer.setText(Integer.toString(c));
        opr.setText("-");
    }
    public void del_btn(View view){
        int a_number=Integer.parseInt(a.getText().toString());
        int b_number=Integer.parseInt(b.getText().toString());

        if (b_number==0){
            zero.setVisibility(View.VISIBLE);
        }
        else{
            int c=a_number/b_number;
            answer.setText(Integer.toString(c));
        }

        opr.setText("/");
    }
    public void umn_btn(View view){
        int a_number=Integer.parseInt(a.getText().toString());
        int b_number=Integer.parseInt(b.getText().toString());
        int c=a_number*b_number;
        answer.setText(Integer.toString(c));
        opr.setText("*");
    }

    public void erase(View view){
        a.setText("");
        b.setText("");
        answer.setText("");
    }
}