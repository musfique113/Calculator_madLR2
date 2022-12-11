package com.clp.calclutarl5;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity  {

    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonPoint,buttonAdd,buttonSub,buttonMul,buttonReset,buttonEqual,buttonPercentage,buttonDiv,buttonSqroot;
    TextView eT;
    Float ValueOne,ValueTwo,result,ValueRoot;

    boolean Addition,Subtract,Multipication,Division,Percentage,Squreroot;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.btnZero);
        button1 = findViewById(R.id.btnOne);
        button2 = findViewById(R.id.btnTwo);
        button3 = findViewById(R.id.btnThree);
        button4 = findViewById(R.id.btnFour);
        button5 = findViewById(R.id.btnFive);
        button6 = findViewById(R.id.btnSix);
        button7 = findViewById(R.id.btnSeven);
        button8 = findViewById(R.id.btnEight);
        button9 = findViewById(R.id.btnNine);
        //non-traditional operation
        buttonSqroot = findViewById(R.id.btnSqureRoot);
        buttonPercentage = findViewById(R.id.btnPercentage);
        //working button
        buttonReset = findViewById(R.id.btnReset);
        buttonEqual = findViewById(R.id.btnEqual);
        buttonPoint = findViewById(R.id.btnPoint);
        //symol button
        buttonAdd = findViewById(R.id.btnAdd);
        buttonSub = findViewById(R.id.btnSub);
        buttonMul = findViewById(R.id.btnMul);
        buttonDiv = findViewById(R.id.btnDiv);



        //textView/editText
        eT = findViewById(R.id.eT);


        //EventListner for Numbers

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //adding button value in editText
                eT.setText(eT.getText() + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //adding button value in editText
                eT.setText(eT.getText() + "1");

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //adding button value in editText
                eT.setText(eT.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //adding button value in editText
                eT.setText(eT.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //adding button value in editText
                eT.setText(eT.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //adding button value in editText
                eT.setText(eT.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //adding button value in editText
                eT.setText(eT.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //adding button value in editText
                eT.setText(eT.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //adding button value in editText
                eT.setText(eT.getText() + "8");
            }
        });


        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //adding button value in editText
                eT.setText(eT.getText() + "9");
            }
        });

        //envent listner for hardbutton

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText("0");
            }
        });

        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText() + ".");
            }
        });

        //converting eT to string for calculation
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // convert string to float and set Ui null to get next input
                ValueOne = Float.parseFloat(eT.getText().toString());
                Addition = true;
                eT.setText(null);
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueOne = Float.parseFloat(eT.getText().toString());
                Subtract = true;
                eT.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueOne = Float.parseFloat(eT.getText().toString());
                Multipication = true;
                eT.setText(null);
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueOne = Float.parseFloat(eT.getText().toString());
                Division = true;
                eT.setText(null);
            }
        });

        //non-traditional operation
        //parcentage button
        buttonPercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueOne = Float.parseFloat(eT.getText().toString());
                Percentage = true;
                eT.setText(null);

            }
        });

        //Squreroot
        buttonSqroot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //first set hole number then press √(square root symbol)
                ValueRoot = Float.parseFloat(eT.getText().toString());
                Squreroot = true;
                //below two code is working if user dont want to click the equal button
//                result = (float) Double.parseDouble(String.valueOf(Math.sqrt(ValueRoot)));
//                eT.setText(String.valueOf(result));
            }
        });

        // all function goes here
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get second input and convert into float

                ValueTwo = Float.parseFloat(eT.getText().toString());

                if(Addition == true){
                    result = ValueOne + ValueTwo;
                    eT.setText(String.valueOf(result));
                    Addition = false;
                    Toast.makeText(getApplicationContext(),"Addition Successful",Toast.LENGTH_LONG).show();
                }
                if (Subtract == true){
                    result = ValueOne - ValueTwo ;
                    eT.setText(String.valueOf(result));
                    Subtract = false;
                    Toast.makeText(getApplicationContext(),"Subtraction Successful",Toast.LENGTH_LONG).show();
                }
                if(Multipication == true){
                    result = ValueOne * ValueTwo;
                    eT.setText(String.valueOf(result));
                    Multipication = false;
                    Toast.makeText(getApplicationContext(),"Multiplication Successful",Toast.LENGTH_LONG).show();
                }
                if (Division == true){
                    result = ValueOne / ValueTwo;
                    eT.setText(String.valueOf(result));
                    Division = false;
                    Toast.makeText(getApplicationContext(),"Division Successful",Toast.LENGTH_LONG).show();
                }
                if(Percentage == true){
                    result = ValueTwo / 100 * ValueOne ;
                    //parcantage of  = valeTwo
                    // joto parcent bahir korte chai = valueOne
                    //50 percent of 70 means first input 70 then % then 50
                    eT.setText(String.valueOf(result));
                    Percentage = false;
                    Toast.makeText(getApplicationContext(),"Percentage Successful",Toast.LENGTH_LONG).show();
                }
                if(Squreroot == true){
                    //first set hole number then press √(square root symbol)
                    result = (float) Float.parseFloat(String.valueOf(Math.sqrt(ValueRoot)));
                    eT.setText(String.valueOf(result));
                    Squreroot = false;
                    Toast.makeText(getApplicationContext(),"Squreroot Successful",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}