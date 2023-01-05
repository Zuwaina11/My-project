package com.example.myapplicationforproject;

import static android.system.Os.close;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Payment extends AppCompatActivity {
    DatabaseHelper myDb;
    EditText editText1,editText2,editText3,editText4;
    TextView name, phone, chocolatetype, price, discount, pricetotal;
    Button clear, read,close;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        myDb = new DatabaseHelper(this);
        //get the IDs of editext
        editText1=(EditText)findViewById(R.id.edName);
        editText2 =(EditText) findViewById(R.id.edphone);
        editText3 = (EditText) findViewById(R.id.edtypech);
        editText4 = (EditText) findViewById(R.id.eddiscount);
        //get the IDs of buttons

        clear = (Button) findViewById(R.id.btnClear);
        read =(Button) findViewById(R.id.btnread);
        close = (Button) findViewById(R.id.btnClose);

        //define user defined methods
        clear();
        read();
        close();

    }
    private void close() {
        finish();
        System.exit(0);
    }



    public void showMessage(String title, String mes)
    {
        AlertDialog.Builder ad=new AlertDialog.Builder(this);
        ad.setCancelable(true);
        ad.setTitle(title);
        ad.setMessage(mes);
        ad.show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.layout,menu);
        return super.onCreateOptionsMenu(menu);
    }



    //clear the screen
    private void clear(){
        clear.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                editText1.setText("");
                editText2.setText("");
                editText3.setText("");
                editText4.setText("");

                if(editText1.getText().toString().isEmpty()||editText2.getText().toString().isEmpty()||
                editText3.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Please Enter your name,phone and chocolate name you want to pay ",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Delete Successfully",Toast.LENGTH_LONG).show();
                }
            }
        });


    }
    //view data
    private void read(){

     //   return read.setOnClickListener(new View.OnClickListener() {
         //   @Override
           // public void onClick(View v) {
                //  Cursor r=myDb.getAllData();
                // if(r.getCount()==0)
                // {
                //     showMessage("Error", "Nothing found");
                //     return;
                //  }
                // StringBuffer b=new StringBuffer();
                //  while(r.moveToNext())
                //  {
                //      b.append("Name:"+r.getString(0)+"\n");
                //     b.append("phone:"+r.getString(1)+"\n");
                //     b.append("price:"+r.getString(2)+"\n");
                //  }

                //  showMessage("Student Details",b.toString());
                //   }
                //   });

                //  }


                //
                // //});

            }

}