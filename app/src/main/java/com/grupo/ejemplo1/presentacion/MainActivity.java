package com.grupo.ejemplo1.presentacion;

/*import static com.grupo.ejemplo1.R.id.snackbar_text;
import static com.grupo.ejemplo1.R.id.toolbar_Main;
import androidx.annotation.NonNull;*/

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.grupo.ejemplo1.Aplicacion;
import com.grupo.ejemplo1.casos_uso.CasosUsoMascota;
import com.grupo.ejemplo1.casos_uso.CasosUsosActividades;
import com.grupo.ejemplo1.datos.MascotasLista;
import com.grupo.ejemplo1.R;
import com.grupo.ejemplo1.datos.RepositorioMascotas;


public class MainActivity extends AppCompatActivity {
    //Atributos de MainActivity
    TextView mensaje;
    private Button btnSalir;
    private RepositorioMascotas mascotas;
    private CasosUsoMascota usoMascota;

    private CasosUsosActividades usoActividades;


    //Métodos del MainActivity


    public void lanzarVistaMascota(View view){
        final EditText entrada = new EditText(this);
        entrada.setText("0");
        new AlertDialog.Builder(this)
                .setTitle("Selección de mascota")
                .setMessage("indica su id:")
                .setView(entrada)
                .setPositiveButton("Ok", new
                        DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int
                                    whichButton) {
                                int id = Integer.parseInt
                                        (entrada.getText().toString());
                                usoMascota.mostrar(id);
                            }})
                .setNegativeButton("Cancelar", null)
                .show();
    }
    //Método para que cuando se dé clic al botón acerca de haga lo sigueinte. Definimos un intento u operación
    //para abrir

    public void lanzarAcercaDe(View v){
        Intent abrir= new Intent(this, AcercaDeActivity.class);
        startActivity(abrir);
    }


/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //barra de acciones
        Toolbar toolbar = findViewById(R.id.toolbar_Main);
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolbarLayout = findViewById(R.id.toolbar_layout_Main);
        toolbar.setTitle(getTitle());

        FloatingActionButton fab = findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(view,R.string.mensaje_fab, Snackbar.LENGTH_LONG)
                        .setAction("Accion",null).show();

            }
        });

        MascotasLista mascotas = new MascotasLista();
        mascotas.añadeEjemplos();
        for (int i = 0; i < mascotas.tamaño(); i++) {
            System.out.println(i + mascotas.elemento(i).toString());

        }



        /*Mascota mascota = new Mascota("Suta", "Cra 47 # 33-21, Bogotá", 46.511, 27.191, TipoMascota.OTROS,
                6333123, "http://www.Suta.co","Un Suro",5);*/

        //mensaje = findViewById(R.id.txtNombre);    //findViewById(R.id.txt_mensaje);
        //mensaje.setText(mascota.toString());*/
        /*Log.d("Tag en Main","Mensaje prueba por el logcat");//+lugar.toString());

        Log.d("Tag en Main Activity", "Bienvenidos triupulantes c4");*/


        @Override
        public boolean onCreateOptionsMenu(Menu menu){
            getMenuInflater().inflate(R.menu.menu_main,menu);
            return true;

        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();
            if(id == R.id.ajustes){
                Log.d("Tag en Main", "Clic en la opción ajustes");
                return true;
            }
            if (id == R.id.acercaDe){
                usoActividades.lanzarAcercaDe();
                return true;
            }
            if (id == R.id.menu_buscar){

                lanzarVistaMascota(null);
                Log.d("Tag main","clic a la opcion buscar");
                return true;
            }
            if (id == R.id.menu_usuario){
                return true;
            }
            if (id == R.id.menu_mapa){
                return true;
            }
            return super.onOptionsItemSelected(item);
        }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //barra de acciones
        Toolbar toolbar = findViewById(R.id.toolbar_Main);
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolbarLayout = findViewById(R.id.toolbar_layout_Main);
        toolbar.setTitle(getTitle());
        //Funcionalidad a ese botón
        FloatingActionButton fab = findViewById(R.id.floatingActionButton);

        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Snackbar.make(v, R.string.mensaje_fab, Snackbar.LENGTH_LONG)
                        .setAction("Accion",null).show();

            }
        });

        /*MascotasLista mascotas = new MascotasLista();
        mascotas.añadeEjemplos();
        for (int i = 0; i < mascotas.tamaño(); i++) {
            System.out.println(i + mascotas.elemento(i).toString());

        }



        /*Mascota mascota = new Mascota("Suta", "Cra 47 # 33-21, Bogotá", 46.511, 27.191, TipoMascota.OTROS,
                6333123, "http://www.Suta.co","Un Suro",5);*/

        //mensaje = findViewById(R.id.txtNombre);    //findViewById(R.id.txt_mensaje);
        //mensaje.setText(mascota.toString());*/
        //Log.d("Tag en Main","Mensaje prueba por el logcat");//+lugar.toString());

        Log.d("Tag en Main Activity", "Bienvenidos triupulantes c4");


        //botón Salir
        btnSalir = findViewById(R.id.button04);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });

        mascotas =((Aplicacion)getApplication()).mascotas;
        usoMascota = new CasosUsoMascota(this,mascotas);

        usoActividades = new CasosUsosActividades(this);
    }
}