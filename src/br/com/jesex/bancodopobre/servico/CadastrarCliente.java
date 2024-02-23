package br.com.jesex.bancodopobre.servico;

import br.com.jesex.bancodopobre.dominio.entidades.Cliente;

public class CadastrarCliente {

    public Cliente cadastrarCliente(String nome) {
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        return cliente;
    }
    

}
