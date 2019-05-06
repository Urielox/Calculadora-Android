package com.example.urielgarciamoreno.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnSuma, btnResta, btnMulti, btnDivi, btnIgual, btnAC, btnPunto, btnRaiz, btnPotencia;
    TextView txtVwNumeros, txtVwGuardado;
    boolean punto = false, suma = false, resta = false, multi = false, divi = false, potencia = false;
    float numA = 0f, numB = 0f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnPunto = (Button) findViewById(R.id.btnPunto);

        btnSuma = (Button) findViewById(R.id.btnSuma);
        btnResta = (Button) findViewById(R.id.btnResta);
        btnMulti = (Button) findViewById(R.id.btnMulti);
        btnDivi = (Button) findViewById(R.id.btnDivi);
        btnRaiz = (Button) findViewById(R.id.btnRaiz);
        btnPotencia = (Button) findViewById(R.id.btnPotencia);

        btnAC = (Button) findViewById(R.id.btnAC);
        btnIgual = (Button) findViewById(R.id.btnIgual);

        txtVwNumeros = (TextView) findViewById(R.id.txtVwNumeros);
        txtVwGuardado = (TextView) findViewById(R.id.txtVwGuardado);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVwNumeros.setText((String) txtVwNumeros.getText() + (String) btn0.getText());
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVwNumeros.setText((String) txtVwNumeros.getText() + (String) btn1.getText());
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVwNumeros.setText((String) txtVwNumeros.getText() + (String) btn2.getText());
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVwNumeros.setText((String) txtVwNumeros.getText() + (String) btn3.getText());
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVwNumeros.setText((String) txtVwNumeros.getText() + (String) btn4.getText());
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVwNumeros.setText((String) txtVwNumeros.getText() + (String) btn5.getText());
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVwNumeros.setText((String) txtVwNumeros.getText() + (String) btn6.getText());
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVwNumeros.setText((String) txtVwNumeros.getText() + (String) btn7.getText());
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVwNumeros.setText((String) txtVwNumeros.getText() + (String) btn8.getText());
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVwNumeros.setText((String) txtVwNumeros.getText() + (String) btn9.getText());
            }
        });

        btnPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!punto) {
                    txtVwNumeros.setText((String) txtVwNumeros.getText() + (String) btnPunto.getText());
                    punto = true;
                }
            }
        });

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (!suma) {
                        numA = Float.parseFloat((String) txtVwNumeros.getText());
                        txtVwGuardado.setText((String) txtVwNumeros.getText() + " " + (String) btnSuma.getText() + " ");
                        suma = true;
                        txtVwNumeros.setText("");
                        punto = false;
                    }
                } catch (Exception xxx) {
                    punto = false;
                    xxx.printStackTrace();
                    txtVwNumeros.setText("");
                }
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (!resta) {
                        numA = Float.parseFloat((String) txtVwNumeros.getText());
                        txtVwGuardado.setText((String) txtVwNumeros.getText() + " " + (String) btnResta.getText() + " ");
                        resta = true;
                        txtVwNumeros.setText("");
                        punto = false;
                    }
                } catch (Exception xxx) {
                    punto = false;
                    xxx.printStackTrace();
                    txtVwNumeros.setText("");
                }
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!multi) {
                    try {
                        numA = Float.parseFloat((String) txtVwNumeros.getText());
                        txtVwGuardado.setText((String) txtVwNumeros.getText() + " " + (String) btnMulti.getText() + " ");
                        multi = true;
                        txtVwNumeros.setText("");
                        punto = false;
                    } catch (Exception xxx) {
                        punto = false;
                        xxx.printStackTrace();
                    }

                }
            }
        });

        btnDivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (!divi) {
                        numA = Float.parseFloat((String) txtVwNumeros.getText());
                        txtVwGuardado.setText((String) txtVwNumeros.getText() + " " + (String) btnDivi.getText() + " ");
                        divi = true;
                        txtVwNumeros.setText("");
                        punto = false;
                    }
                } catch (Exception xxx) {
                    punto = false;
                    xxx.printStackTrace();
                }

            }
        });

        btnRaiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (!divi && !multi && !suma && !resta && !potencia) {
                        numA = Float.parseFloat((String) txtVwNumeros.getText());
                        txtVwGuardado.setText("");
                        txtVwNumeros.setText(Double.toString(Math.sqrt((double) numA)));
                        suma = false;
                        resta = false;
                        multi = false;
                        divi = false;
                        punto = false;
                    }
                } catch (Exception xxx) {
                    punto = false;
                    xxx.printStackTrace();
                }

            }
        });

        btnPotencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (!divi) {
                        numA = Float.parseFloat((String) txtVwNumeros.getText());
                        txtVwGuardado.setText((String) txtVwNumeros.getText() + " " + "^" + " ");
                        potencia = true;
                        txtVwNumeros.setText("");
                        punto = false;
                    }
                } catch (Exception xxx) {
                    punto = false;
                    xxx.printStackTrace();
                }

            }
        });

        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suma = false;
                resta = false;
                multi = false;
                divi = false;
                punto = false;
                txtVwGuardado.setText("");
                txtVwNumeros.setText("");
                numA = 0f;
                numB = 0f;
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (suma || resta || multi || divi || potencia) {
                        float resultado = 0f;
                        numB = Float.parseFloat((String) txtVwNumeros.getText());

                        if (suma) {
                            resultado = suma();
                        } else {
                            if (resta) {
                                resultado = resta();
                            } else {
                                if (multi) {
                                    resultado = multi();
                                } else {
                                    if (divi) {
                                        resultado = divi();
                                    } else {
                                        if (potencia) {
                                            resultado = poten();
                                        }
                                    }
                                }
                            }
                        }

                        txtVwGuardado.setText("");
                        txtVwNumeros.setText(Float.toString(resultado));

                        suma = false;
                        resta = false;
                        multi = false;
                        divi = false;
                        punto = false;

                    }
                } catch (Exception xxx) {
                    xxx.printStackTrace();
                    txtVwNumeros.setText("");
                }
            }
        });
    }

    public float suma(){
        return numA + numB;
    }

    public float resta(){
        return numA - numB;
    }

    public float multi(){
        return numA * numB;
    }

    public float divi(){
        return numA / numB;
    }

    public float poten(){
        return (float)Math.pow(numA, numB);
    }
}
