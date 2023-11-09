package com.example.assignment1_calculator;

import androidx.appcompat.app.AppCompatActivity;
import com.example.assignment1_calculator.Calculator; // Adjust the package name if necessary


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    public List<String> calculator;

    Calculator cal = new Calculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button btn1_pushed, btn2_pushed, btn3_pushed, btn4_pushed, btn5_pushed, btn6_pushed,
                btn7_pushed, btn8_pushed, btn9_pushed, btn0_pushed, add_btn_pushed, sub_btn_pushed, mul_btn_pushed,
                div_btn_pushed, c_btn_pushed, eql_btn_pushed, next_btn_pushed;
        TextView result_display;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.app_name); // R.string.app_name is the app name string resource

        btn1_pushed = findViewById(R.id.btn1);
        btn2_pushed = findViewById(R.id.btn2);
        btn3_pushed = findViewById(R.id.btn3);
        btn4_pushed = findViewById(R.id.btn4);
        btn5_pushed = findViewById(R.id.btn5);
        btn6_pushed = findViewById(R.id.btn6);
        btn7_pushed = findViewById(R.id.btn7);
        btn8_pushed = findViewById(R.id.btn8);
        btn9_pushed = findViewById(R.id.btn9);
        btn0_pushed = findViewById(R.id.btn0);
        add_btn_pushed = findViewById(R.id.add_btn);
        sub_btn_pushed = findViewById(R.id.sub_btn);
        mul_btn_pushed = findViewById(R.id.mul_btn);
        div_btn_pushed = findViewById(R.id.div_btn);
        c_btn_pushed = findViewById(R.id.clear_btn);
        eql_btn_pushed = findViewById(R.id.eql_btn);
        next_btn_pushed = findViewById(R.id.next_btn);
        result_display = findViewById(R.id.display);

        calculator = new ArrayList<>();

        btn1_pushed.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.add(btn1_pushed.getText().toString());
                Log.d("calculator","Button 1 has been pushed."
                );
            }
        }));
        btn2_pushed.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.add(btn2_pushed.getText().toString());
                Log.d("calculator","Button 2 has been pushed.");
            }
        }));
        btn3_pushed.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.add(btn3_pushed.getText().toString());
                Log.d("calculator","Button 3 has been pushed.");
            }
        }));
        btn4_pushed.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.add(btn4_pushed.getText().toString());
                Log.d("calculator","Button 4 has been pushed.");
            }
        }));
        btn5_pushed.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.add(btn5_pushed.getText().toString());
                Log.d("calculator","Button 5 has been pushed.");
            }
        }));
        btn6_pushed.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.add(btn6_pushed.getText().toString());
                Log.d("calculator","Button 6 has been pushed.");
            }
        }));
        btn7_pushed.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.add(btn7_pushed.getText().toString());
                Log.d("calculator","Button 7 has been pushed.");
            }
        }));
        btn8_pushed.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.add(btn8_pushed.getText().toString());
                Log.d("calculator","Button 8 has been pushed.");
            }
        }));
        btn9_pushed.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.add(btn9_pushed.getText().toString());
                Log.d("calculator","Button 9 has been pushed.");
            }
        }));
        btn0_pushed.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.add(btn0_pushed.getText().toString());
                Log.d("calculator","Button 0 has been pushed.");
            }
        }));
        add_btn_pushed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.add(add_btn_pushed.getText().toString());
                Log.d("calculator","Add button has been pushed.");
            }
        });
        sub_btn_pushed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.add(sub_btn_pushed.getText().toString());
                Log.d("calculator","Subtraction button has been pushed.");
            }
        });
        mul_btn_pushed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.add(mul_btn_pushed.getText().toString());
                Log.d("calculator","Multiply button has been pushed.");
            }
        });
        div_btn_pushed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.add(div_btn_pushed.getText().toString());
                Log.d("calculator","Division button has been pushed.");
            }
        });
        c_btn_pushed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //calculator.add(c_btn_pushed.getText().toString());
                calculator.clear();
                result_display.setText("");
                Log.d("calculator","Clear button has been pushed.");
            }
        });
        eql_btn_pushed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculator.add(eql_btn_pushed.getText().toString());

                String result = String.join("",calculator);
                result_display.setText(result);

                Log.d("calculator","Equal button has been pushed.");
                Log.d("calculator","List:" + result);

                int calculationResult = cal.calculate(result);
                Log.d("calculator", "Calculation Result: " + calculationResult);
                calculator.add(Integer.toString(calculationResult));
                String fullCalculation = String.join("", calculator);
                result_display.setText(fullCalculation);
            }
        });
        next_btn_pushed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("calculator","Next screen button has been pushed.");
            }
        });
    }

}