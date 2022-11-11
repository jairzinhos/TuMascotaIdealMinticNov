package com.grupo.ejemplo1.casos_uso;

import android.app.Activity;
import android.content.Intent;

import com.grupo.ejemplo1.presentacion.AcercaDeActivity;

public class CasosUsosActividades {
    protected Activity actividad;

    //constructor de la clase
    public CasosUsosActividades(Activity actividad) {

        this.actividad = actividad;
    }
    public void lanzarAcercaDe() {
        actividad.startActivity(new Intent(actividad,
                AcercaDeActivity.class));}
}
