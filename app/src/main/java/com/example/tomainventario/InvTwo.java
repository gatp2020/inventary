package com.example.tomainventario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class InvTwo extends AppCompatActivity {

    //Declaracion de atributos

    private EditText etArtName;
    private EditText etArtCount;
    private RadioGroup rgConditions;
    private RadioButton rbGoodCondition;
    private RadioButton rbBadCondition;
    private Button btnBack;
    private Button btnNext2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inv_two);

        //Instancia de las referencias
        References();
        Events();
    }

    //Encapsulacion y coneccion con el layout
    private void References(){
        etArtName=(EditText) findViewById(R.id.etArtName);
        etArtCount=(EditText) findViewById(R.id.etArtCount);
        rgConditions=(RadioGroup) findViewById(R.id.rgEstados);
        rbGoodCondition=(RadioButton) findViewById(R.id.rbGoodConditionOne);
        rbBadCondition=(RadioButton) findViewById(R.id.rbBadCondition);
        btnNext2=(Button) findViewById(R.id.btnNextTwo);
        btnBack=(Button) findViewById(R.id.btnBack);
    }

    //Encapsulacion y creacion eventos o metodos
    private void Events(){

        /*String etDate = "";
        String etCode = "";
        String etIniTime = "";
        String etName = "";
        String etDescription = "";*/

        Bundle b=getIntent().getExtras();
        String etDate =valNull(b.getString("etDate"));
        String etCode = valNull(b.getString("etCode"));
        String etIniTime = valNull(b.getString("etIniTime"));
        String etName = valNull(b.getString("etName"));
        String etDescription = valNull(b.getString("etDescription"));



        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i= new Intent(InvTwo.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        btnNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(InvTwo.this,InvThree.class);
                try{
                    i.putExtra("etDate",etDate.toString());
                    i.putExtra("etCode",etCode.toString());
                    i.putExtra("etIniTime",etIniTime.toString());
                    i.putExtra("etName",etName.toString());
                    i.putExtra("etDescription",etDescription.toString());
                    i.putExtra("etArtName",etArtName.getText());
                    i.putExtra("etArkCount",etArtCount.getText());
                    System.out.println("InvTwo: "+etName);

                }catch (Exception e){
                    System.out.println(e);
                }


                //i.putExtra("rbGoodCondition",rbGoodCondition.isChecked());
                //System.out.println("Envio G "+rbGoodCondition.isChecked());
                //i.putExtra("rbBadCondition",rbBadCondition.isChecked());
                //System.out.println("Envio B "+rbBadCondition.isChecked());

                startActivity(i);
                finish();
            }
        });
    }
    //metodo para validar nulls
    public String valNull(String i){
        if(i==null){
           i="";
           return i;
        }
        return i;
    }


}