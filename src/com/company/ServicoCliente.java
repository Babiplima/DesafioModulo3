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

    // verificar se o email existe (Percorrer a lista)

    public static void verificarSeOEmailExiste(String email)  {
        for (Cliente clienteReferencia : clientes) {
            if (clienteReferencia.getEmail().equals(email));
            else {
                System.out.println("E-mail não cadastrado ");
           }
        }
    }
    //Método listar

    public static void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}
