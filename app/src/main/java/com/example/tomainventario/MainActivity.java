package com.example.tomainventario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Se crea los atributos
    private EditText etDate;
    private EditText etCode;
    private EditText etIniTime;
    private EditText etName;
    private EditText etDescription;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instancia de las referencias
        References();
        Events();
    }

    //Encapsulamiento y creacion de coneccion con el layout principal
    private void References(){
        etDate=(EditText) findViewById(R.id.etFecha);
        etCode=(EditText) findViewById(R.id.etCodigo);
        etIniTime=(EditText) findViewById(R.id.etHraInicio);
        etName=(EditText) findViewById(R.id.etNombre);
        etDescription=(EditText) findViewById(R.id.etDescripcion);
        btnNext=(Button) findViewById(R.id.btnSiguiente);
    }

    //Encapsulamiento y creacion de eventos (Metodos)
    private void Events(){
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,InvTwo.class);
                i.putExtra("etDate",etDate.getText());
                i.putExtra("etCode",etCode.getText());
                i.putExtra("etIniTime",etIniTime.getText());
                i.putExtra("etName",etName.getText());
                i.putExtra("etDescription",etDescription.getText());
                System.out.println("Main: "+etName);

                startActivity(i);
                finish();
            }
        });


    }

}

/*
* //tomo los datos de la primera activity
        Bundle b=getIntent().getExtras();
        ArrayList<String> claves=b.getStringArrayList("claves");
        ArrayList<String> valores=b.getStringArrayList("valor");

        //prueba
        clavesA=claves;
        valoresA=valores;
        for(String c:clavesA){
            Log.d("algo",c);
        }
* */
/*
* btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                    //recorrer y mostrar el shared
                    SharedPreferences p=getSharedPreferences("tareas", Context.MODE_PRIVATE);
                    Map<String,?> claves=p.getAll();

                    //Creo dos arraylist valor y key
                    ArrayList<String>dValor=new ArrayList<>();
                    ArrayList<String>dClaves=new ArrayList<>();

                    //Tomo los valores hacia el array
                    for(Map.Entry<String,?> entrada:claves.entrySet()){
                        //Log.d("TAG-","Llaves: "+entrada.getKey()+" Valor: "+entrada.getValue());
                        dClaves.add(entrada.getKey());
                        dValor.add(entrada.getValue().toString());
                    }

                    //ir a la segunda actividad
                    Intent i=new Intent(MainActivity.this,SegundoActivity.class);

                    //Mandar hacia la segunda activity
                    i.putExtra("claves",dClaves);
                    i.putExtra("valor",dValor);

                    //Activo la activity dos
                    startActivity(i);






            }

        });
*
* */