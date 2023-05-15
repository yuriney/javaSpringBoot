package io.github.yuriney.service;


import io.github.yuriney.model.Cliente;
import io.github.yuriney.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienstesService {

    private ClientesRepository repository;

    @Autowired

    public ClienstesService(ClientesRepository repository){
        this.repository = repository;
    }
    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){
        //aplica validações
    }
}
//essa classe passará a base de clientes. (salvar, deletar e editar)
