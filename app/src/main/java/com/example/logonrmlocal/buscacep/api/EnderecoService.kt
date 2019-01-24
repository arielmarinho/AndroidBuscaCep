package com.example.logonrmlocal.buscacep.api

import com.example.logonrmlocal.buscacep.model.Endereco
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface EnderecoService{
    //base url/ws/pathvariable
    //variacao no caminho
    @GET("ws/{cep}/json/")

    fun buscar(@Path("cep")cep: String):Call<Endereco>
}