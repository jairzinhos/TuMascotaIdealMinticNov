package com.grupo.ejemplo1.datos;

import com.grupo.ejemplo1.modelo.Mascota;

// Una interface es una clase que solo permite definir métodos
public interface RepositorioMascotas {
    Mascota elemento(int id); //Devuelve el elemento dado su id
    void añadir(Mascota mascotica); //añade el elemento indicado
    int nuevo();//Añade un elemento en blanco y devuelve su id
    void borrar(int id); //Eliminar el elemento con el id indicado
    int tamaño(); //Calcular el número de elementos
    void actualizar(int id, Mascota mascotica); //Reemplaza el elemento
}
