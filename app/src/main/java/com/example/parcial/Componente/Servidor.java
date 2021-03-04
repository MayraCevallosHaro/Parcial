package com.example.parcial.Componente;

import com.example.examen.Paises;
import com.example.parcial.Paises;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Servidor {
    @GET("es")
    Call<List<Paises>> getPaises();
}
