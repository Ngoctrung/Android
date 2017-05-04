package com.example.v;


import android.support.v7.app.ActionBarActivity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;




public class MainActivity extends ActionBarActivity {


	Button btnTong,btnHieu,btnTich,btnThuong,btnlai,btnthoatt ;
	EditText soA,soB,kq;
	float tong, hieu, tich;
	float thuong,a,b;
	Context context = this;
	
	public void tinhtong()
	{
		 btnTong = (Button)findViewById(R.id.btncong);
	     
	        btnTong.setOnClickListener(new OnClickListener() {
	            
	            @Override
	            public void onClick(View v) {
	                // TODO Auto-generated method stub	                
	              
	                 soA = (EditText)findViewById(R.id.txtA);
	                 soB = (EditText)findViewById(R.id.txtB);
	          //
	                 try {
	                	  a = Float.parseFloat(soA.getText().toString());
	                    } catch (Exception e) {
	                     soA.setText("");
	                     soA.requestFocus();
	                     Toast.makeText(getApplication(), "Nhập số tự nhiên", 1).show();
	                     return;
	                    }
	                 
	                 try {
	                	  b = Float.parseFloat(soB.getText().toString());
	                    } catch (Exception e) {
	                     soB.setText("");
	                     soB.requestFocus();
	                     Toast.makeText(getApplication(), "Nhập số tự nhiên", 1).show();
	                     return;
	                    }
	               
	                
	              
	                tong = a+b;
	                
	                 kq = (EditText)findViewById(R.id.txtKq);
	                //Hiển thị kết quả
	                 
	                 kq.setText(""+(tong));
	            }
	        });
	}
	//
	public void tinhhieu()
	{
		 btnHieu = (Button)findViewById(R.id.btntru);
	     
	        btnHieu.setOnClickListener(new OnClickListener() {
	            
	            @Override
	            public void onClick(View v) {
	                // TODO Auto-generated method stub	                
	                
	                 soA = (EditText)findViewById(R.id.txtA);
	                 soB = (EditText)findViewById(R.id.txtB);
	              
	                 try {
	                	  a = Float.parseFloat(soA.getText().toString());
	                    } catch (Exception e) {
	                     soA.setText("");
	                     soA.requestFocus();
	                     Toast.makeText(getApplication(), "Nhập số tự nhiên", 1).show();
	                     return;
	                    }
	                 
	                 try {
	                	  b = Float.parseFloat(soB.getText().toString());
	                    } catch (Exception e) {
	                     soB.setText("");
	                     soB.requestFocus();
	                     Toast.makeText(getApplication(), "Nhập số tự nhiên", 1).show();
	                     return;
	                    }
	               
	                hieu = a-b;
	                
	                 kq = (EditText)findViewById(R.id.txtKq);
	                //Hiển thị kết quả
	                 
	                kq.setText(""+(hieu));
	            }
	        });
	}
	
		
	public void tinhtich()
	{
		 btnTich = (Button)findViewById(R.id.btnnhan);
	     
	        btnTich.setOnClickListener(new OnClickListener() {
	            
	            @Override
	            public void onClick(View v) {
	                // TODO Auto-generated method stub	                
	         
	                 soA = (EditText)findViewById(R.id.txtA);
	                 soB = (EditText)findViewById(R.id.txtB);
	            
	                 try {
	                	  a = Float.parseFloat(soA.getText().toString());
	                    } catch (Exception e) {
	                     soA.setText("");
	                     soA.requestFocus();
	                     Toast.makeText(getApplication(), "Nhập số tự nhiên", 1).show();
	                     return;
	                    }
	                 
	                 try {
	                	  b = Float.parseFloat(soB.getText().toString());
	                    } catch (Exception e) {
	                     soB.setText("");
	                     soB.requestFocus();
	                     Toast.makeText(getApplication(), "Nhập số tự nhiên", 1).show();
	                     return;
	                    }
                	 
	                tich = a*b;
	                
	                 kq = (EditText)findViewById(R.id.txtKq);
	                //Hiển thị kết quả
	                 
	                kq.setText(""+(tich));
	            }
	        });
	}
	
	public void tinhthuong()
	{
		 btnThuong = (Button)findViewById(R.id.btnchia);
	     
	        btnThuong.setOnClickListener(new OnClickListener() {
	            
	            @Override
	            public void onClick(View v) {
	                // TODO Auto-generated method stub	                
	              
	                 soA = (EditText)findViewById(R.id.txtA);
	                 soB = (EditText)findViewById(R.id.txtB);
	       
	              
	                 try {
	                	  a = Float.parseFloat(soA.getText().toString());
	                    } catch (Exception e) {
	                     soA.setText("");
	                     soA.requestFocus();
	                     Toast.makeText(getApplication(), "Nhập số tự nhiên", 1).show();
	                     return;
	                    }
	                 
	                 try {
	                	  b = Float.parseFloat(soB.getText().toString());
	                    } catch (Exception e) {
	                     soB.setText("");
	                     soB.requestFocus();
	                     Toast.makeText(getApplication(), "Nhập số tự nhiên", 1).show();
	                     return;
	                    }
	                   
	                thuong = a/b;
	                
	                 kq = (EditText)findViewById(R.id.txtKq);
	                //Hiển thị kết quả
	                 
	                kq.setText(""+(thuong));
	            }
	        });
	}
////	
	public void lamlai()
	{
		btnlai = (Button) findViewById(R.id.btnlamlai);
		
		btnlai.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				soA.setText("");
				soB.setText("");
				kq.setText("");
				b = a = 0;
			}
		});
	}
	
	public void thoat() {
		  // TODO Auto-generated method stub
		btnthoatt = (Button) findViewById(R.id.btnthoat);
		  btnthoatt.setOnClickListener(new OnClickListener() {
		   
		   @Override
		   public void onClick(View v) {
		    // TODO Auto-generated method stub
		    AlertDialog.Builder b = new  AlertDialog.Builder(context);
		    b.setTitle("Thoát");
		    b.setMessage("thoát ứng dụng");
		    b.setNegativeButton("No", null);
		    b.setNeutralButton("Yes", new DialogInterface.OnClickListener() {
		     
		     @Override
		     public void onClick(DialogInterface arg0, int arg1) {
		      // TODO Auto-generated method stub
		      System.exit(0);
		     }
		    });
		    b.show();
		   }
		  });
		 }

	
	
	
	
	//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
       tinhtong();
       tinhhieu();
       tinhtich();
       tinhthuong();
       lamlai();
       thoat();
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
