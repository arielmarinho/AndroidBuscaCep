package com.example.logonrmlocal.buscacep.ui.pesquisar

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.logonrmlocal.buscacep.model.Endereco
import com.example.logonrmlocal.buscacep.repository.EnderecoRepository

class PesquisaViewModel : ViewModel(){
    val enderecoRepository = EnderecoRepository()
    val endereco = MutableLiveData<Endereco>()
    val mensagemErro = MutableLiveData<String>()
    fun buscar(cep: String){
        enderecoRepository.buscar(
                cep,
                onComplete = {
                    endereco.value = it
                    mensagemErro.value = ""

                },
                onError = {
                    endereco.value = null
                    mensagemErro.value = it?.message

                }

        )
    }
}