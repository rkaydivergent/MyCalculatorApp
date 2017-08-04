package com.example.pc.mycalculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private float num1,num2,output;
    TextView upperText,lowerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        upperText = (TextView)findViewById(R.id.lbl);
        lowerText = (TextView)findViewById(R.id.result);
    }
    public void onBtnClick (View v) {
        lowerText.append(((Button) v).getText());}
    public void dotClick (View v) {
        String value = lowerText.getText().toString();
        if (value.contains(".")) {}
        else
        {lowerText.append(((Button) v).getText());}}
    public void percentClick (View v) {
        String value = lowerText.getText().toString();
        num1 = Float.parseFloat(value);
        output= num1/100;
        upperText.setText(lowerText.getText()+"% =");
        lowerText.setText(String.valueOf(output));
    }
    public void overClick (View v) {
        String value = lowerText.getText().toString();
        num1 = Float.parseFloat(value);
        output=1/num1;
        upperText.setText("1/"+lowerText.getText()+" =");
        lowerText.setText(String.valueOf(output));
    }
    public void clearClick (View v) {
        upperText.setText("");
        lowerText.setText("");}
    public void onEqClick(View v){
        String value = lowerText.getText().toString();
        String[] temp;
        if (value.contains("+")) {
            temp = value.split("\\+");
            num1 = Float.parseFloat(temp[0]);
            num2 = Float.parseFloat(temp[1]);
            output = num1 + num2;
            upperText.setText(lowerText.getText()+" =");
            lowerText.setText(String.valueOf(output));
        } else if (value.contains("-")) {
            temp = value.split("\\-");
            num1 = Float.parseFloat(temp[0]);
            num2 = Float.parseFloat(temp[1]);
            output = num1 - num2;
            upperText.setText(lowerText.getText()+" =");
            lowerText.setText(String.valueOf(output));
        } else if (value.contains("*")) {
            temp = value.split("\\*");
            num1 = Float.parseFloat(temp[0]);
            num2 = Float.parseFloat(temp[1]);
            output = num1 * num2;
            upperText.setText(lowerText.getText()+" =");
            lowerText.setText(String.valueOf(output));}
        else if (value.contains("/")) {
            temp = value.split("\\/");
            num1 = Float.parseFloat(temp[0]);
            num2 = Float.parseFloat(temp[1]);
            output = num1 / num2;
            upperText.setText(lowerText.getText()+" =");
            lowerText.setText(String.valueOf(output));
        }
    }
}
