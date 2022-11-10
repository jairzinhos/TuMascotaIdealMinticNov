package com.grupo.ejemplo1.datos;

import com.grupo.ejemplo1.modelo.Mascota;
import com.grupo.ejemplo1.modelo.TipoMascota;

import java.util.ArrayList;

public class MascotasLista implements RepositorioMascotas {
    protected ArrayList<Mascota> listaMascotas;

    public MascotasLista() {
        listaMascotas = new ArrayList<>();
        añadeEjemplos();
    }


    @Override
    public Mascota elemento(int id) {
        return listaMascotas.get(id);
    }

    @Override
    public void añadir(Mascota mascotica) {
        listaMascotas.add(mascotica);


    }

    @Override
    public int nuevo() {
        Mascota mascotica2 = new Mascota();
        listaMascotas.add(mascotica2);
        return listaMascotas.size()-1;

    }

    @Override
    public void borrar(int id) {
        listaMascotas.remove(id);


    }

    @Override
    public int tamaño() {
        return listaMascotas.size();
    }

    @Override
    public void actualizar(int id, Mascota mascotica) {
        listaMascotas.set(id,mascotica);

    }
    public void añadeEjemplos(){
        añadir(new Mascota("Simon", "Cra 85 # 34-21", 54.511, 45.191, TipoMascota.PERRO,
                6341673, "http://www.simon.co","Un amigo más",5));
        añadir(new Mascota("Lucio", "Cra 95 # 34-21", 44.511, 15.191, TipoMascota.GATO,
                6333673, "http://www.lucio.co","Un parcero más",4));
        añadir(new Mascota("Nico", "Cra 97 # 33-21", 43.511, 12.191, TipoMascota.OTROS,
                6333123, "http://www.Nick.co","Un aboganster más",4));
        añadir(new Mascota("Mico", "Cra 47 # 33-21", 23.511, 22.191, TipoMascota.OTROS,
                6333123, "http://www.Mick.co","Un mono más",5));

        añadir(new Mascota("Sura", "Cra 47 # 33-21, Bogotá", 46.511, 27.191, TipoMascota.OTROS,
                6333123, "http://www.Sura.co","Un palomita",5));
    }
}
