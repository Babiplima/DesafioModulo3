package com.company;

import java.util.ArrayList;
import java.util.List;

public class ServicoVendedores {

    //Lista para armazenar vendedores

    private static List<Vendedores> vendedores = new ArrayList<>();


    //Método cadastrar vendedores


    public static Clientes cadastrarVendedores(String nome, String cpf, String email) throws Exception {

        Vendedores vendedores = new Vendedores(nome, cpf, email, Clientes);
        vendedores.add(vendedores);
        return Vendedores;
    }

    //Método listar

    public static void listarVendedores() {
        for (Vendedores vendedores : vendedores) {
            System.out.println(vendedores);
        }
    }
}
