package br.com.jesex.bancodopobre.servico;

import br.com.jesex.bancodopobre.dominio.entidades.*;

public class CriarConta {

    public Conta criarContaCorrente(Cliente cliente) {
        return new ContaCorrente(cliente);
    }

    public Conta criarContaPoupanca(Cliente cliente) {
        return new ContaPoupanca(cliente);
    }

}
