package com.example.as_lesson1;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText entryField;
    TextView operationField;
    TextView resultField;
    String firstNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entryField = findViewById(R.id.entry_field);
        operationField = findViewById(R.id.operation_field);
        resultField = findViewById(R.id.result_field);


    }

    @SuppressLint("NonConstantResourceId")
    public void clickNumber(View view) {
        String number = entryField.getText().toString();
        switch (view.getId()) {
            case R.id.button_zero:
                if (oneZeroFromStart(number) && number.length() == 1) {
                    number = "0";
                } else {
                    number += "0";
                }
                break;
            case R.id.button_one:
                if (oneZeroFromStart(number) && number.length() == 1) {
                    number = number.substring(1);
                }
                number += "1";
                break;
            case R.id.button_two:
                if (oneZeroFromStart(number) && number.length() == 1) {
                    number = number.substring(1);
                }
                number += "2";
                break;
            case R.id.button_three:
                if (oneZeroFromStart(number) && number.length() == 1) {
                    number = number.substring(1);
                }
                number += "3";
                break;
            case R.id.button_four:
                if (oneZeroFromStart(number) && number.length() == 1) {
                    number = number.substring(1);
                }
                number += "4";
                break;
            case R.id.button_five:
                if (oneZeroFromStart(number) && number.length() == 1) {
                    number = number.substring(1);
                }
                number += "5";
                break;
            case R.id.button_six:
                if (oneZeroFromStart(number) && number.length() == 1) {
                    number = number.substring(1);
                }
                number += "6";
                break;
            case R.id.button_seven:
                if (oneZeroFromStart(number) && number.length() == 1) {
                    number = number.substring(1);
                }
                number += "7";
                break;
            case R.id.button_eight:
                if (oneZeroFromStart(number) && number.length() == 1) {
                    number = number.substring(1);
                }
                number += "8";
                break;
            case R.id.button_nine:
                if (oneZeroFromStart(number) && number.length() == 1) {
                    number = number.substring(1);
                }
                number += "9";
                break;
            case R.id.button_dot:
                if (oneZeroFromStart(number) && number.length() == 1) {
                    number = number.substring(0);
                }
                if (oneDotInNum(number)) {

                } else {
                    number += ".";
                }
                break;
            case R.id.button_clear:
                number = "";
                operationField.setText("");
                if ((entryField.getText().toString()).equals("") &&
                        (operationField.getText().toString()).equals(""))
                    resultField.setText("");
                break;
            case R.id.button_backspace:
                if (number.length() != 0) {
                    number = number.substring(0, number.length() - 1);
                } else if (number == null || number.length() == 0) {
                    break;
                }
                break;

        }
        entryField.setText(number);
    }

    @SuppressLint("NonConstantResourceId")
    public void clickOperation(View view) {

        String Operator = operationField.getText().toString();
        firstNumber = entryField.getText().toString();

        switch (view.getId()) {

            case R.id.button_division:
                Operator = "÷";
                break;
            case R.id.button_multiply:
                Operator = "*";
                break;
            case R.id.button_plus:
                Operator = "+";
                break;
            case R.id.button_minus:
                Operator = "-";
                break;

        }
        operationField.setText(Operator);
        entryField.setText("");

        if (firstNumber != null) {
            resultField.setText(firstNumber);
        } else if (firstNumber == null) {
            resultField.setText("0");
        }


    }

    @SuppressLint("SetTextI18n")
    public void clickEquals(View view) {
        String secondNumber = entryField.getText().toString();
        Double result = 0.0;

            switch (operationField.getText().toString()) {
                case "÷":
                    fieldsNotNull();
                    result = Double.parseDouble(firstNumber) / Double.parseDouble(secondNumber);
                    break;
                case "*":
                    fieldsNotNull();
                    result = Double.parseDouble(firstNumber) * Double.parseDouble(secondNumber);
                    break;
                case "+":
                    fieldsNotNull();
                    result = Double.parseDouble(firstNumber) + Double.parseDouble(secondNumber);
                    break;
                case "-":
                    fieldsNotNull();
                    result = Double.parseDouble(firstNumber) - Double.parseDouble(secondNumber);
                    break;
            }
            resultField.setText(String.valueOf(result));
            operationField.setText("=");
            entryField.setText("");

    }

    public  void fieldsNotNull (){
        if (entryField.getText().toString() == null || resultField.getText().toString() == null)
        {
            resultField.setText("0");
            entryField.setText("");
            operationField.setText("=");
        }
    }
    public boolean oneDotInNum(String number) {
        if (number.indexOf(".") == -1) {
            return false;
        } else {
            return true;
        }

    }

    public boolean oneZeroFromStart(String number) {
        if (number.equals("")) {
            return false;
        } else if (number.charAt(0) == '0') {
            return true;
        } else {
            return false;
        }
    }

}