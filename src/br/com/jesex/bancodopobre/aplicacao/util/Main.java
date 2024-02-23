package br.com.jesex.bancodopobre.aplicacao.util;

import br.com.jesex.bancodopobre.dominio.entidades.*;
import br.com.jesex.bancodopobre.servico.*;

public class Main {
	public static void main(String[] args) {

		CadastrarCliente novoCliente = new CadastrarCliente();
		Cliente cliente = novoCliente.cadastrarCliente("Jesex");

		CriarConta criarConta = new CriarConta();
		Conta contaCorrente = criarConta.criarContaCorrente(cliente);
		Conta contaPoupanca = criarConta.criarContaPoupanca(cliente);

		contaCorrente.depositar(1000);
		contaPoupanca.depositar(1000);

		contaCorrente.imprimirExtrato();
		contaPoupanca.imprimirExtrato();

		contaCorrente.sacar(100);
		contaPoupanca.sacar(100);

		contaCorrente.imprimirExtrato();
		contaPoupanca.imprimirExtrato();

		contaCorrente.transferir(100, contaPoupanca);

		contaCorrente.imprimirExtrato();
		contaPoupanca.imprimirExtrato();
	}

}
