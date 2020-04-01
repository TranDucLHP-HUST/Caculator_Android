package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    final long MAX_LONG= 99999999999999999L;
    Button num0, num1,num2,num3,num4,num5,num6, num7, num8, num9,c,ce,del,equal, plus, minus, multiply, div;
    EditText text;
    TextView view;
    String noiDung="", lichSu="";
    long result=0, tg;
    int tt=0; //tt=1: +     tt=2: -     tt=3: *     tt=4: /
    boolean kt,ok=true,finish=false; // kt=true : result dang la cac toan hang, cos the xoa
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
        num0 = findViewById(R.id.num0);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);
        c = findViewById(R.id.c);
        ce = findViewById(R.id.ce);
        del = findViewById(R.id.del);
        equal = findViewById(R.id.equal);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        div = findViewById(R.id.div);
        view = findViewById(R.id.view);

        // Button 0
        num0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                kt=true;
                if (finish == true)
                {
                    result=0;
                    finish=false;
                }
                if (result*10+0 <=MAX_LONG) {
                    result = result * 10 + 0;
                    noiDung = Long.toString(result);
                    text.setText(noiDung);
                }
            }
            });

        // Button 1
        num1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                kt=true;
                if (finish == true)
                {
                    result=0;
                    finish=false;
                }
                if (result*10+1 <=MAX_LONG) {
                    result = result * 10 + 1;
                    noiDung = Long.toString(result);
                    text.setText(noiDung);
                }
            }
        });

        //Button 2
        num2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                kt=true;
                if (finish == true)
                {
                    result=0;
                    finish=false;
                }
                if (result*10+2 <=MAX_LONG) {
                    result = result * 10 + 2;
                    noiDung = Long.toString(result);
                    text.setText(noiDung);
                }
            }
        });


        // Button 3
        num3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                kt=true;
                if (finish == true)
                {
                    result=0;
                    finish=false;
                }
                if (result*10+3 <=MAX_LONG) {
                    result = result * 10 + 3;
                    noiDung = Long.toString(result);
                    text.setText(noiDung);
                }
            }
        });

        // Button 4
        num4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                kt=true;
                if (finish == true)
                {
                    result=0;
                    finish=false;
                }
                if (result*10+4 <=MAX_LONG) {
                    result = result * 10 + 4;
                    noiDung = Long.toString(result);
                    text.setText(noiDung);
                }
            }
        });

        // Button 5
        num5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                kt=true;
                if (finish == true)
                {
                    result=0;
                    finish=false;
                }
                if (result*10+5 <=MAX_LONG) {
                    result = result * 10 + 5;
                    noiDung = Long.toString(result);
                    text.setText(noiDung);
                }
            }
        });

        // Button 6
        num6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                kt=true;
                if (finish == true)
                {
                    result=0;
                    finish=false;
                }
                if (result*10+6 <=MAX_LONG) {
                    result = result * 10 + 6;
                    noiDung = Long.toString(result);
                    text.setText(noiDung);
                }
            }
        });

        //Button 7
        num7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                kt=true;
                if (finish == true)
                {
                    result=0;
                    finish=false;
                }
                if (result*10+7 <=MAX_LONG) {
                    result = result * 10 + 7;
                    noiDung = Long.toString(result);
                    text.setText(noiDung);
                }
            }
        });

        //Button 8
        num8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                kt=true;
                if (finish == true)
                {
                    result=0;
                    finish=false;
                }
                if (result*10+8 <=MAX_LONG) {
                    result = result * 10 + 8;
                    noiDung = Long.toString(result);
                    text.setText(noiDung);
                }
            }
        });

        //Button 9
        num9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                kt=true;
                if (finish == true)
                {
                    result=0;
                    finish=false;
                }
                if (result*10+9 <=MAX_LONG) {
                    result = result * 10 + 9;
                    noiDung = Long.toString(result);
                    text.setText(noiDung);
                }
            }
        });

        //Button +
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ok ==false)
                {
                    long x=0;
                    switch (tt){
                        case 1:
                            x = result+tg;
                            lichSu = lichSu + " + ";
                            break;
                        case 2:
                            x =tg - result;
                            lichSu = lichSu + " - ";
                            break;
                        case 3:
                            x = result *tg;
                            lichSu = lichSu + " * ";
                            break;
                        case 4:
                            x = tg / result;
                            lichSu = lichSu + " / ";
                            break;
                    }
                    lichSu = lichSu + Long.toString(result);
                    noiDung = Long.toString(x);
                    tg =x;
                    text.setText(noiDung);
                    view.setText(lichSu);

                }
                else
                {
                    tg = result;
                    lichSu = noiDung;
                    view.setText(noiDung + " + ");
                }
                ok = false;
                kt=false;
                tt=1;
                result=0;

            }
        });

        //Button -
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ok ==false)
                {
                    long x=0;
                    switch (tt){
                        case 1:
                            x = result+tg;
                            lichSu = lichSu + " + ";
                            break;
                        case 2:
                            x =tg - result;
                            lichSu = lichSu + " - ";
                            break;
                        case 3:
                            x = result *tg;
                            lichSu = lichSu + " * ";
                            break;
                        case 4:
                            x = tg / result;
                            lichSu = lichSu + " / ";
                            break;
                    }
                    lichSu = lichSu + Long.toString(result);
                    noiDung = Long.toString(x);
                    tg =x;
                    text.setText(noiDung);
                    view.setText(lichSu);

                }
                else
                {
                    tg = result;
                    lichSu = noiDung;
                    view.setText(noiDung + " - ");
                }
                ok = false;
                kt=false;
                tt=2;
                result=0;
            }
        });

        //Button *
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ok ==false)
                {
                    long x=0;
                    switch (tt){
                        case 1:
                            x = result+tg;
                            lichSu = lichSu + " + ";
                            break;
                        case 2:
                            x =tg - result;
                            lichSu = lichSu + " - ";
                            break;
                        case 3:
                            x = result *tg;
                            lichSu = lichSu + " * ";
                            break;
                        case 4:
                            x = tg / result;
                            lichSu = lichSu + " / ";
                            break;
                    }
                    lichSu = lichSu + Long.toString(result);
                    noiDung = Long.toString(x);
                    tg =x;
                    text.setText(noiDung);
                    view.setText(lichSu);

                }
                else
                {
                    tg = result;
                    lichSu = noiDung;
                    view.setText(noiDung + " * ");
                }
                ok = false;
                kt=false;
                tt=3;
                result=0;
            }
        });

        //Button /
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ok ==false)
                {
                    long x=0;
                    switch (tt){
                        case 1:
                            x = result+tg;
                            lichSu = lichSu + " + ";
                            break;
                        case 2:
                            x =tg - result;
                            lichSu = lichSu + " - ";
                            break;
                        case 3:
                            x = result *tg;
                            lichSu = lichSu + " * ";
                            break;
                        case 4:
                            x = tg / result;
                            lichSu = lichSu + " / ";
                            break;
                    }
                    lichSu = lichSu + Long.toString(result);
                    noiDung = Long.toString(x);
                    tg =x;
                    text.setText(noiDung);
                    view.setText(lichSu);

                }
                else
                {
                    tg = result;
                    lichSu = noiDung;
                    view.setText(noiDung + " / ");
                }
                ok = false;
                kt=false;
                tt=4;
                result=0;
            }
        });

        //Button =
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tt==0)
                {
                    noiDung=Long.toString(result);
                    lichSu = noiDung + " = ";
                    result =0;
                    text.setText(noiDung);
                    view.setText(lichSu);
                }
                else
                {
                    if (kt == true)
                    {
                        kt=false;
                        boolean error=false;
                        long x=0;
                        switch (tt){
                            case 1:
                                x = result+tg;
                                lichSu = lichSu + " + ";
                                break;
                            case 2:
                                x =tg - result;
                                lichSu = lichSu + " - ";
                                break;
                            case 3:
                                x = result *tg;
                                if (x<0 || x > MAX_LONG)
                                {
                                    error=true;
                                }
                                lichSu = lichSu + " * ";
                                break;
                            case 4:
                                x = tg / result;
                                lichSu = lichSu + " / ";
                                break;

                        }
                        if (error ==false)
                        {
                            lichSu = lichSu + Long.toString(result)+ " = " ;
                            noiDung = Long.toString(x);
                            result =x;
                            text.setText(noiDung);
                            view.setText(lichSu);
                        }
                        else
                        {
                            lichSu="Error";
                            noiDung="0";
                            result=0;
                            text.setText(noiDung);
                            view.setText(lichSu);
                        }

                    }
                    tg=0;
                    tt=0;
                    ok=true;
                    finish=true;
                }



            }
        });

        //Button C
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kt=true;
                ok=true;
                tt=0;
                result=0;
                tg=0;
                lichSu="";
                noiDung="";
                text.setText("0");
                view.setText("");
            }
        });
        //Button CE
        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (finish == true)
                {
                    kt=true;
                    ok=true;
                    tt=0;
                    result=0;
                    tg=0;
                    lichSu="";
                    noiDung="";
                    text.setText("0");
                    view.setText("");
                }
                else
                {
                    result=0;
                    kt=true;
                    noiDung = Long.toString(result);
                    text.setText(noiDung);
                }

            }
        });
        //Button del
        del.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (kt == true)
                {
                    result= result/10;
                    noiDung=Long.toString(result);
                    text.setText(noiDung);
                }
            }
        });


    }


}
