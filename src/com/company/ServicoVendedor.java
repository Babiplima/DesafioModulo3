package com.company;

import java.util.ArrayList;
import java.util.List;

public class ServicoVendedor {

    //Lista para armazenar vendedores

    private static List<Vendedor> vendedores = new ArrayList<>();


    //Método cadastrar vendedores


    public static Vendedor cadastrarVendedores(String nome, String cpf, String email) {

        Vendedor vendedor = new Vendedor(nome, cpf, email);
        vendedores.add(vendedor);
        return vendedor;
    }
    // verificar se o email existe (Percorrer a lista)

    public static void verificarSeOEmailExiste(String email) {
        for (Vendedor vendedorReferencia : vendedores) {
            if (vendedorReferencia.getEmail().equals(email)) ;
            else {
                System.out.println("E-mail não cadastrado ");
            }
        }

        //Método listar

        public static void listarVendedores () {
            for (Vendedor vendedor : vendedores) {
                System.out.println(vendedor);
            }
        }
    }
}
