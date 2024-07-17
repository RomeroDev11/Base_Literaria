package com.example.Base_Literaria.service.conversor;

public interface IConversor {
    <T> T obtenerDatos(String json, Class<T> clase);
}
