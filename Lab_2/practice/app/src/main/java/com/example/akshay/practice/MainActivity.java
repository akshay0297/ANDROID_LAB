package com.example.akshay.practice;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    double total = 0.0;
    int n1 =0;
    int n2 = 0 ;
    char a;
    String nu1 , nu2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText num1 = (EditText)findViewById(R.id.num1);
        final EditText res  = (EditText)findViewById(R.id.result);

        final Button one    = (Button)findViewById(R.id.one);
        final Button two    = (Button)findViewById(R.id.two);
        final Button three  = (Button)findViewById(R.id.three);
        final Button four   = (Button)findViewById(R.id.four);
        final Button five   = (Button)findViewById(R.id.five);
        final Button six    = (Button)findViewById(R.id.six);
        final Button seven  = (Button)findViewById(R.id.seven);
        final Button eight  = (Button)findViewById(R.id.eight);
        final Button nine   = (Button)findViewById(R.id.nine);
        final Button zero   = (Button)findViewById(R.id.zero);

        final Button plus   = (Button)findViewById(R.id.plus);
        final Button minus  = (Button)findViewById(R.id.minus);
        final Button mult   = (Button)findViewById(R.id.mult);
        final Button divide = (Button)findViewById(R.id.divide);

        final Button equl   = (Button)findViewById(R.id.equl);



        plus.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View view) {
            if (num1.getText().toString().equals(" ")) {
                Toast.makeText(getApplicationContext(), "Enter first number to continue !", Toast.LENGTH_SHORT).show();
            } else
                {
                    a = '+';
                try {
                    n1 = Integer.parseInt(num1.getText().toString());
                    num1.setText("");
                    num1.setHint("Number 2");
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Invalid Entry !", Toast.LENGTH_SHORT).show();
                }

            }
        }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num1.getText().toString().equals(" ")) {
                    Toast.makeText(getApplicationContext(), "Enter first number to continue !", Toast.LENGTH_SHORT).show();
                } else
                {
                    a = '-';
                    try {
                        n1 = Integer.parseInt(num1.getText().toString());
                        num1.setText("");
                        num1.setHint("Number 2");
                    } catch (Exception e) {
                        Toast.makeText(getApplicationContext(), "Invalid Entry !", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num1.getText().toString().equals(" ")) {
                    Toast.makeText(getApplicationContext(), "Enter first number to continue !", Toast.LENGTH_SHORT).show();
                } else
                {
                    a = '*';
                    try {
                        n1 = Integer.parseInt(num1.getText().toString());
                        num1.setText("");
                        num1.setHint("Number 2");

                    } catch (Exception e) {
                        Toast.makeText(getApplicationContext(), "Invalid Entry !", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num1.getText().toString().equals(" ")) {
                    Toast.makeText(getApplicationContext(), "Enter first number to continue !", Toast.LENGTH_SHORT).show();
                } else
                {
                    a = '/';
                    try {
                        n1 = Integer.parseInt(num1.getText().toString());
                        num1.setText("");
                        num1.setHint("Number 2");

                    } catch (Exception e) {
                        Toast.makeText(getApplicationContext(), "Invalid Entry !", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

        equl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num1.getText().toString().equals(" "))
                {
                    Toast.makeText(getApplicationContext(), "Enter Second  number to continue !", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    try
                    {
                        n2 = Integer.parseInt(num1.getText().toString());
                    }
                    catch (Exception e)
                    {
                        Toast.makeText(getApplicationContext() , "Invalid Entry !" ,Toast.LENGTH_SHORT).show();
                    }

                    total = 0;

                    if (a == '+')
                    {
                        total = n1 + n2;
                    }
                    if (a == '-')
                    {
                        total = n1 - n2;
                    }
                    if (a == '*')
                    {
                        total = n1 * n2 ;
                    }
                    if (a == '/') {
                        if (n2 == 0) {
                            Toast.makeText(getApplicationContext(), " Number 2 cannot be Zero ", Toast.LENGTH_SHORT).show();
                        } else {
                            total = n1 / n2;
                        }
                    }

                    String str =  String.valueOf(total);
                    res.setText(str);
                    num1.setText("");
                    num1.setHint("Number 1");

                }
            }
        });

    one.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(num1.getText().toString().equals("Number 1"))
            {
                num1.setText("");
            }

            num1.append("1");
        }
    });
    two.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(num1.getText().toString().equals("Number 1"))
            {
                num1.setText("");
            }
            num1.append("2");
        }
    });

    three.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(num1.getText().toString().equals("Number 1"))
            {
                num1.setText("");
            }
            num1.append("3");
        }
    });
    four.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(num1.getText().toString().equals("Number 1"))
            {
                num1.setText("");
            }
            num1.append("4");
        }
    });

    five.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(num1.getText().toString().equals("Number 1"))
            {
                num1.setText("");
            }
            num1.append("5");
        }
    });

    six.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(num1.getText().toString().equals("Number 1"))
            {
                num1.setText("");
            }
            num1.append("6");
        }
    });

    seven.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(num1.getText().toString().equals("Number 1"))
            {
                num1.setText("");
            }
            num1.append("7");
        }
    });

    eight.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(num1.getText().toString().equals("Number 1"))
            {
                num1.setText("");
            }
            num1.append("8");
        }
    });

    nine.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(num1.getText().toString().equals("Number 1"))
            {
                num1.setText("");
            }
            num1.append("9");
        }
    });

    zero.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(num1.getText().toString().equals("Number 1"))
            {
                num1.setText("");
            }
            num1.append("0");
        }
    });

    }
}

