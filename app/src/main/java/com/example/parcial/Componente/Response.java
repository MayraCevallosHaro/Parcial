package com.example.parcial.Componente;
import com.example.parcial.Paises;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Response {
    @SerializedName("Paises")
    @Expose
    private List<com.example.parcial.Paises> Paises;
}

