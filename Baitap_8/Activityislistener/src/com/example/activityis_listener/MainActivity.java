package com.example.activityis_listener;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class MainActivity extends ActionBarActivity {

	Button btnChandoan;
	EditText editTen, editCN, editCC, editBMI, editCD;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btnChandoan = (Button)findViewById(R.id.button1);
        btnChandoan.setOnClickListener((OnClickListener) this);
        editTen = (EditText)findViewById(R.id.editten);
        editCN = (EditText)findViewById(R.id.editTextcannang);
        editCC = (EditText)findViewById(R.id.editTextchieucao);
        editBMI = (EditText)findViewById(R.id.editTextBMI);
        editCD = (EditText)findViewById(R.id.editchuandoan);
        btnChandoan = (Button)findViewById(R.id.button1);
        btnChandoan.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				float H = Float.parseFloat(editCC.getText()+"");
				float W = Float.parseFloat(editCN.getText()+"");
				float BMI = (float) (W/Math.pow(H, 2));
				String chandoan = "";
				
				if(BMI<18)	chandoan = "Nguoi gay";
				else if(BMI<=24.9)	chandoan = "Nguoi binh thuong";
				else if(BMI<=29.9)	chandoan="Nguoi beo phi do 1";
				else if(BMI<=34.9)	chandoan="Nguoi beo phi do 2";
				else	chandoan="Nguoi beo phi do 3";
				
			
				editBMI.setText(String.valueOf(BMI));
				editCD.setText(chandoan);
			}
		});
            
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
