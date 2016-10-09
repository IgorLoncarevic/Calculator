package com.aperslajsgmail.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText a, b;
    //private Button plus, minus, puta, podeljeno;
    RadioGroup rg;
    RadioButton rb;
    boolean boolA = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //init();

        rg = (RadioGroup) findViewById(R.id.radioGroup);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    /*
    private void init(){
        a = (EditText) findViewById(R.id.editTextA);
        b = (EditText) findViewById(R.id.editTextB);
        res = (TextView) findViewById(R.id.textViewRes);
        plus = (Button) findViewById(R.id.btnPlus);
        minus = (Button) findViewById(R.id.btnMinus);
        puta = (Button) findViewById(R.id.btnPuta);
        podeljeno = (Button) findViewById(R.id.btnPodeljeno);

    }
    */

    public void rbOnClick(View v){
        int rbid = rg.getCheckedRadioButtonId();
        rb = (RadioButton) findViewById(rbid);

        if(rbid == R.id.radioButtonA){
            boolA = true;
        }
        else{
            boolA = false;
        }
    }

    public void btnCopyOnClick(View v){
        try {
            EditText a = (EditText) findViewById(R.id.editTextA);
            EditText b = (EditText) findViewById(R.id.editTextB);
            EditText res = (EditText) findViewById(R.id.editTextRes);

            double c = Double.parseDouble(res.getText().toString());
            String cc = String.valueOf(c);


            if (boolA == true) {
                a.setText(cc);
            } else {
                b.setText(cc);
            }
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void plusOnClick(View v){

        try {
            EditText a = (EditText) findViewById(R.id.editTextA);
            EditText b = (EditText) findViewById(R.id.editTextB);
            EditText res = (EditText) findViewById(R.id.editTextRes);

            double x = Double.parseDouble(a.getText().toString());
            double y = Double.parseDouble(b.getText().toString());
            double c = x + y;

            String cc = String.valueOf(c);

            res.setText(cc);
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void minusOnClick(View v){

        try {
            EditText a = (EditText) findViewById(R.id.editTextA);
            EditText b = (EditText) findViewById(R.id.editTextB);
            EditText res = (EditText) findViewById(R.id.editTextRes);

            double x = Double.parseDouble(a.getText().toString());
            double y = Double.parseDouble(b.getText().toString());
            double c = x - y;

            String cc = String.valueOf(c);

            res.setText(cc);
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void putaOnClick(View v){

        try {
            EditText a = (EditText) findViewById(R.id.editTextA);
            EditText b = (EditText) findViewById(R.id.editTextB);
            EditText res = (EditText) findViewById(R.id.editTextRes);

            double x = Double.parseDouble(a.getText().toString());
            double y = Double.parseDouble(b.getText().toString());
            double c = x * y;

            String cc = String.valueOf(c);

            res.setText(cc);
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void podeljenoOnClick(View v){

        try {
            EditText a = (EditText) findViewById(R.id.editTextA);
            EditText b = (EditText) findViewById(R.id.editTextB);
            EditText res = (EditText) findViewById(R.id.editTextRes);

            double x = Double.parseDouble(a.getText().toString());
            double y = Double.parseDouble(b.getText().toString());
            double c = x / y;

            String cc = String.valueOf(c);

            res.setText(cc);
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
