package com.example.tomainventario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InvThree extends AppCompatActivity {

    //Declaracion de atributos
    private EditText etTimeFinish;
    private Button btnBackIT;
    private Button btnSend;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inv_three);
        References();
        Events();
    }

    private void References(){
        //Encapsulacion y coneccion con los layout
        etTimeFinish=(EditText)findViewById(R.id.etFinishTime);
        btnBackIT=(Button)findViewById(R.id.btnBackIvtThree);
        btnSend=(Button) findViewById(R.id.btnSend);
    }
    private void Events(){
        //i.putExtra("rbGoodCondition",rbGoodCondition.isChecked());
        //Bundle b = getIntent().getExtras();
        /* i.putExtra("etDate",etDate.toString());
                    i.putExtra("etCode",etCode.toString());
                    i.putExtra("etIniTime",etIniTime.toString());
                    i.putExtra("etName",etName.toString());
                    i.putExtra("etDescription",etDescription.toString());
                    i.putExtra("etArtName",etArtName.getText());
                    i.putExtra("etArkCount",etArtCount.getText());*/

        Bundle b= getIntent().getExtras();
        String etDate=b.getString("etDate");
        String etCode=b.getString("etCode");
        String etIniTime=b.getString("etIniTime");
        String etName=b.getString("etName");
        String etDescription=b.getString("etDescription");
        String etArtName=b.getString("etArtName");
        String etArtCount=b.getString("etArtCount");



        btnBackIT.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick( View view ){
                Intent i= new Intent(InvThree.this,InvTwo.class);

                try{
                    i.putExtra("etDate",etDate.toString());
                    i.putExtra("etCode",etCode.toString());
                    i.putExtra("etIniTime",etIniTime.toString());
                    i.putExtra("etName",etName.toString());
                    i.putExtra("etDescription",etDescription.toString());
                    i.putExtra("etArtName",etArtName);
                    i.putExtra("etArkCount",etArtCount);
                }catch (Exception e){
                    System.out.println(e);
                }

                startActivity(i);
                finish();
            }
        });

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Aqui dentro");
                System.out.println(etDate);
                System.out.println(etCode);
                System.out.println(etIniTime);
                System.out.println(etName);
                System.out.println(etDescription);
                System.out.println(etArtName);
                System.out.println(etArtCount);
            }
        });
    }
}