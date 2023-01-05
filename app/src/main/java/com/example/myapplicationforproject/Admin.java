package com.example.myapplicationforproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Admin extends AppCompatActivity {
ListView listView1;
EditText inputtext1;

EditText name;
Button add,update,delete,home;

ArrayList<String> chocolate = new ArrayList<String>();
ArrayAdapter myAdapter1;

Integer indexVal;
String item;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        //declaration attributes
        ;
        name=(EditText) findViewById(R.id.editTextTexName);
        add =(Button) findViewById(R.id.btnadd);
        delete = (Button) findViewById(R.id.btnupdate);
        update=(Button) findViewById(R.id.btnupdate);
        inputtext1 =(EditText) findViewById(R.id.editTextTexName);

        //setup listview
        chocolate.add("chocolate1");
        chocolate.add("chocolate2");
        myAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, chocolate);
        listView1.setAdapter(myAdapter1);

        //to add items
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringVal1 = inputtext1.getText().toString();
                chocolate.add(stringVal1);
                myAdapter1.notifyDataSetChanged();

                inputtext1.setText("");
                if(name.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"please enter the chocolate name you want to add ",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Added Success",Toast.LENGTH_LONG).show();
                }
            }
        });




        //to update items
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringval = inputtext1.getText().toString();
                chocolate.set(indexVal,stringval);
                myAdapter1.notifyDataSetChanged();

                if(name.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"please enter the chocolate name you want to update ",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Update Successfully",Toast.LENGTH_LONG).show();
                }
            }
        });

        //to delete items
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long L) {
                        item = adapterView.getItemIdAtPosition(i) + "has been deleted";
                        Toast.makeText(Admin.this,item,Toast.LENGTH_SHORT).show();

                        chocolate.remove(i);
                        myAdapter1.notifyDataSetChanged();

                        if(name.getText().toString().isEmpty()){
                            Toast.makeText(getApplicationContext(),"Please Enter the chocolate name you want to delete ",Toast.LENGTH_LONG).show();
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "Delete Successfully",Toast.LENGTH_LONG).show();
                        }

                    }
                });

                home = (Button) findViewById(R.id.button4);
                home.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openHome();
                    }

                    private void openHome() {
                    }
                });
            }
        });

    }
}