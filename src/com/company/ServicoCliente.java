package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicoCliente {

    //Lista para armazenar clientes

    private static List<Cliente> clientes = new ArrayList<>();

    //Método capturar dados

    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }


    //Método cadastrar cliente


    public static Cliente cadastrarClientes(String nome, String cpf, String email) {

        Cliente cliente = new Cliente(nome, cpf, email);
        clientes.add(cliente);
        return cliente;
    }

    //Método exiba lista

    public static List<Cliente> exibirClientesCadastrados(){
        for (Cliente referencia:clientes){
            System.out.println(referencia);
        }

        return clientes;
    }
    // verificar se o email existe (Percorrer a lista)

    public static Cliente verificarSeOCPFExiste(String cpf) throws Exception{
        for (Cliente clienteReferencia : clientes) {
            if (clienteReferencia.getCpf().equals(cpf)) {
                return clienteReferencia;
            }
        }
        throw new Exception("CPF não cadastrado");
    }


}


