package com.maithri.calculator;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalcActivity extends AppCompatActivity {

    Button seven, eight, nine, four, five, dot, six, one, two, three, addition, sub, mul, div, equal, zero, clear;
    TextView result,displayinput;
    int entered_value, entered_temp_value;
    double num, numtemp;
    String operator="";
    String displaying = "";
    String input = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        result = (TextView) findViewById(R.id.result);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        addition = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        equal = (Button) findViewById(R.id.equal);
        zero = (Button) findViewById(R.id.zero);
        dot = (Button) findViewById(R.id.dot);
        clear = (Button) findViewById(R.id.clear);
        displayinput=(TextView) findViewById(R.id.displayinput);

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //show 7
                show(7);

            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //show 8
                show(8);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //show 9
                show(9);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //show 4
                show(4);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //show 5
                show(5);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //show 6
                show(6);
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //show 1
                show(1);

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //show 2
                show(2);
            }
        });


        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //show 3
                show(3);
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // show 0
                show(0);
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // show .
                show(".");

            }
        });


        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                displaying=displaying+"=";
                displayinput.setText(displaying);
                calculate_result();
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //reset everything
                reset();
            }
        });


        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //assign and operations method should be called
                assign();
                operations();
                operator = "+";
                displaying=displaying+operator;
                displayinput.setText(displaying);


            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //assign and operations method should be called
                assign();
                operations();
                operator = "-";
                displaying=displaying+operator;
                displayinput.setText(displaying);

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //assign & operations method should be called
                assign();
                operations();
                operator = "*";
                displaying=displaying+operator;
                displayinput.setText(displaying);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // assign & operations method should be called
                assign();
                operations();
                operator = "/";
                displaying=displaying+operator;
                displayinput.setText(displaying);
            }
        });


    } //onCreate ends here

     public void show(int i) {

         input=input+i;
         displaying=displaying+i;
         displayinput.setText(displaying);
         result.setText(input);

    }

    public void show(String dotstring) {
        input = input + dotstring;
        displaying=displaying+dotstring;
        displayinput.setText(displaying);
        result.setText(input);

    }

    //operations function is called when +-*/ is clicked
    public void operations() {

        numtemp=num;
        num=0;
        input = "";
    }
    //assigning values to num from the input
    public void assign()
    {

        num = Double.valueOf(input).doubleValue();
    }

    //reset function

    public void reset() {
        input = "";
        displaying="";
        entered_value = 0;
        entered_temp_value = 0;
        num=0;
        numtemp=0;
        operator = "";
        result.setText("");
        displayinput.setText("");
    }

    //when equal to button is clicked, calculate_result function is called

    public void calculate_result() {

        assign();

        if (operator == "+") {


            num = numtemp + num;
            result.setText(""+num);
            input=String.valueOf(num);
            displaying=displaying+""+num;
            displayinput.setText(displaying);


        } else if (operator == "-") {
            num = numtemp - num;
            result.setText(""+num);
            input=String.valueOf(num);
            displaying=displaying+""+num;
            displayinput.setText(displaying);

        } else if (operator == "*") {
            num = numtemp * num;
            result.setText(""+num);
            input=String.valueOf(num);
            displaying=displaying+""+num;
            displayinput.setText(displaying);

        } else if (operator == "/") {
            num = numtemp / num;
            result.setText(""+num);
            input=String.valueOf(num);
            displaying=displaying+""+num;
            displayinput.setText(displaying);

        }

    }


    }
