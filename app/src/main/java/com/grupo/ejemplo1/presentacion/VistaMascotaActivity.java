package com.grupo.ejemplo1.presentacion;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.grupo.ejemplo1.Aplicacion;
import com.grupo.ejemplo1.R;
import com.grupo.ejemplo1.casos_uso.CasosUsoMascota;
import com.grupo.ejemplo1.datos.RepositorioMascotas;
import com.grupo.ejemplo1.modelo.Mascota;

import java.text.DateFormat;
import java.util.Date;


    public class VistaMascotaActivity extends AppCompatActivity {
        private RepositorioMascotas mascotas;
        private CasosUsoMascota usoMascota;
        private int pos;
        private Mascota mascota;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.vista_mascota);
            Bundle extras = getIntent().getExtras();
            pos = extras.getInt("pos", 0);
            mascotas = ((Aplicacion) getApplication()).mascotas;
            usoMascota = new CasosUsoMascota(this, mascotas);
            mascota = mascotas.elemento(pos);
            actualizaVistas();
        }

        public void actualizaVistas() {
            TextView nombre = findViewById(R.id.nombre);
            nombre.setText(mascota.getNombre());

       /* ImageView logo_tipo = findViewById(R.id.logo_tipo);
        logo_tipo.setImageResource(lugar.getTipo().getRecurso());

        TextView tipo = findViewById(R.id.tipo);
        tipo.setText(lugar.getTipo().getTexto());*/

            TextView direccion = findViewById(R.id.direccion);
            direccion.setText(mascota.getDireccion());

            TextView telefono = findViewById(R.id.telefono);
            telefono.setText(Integer.toString(mascota.getTelefono()));

            TextView url = findViewById(R.id.url);
            url.setText(mascota.getUrl());

            TextView comentario = findViewById(R.id.comentario);
            comentario.setText(mascota.getComentario());

            TextView fecha = findViewById(R.id.fecha);
            fecha.setText(DateFormat.getDateInstance().format(
                    new Date(mascota.getFecha())));

            TextView hora = findViewById(R.id.hora);
            hora.setText(DateFormat.getTimeInstance().format(
                    new Date(mascota.getFecha())));

            RatingBar valoracion = findViewById(R.id.valoracion);
            valoracion.setRating(mascota.getValoracion());

            valoracion.setOnRatingBarChangeListener(
                    new RatingBar.OnRatingBarChangeListener() {
                        @Override
                        public void onRatingChanged(RatingBar ratingBar, float valor,
                                                    boolean fromUser) {
                            mascota.setValoracion(valor);
                        }
                    });
        }
    }


