package com.grupo.ejemplo1;

import android.app.Application;

import com.grupo.ejemplo1.datos.MascotasLista;
import com.grupo.ejemplo1.datos.RepositorioMascotas;

public class Aplicacion extends Application {
    public RepositorioMascotas mascotas = new MascotasLista();

    @Override public void onCreate() {
        super.onCreate();
    }
    //get de repositoriomascotas
    public RepositorioMascotas getMascotas() {

        return mascotas;
    }
}
