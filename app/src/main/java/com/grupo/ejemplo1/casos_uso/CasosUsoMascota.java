package com.grupo.ejemplo1.casos_uso;

import android.app.Activity;
import android.content.Intent;
import com.grupo.ejemplo1.datos.RepositorioMascotas;
import com.grupo.ejemplo1.presentacion.VistaMascotaActivity;

public class CasosUsoMascota {

    private Activity actividad;
    private RepositorioMascotas mascotas;

    //constructor de la clase
    public CasosUsoMascota(Activity actividad, RepositorioMascotas mascotas) {
        this.actividad = actividad;
        this.mascotas = mascotas;
    }
    // OPERACIONES BÁSICAS
    public void mostrar(int pos) {
        Intent mostrar = new Intent(actividad, VistaMascotaActivity.class);
        mostrar.putExtra("pos", pos);
        actividad.startActivity(mostrar);
    }

}
