package com.aperslajsgmail.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
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
    private Button btna1, btna2, btna3, btnab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //init();

        rg = (RadioGroup) findViewById(R.id.radioGroup);

        btna1 = (Button) findViewById(R.id.btna1);
        btna1.setText(Html.fromHtml("a<sup>-1</sup>"));
        btna1 = (Button) findViewById(R.id.btna2);
        btna1.setText(Html.fromHtml("a<sup>2</sup>"));
        btna1 = (Button) findViewById(R.id.btna3);
        btna1.setText(Html.fromHtml("a<sup>3</sup>"));
        btna1 = (Button) findViewById(R.id.btnab);
        btna1.setText(Html.fromHtml("a<sup>b</sup>"));

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

    public static String format(double d)
    {
        if(d == (long) d)
            return String.format("%d",(long)d);
        else
            return String.format("%s",d);
    }

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


            if (boolA) {
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

            //String cc = String.valueOf(c);
            String cc = format(c);

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

            String cc = format(c);

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

            String cc = format(c);

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

            String cc = format(c);

            res.setText(cc);
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void inverzOnClick(View v){

        try {
            EditText a = (EditText) findViewById(R.id.editTextA);
            EditText res = (EditText) findViewById(R.id.editTextRes);

            double x = Double.parseDouble(a.getText().toString());
            double c = 1/x;

            String cc = format(c);

            res.setText(cc);
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void a2OnClick(View v){

        try {
            EditText a = (EditText) findViewById(R.id.editTextA);
            EditText res = (EditText) findViewById(R.id.editTextRes);

            double x = Double.parseDouble(a.getText().toString());
            double c = x*x;

            String cc = format(c);

            res.setText(cc);
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void a3OnClick(View v){

        try {
            EditText a = (EditText) findViewById(R.id.editTextA);
            EditText res = (EditText) findViewById(R.id.editTextRes);

            double x = Double.parseDouble(a.getText().toString());
            double c = x*x*x;

            String cc = format(c);

            res.setText(cc);
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void abOnClick(View v){

        try {
            EditText a = (EditText) findViewById(R.id.editTextA);
            EditText b = (EditText) findViewById(R.id.editTextB);
            EditText res = (EditText) findViewById(R.id.editTextRes);

            double x = Double.parseDouble(a.getText().toString());
            double y = Double.parseDouble(b.getText().toString());
            double c = Math.pow(x,y);

            String cc = format(c);

            res.setText(cc);
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }





    public void clearOnClick(View v){
        EditText a = (EditText) findViewById(R.id.editTextA);
        EditText b = (EditText) findViewById(R.id.editTextB);
        EditText res = (EditText) findViewById(R.id.editTextRes);

        a.setText("");
        b.setText("");
        res.setText("");
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
