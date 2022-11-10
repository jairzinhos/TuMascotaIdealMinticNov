package com.grupo.ejemplo1.modelo;

public enum TipoMascota {
    //espacio de objetos

    OTROS ("Otros", 5),
    PERRO ("Perro",3),
    GATO ("Gato",6)
    //RESTAURANTE ("Restaurante", 2),
    //BAR ("Bar", 6),
    //COPAS ("Copas", 0),
    //ESPECTACULO ("Espectáculo", 0),
    //HOTEL ("Hotel", 0),
    //COMPRAS ("Compras", 0),
    //EDUCACION ("Educación", 0),
    //DEPORTE ("Deporte", 0),
    //NATURALEZA ("Naturaleza", 0),
    //GASOLINERA ("Gasolinera", 0)

    ;

    //atributos
    private final String texto;
    private final int recurso;

    //constructor
    TipoMascota(String texto, int recurso) {
        this.texto = texto;
        this.recurso = recurso;
    }

    //Metodos


    public String getTexto() {
        return texto;
    }

    public int getRecurso() {
        return recurso;
    }
}
