package com.company;

import java.util.ArrayList;
import java.util.List;

public class ServicoCliente {

    //Lista para armazenar clientes

    private static List<Clientes> clientes = new ArrayList<>();


    //Método cadastrar cliente


    public static Clientes cadastrarClientes(String nome, String cpf, String email) throws Exception {

        Clientes clientes = new Clientes(nome, cpf, email);
        clientes.add(clientes);
        return clientes;
    }

    //Método listar

    public static void listarClientes() {
        for (Clientes clientes : clientes) {
            System.out.println(clientes);
        }

    }
}
