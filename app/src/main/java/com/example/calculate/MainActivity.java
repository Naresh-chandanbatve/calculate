package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class MainActivity extends AppCompatActivity {







    ////// Intialization of fields //////
    Button btn_back,btn_pi,btn_e,btn_divide,btn_9,btn_8,btn_7,btn_6,btn_5,btn_4,btn_3,btn_2,btn_1,btn_multiply,btn_plus,btn_minus;
    Button btn_equal,btn_zero,btn_dot,btn_clear;
    TextView datav,oper;
    EditText outputv;
    TextView naresh;










  ///// Initialization of variables /////
    BigDecimal num1,num2,res;









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






             /////  Assigning ids /////

            btn_back=findViewById(R.id.back);
            btn_pi=findViewById(R.id.buttonpi);
            btn_e=findViewById(R.id.buttone);
            btn_divide=findViewById(R.id.divison);
            btn_9=findViewById(R.id.number9);
            btn_8=findViewById(R.id.number8);
            btn_7=findViewById(R.id.number7);
            btn_6=findViewById(R.id.number6);
            btn_5=findViewById(R.id.number5);
            btn_4=findViewById(R.id.number4);
            btn_3=findViewById(R.id.number3);
            btn_2=findViewById(R.id.number2);
            btn_1=findViewById(R.id.number1);
            btn_multiply=findViewById(R.id.multiply);
            btn_plus=findViewById(R.id.plus);
            btn_minus=findViewById(R.id.minus);
            btn_equal=findViewById(R.id.equal);
            btn_zero=findViewById(R.id.zero);
            btn_clear=findViewById(R.id.clear);
            btn_dot=findViewById(R.id.dot);
            datav=findViewById(R.id.data);
            outputv=findViewById(R.id.output);
            oper=findViewById(R.id.operand);
            naresh=findViewById(R.id.naresh);


         ///// assigning ids complete /////














        ///// adding functions of number buttons /////
	

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                outputv.setText(outputv.getText()+"1");

                }

        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                outputv.setText(outputv.getText()+"2");

            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                outputv.setText(outputv.getText()+"3");

            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                outputv.setText(outputv.getText() + "4");

            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                outputv.setText(outputv.getText()+"5");

            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                outputv.setText(outputv.getText()+"6");

            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                outputv.setText(outputv.getText()+"7");

            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                outputv.setText(outputv.getText()+"8");

            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                outputv.setText(outputv.getText()+"9");

            }
        });

        btn_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                outputv.setText(outputv.getText()+"0");
            }
        });

        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    if(!outputv.getText().toString().contains(".")) {
                        if(outputv.getText().toString().isEmpty()) {
                            outputv.setText(outputv.getText() + "0.");
                        }
                        else {
                            outputv.setText(outputv.getText() + ".");
                        }

                    }



            }
        });


        ////// Number button functions finish //////














       ////// adding functions of extra buttons //////


         btn_back.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 int length =outputv.getText().toString().length();
                 if(length>0) {
                     outputv.getText().delete(length-1,length);
                 }
             }
         });

          btn_clear.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {

                  outputv.setText("");
                  datav.setText("");
                  oper.setText("");

              }
          });

          naresh.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                   Toast.makeText(MainActivity.this,"This app is developed by Naresh",Toast.LENGTH_LONG).show();
              }
          });

          btn_e.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  if(outputv.getText().toString().trim().length()<=0) {
                      outputv.setText("2.71828183");
                  }
                  else {
                      Toast.makeText(MainActivity.this,"This action is not allowed here clear the screen first",Toast.LENGTH_LONG);
                  }

              }
          });

          btn_pi.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {

                  if(outputv.getText().toString().trim().length()<=0) {
                      outputv.setText("3.14159265");
                  }
                  else {
                      Toast.makeText(MainActivity.this,"This action is not allowed here clear the screen first",Toast.LENGTH_LONG);
                  }
              }
          });
         

	  ////// Eaxtra Button Function Finish //////













        ////// Adding funtions of Operation  buttons //////

           btn_divide.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {

                   datav.setText(outputv.getText());
                   oper.setText("/");
                   outputv.setText("");

               }
           });


           btn_plus.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   datav.setText(outputv.getText());
                   oper.setText("+");
                   outputv.setText("");
               }
           });


           btn_minus.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   datav.setText(outputv.getText());
                   oper.setText("-");
                   outputv.setText("");
               }
           });


          btn_multiply.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  datav.setText(outputv.getText());
                  oper.setText("X");
                  outputv.setText("");
              }
          });

          /////// Adding functions of operation Buttons completed ///////


















        ////// Adding Equal Button Functions //////


        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

           try {
               if(datav.getText().toString().trim().length()>0 && outputv.getText().toString().trim().length()>0) {
                   double db1 = Double.parseDouble(datav.getText().toString());
                   double db2 = Double.parseDouble(outputv.getText().toString());

                   num1=BigDecimal.valueOf(db1);
                   num2=BigDecimal.valueOf(db2);

                   switch (oper.getText().toString()) {
                       case "+" :
                           res=num1.add(num2, MathContext.UNLIMITED);
                           break;
                       case "-" :
                           res=num1.subtract(num2, MathContext.UNLIMITED);
                           break;
                       case "X" :
                           res=num1.multiply(num2, MathContext.UNLIMITED);
                           break;
                       case "/" :
                           res=num1.divide(num2 ,12,RoundingMode.HALF_UP);
                   }

                   outputv.setText(String.valueOf(res));
                   datav.setText("");
                   oper.setText("");
               }
               else {
                   Toast.makeText(MainActivity.this,"Fields can not be empty",Toast.LENGTH_SHORT).show();
               }



           } catch (ArithmeticException e) {
               Toast.makeText(MainActivity.this,"Can not divide by zero",Toast.LENGTH_SHORT).show();
           }


            }
        });

         
	////// Equal Button Funtion Finish //////










    }
}
