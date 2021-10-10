package com.company;

import java.util.SortedMap;


public class Main {
    public static void main(String[] args) throws Exception{

        try {
            Sistema.cadastrarVendedores();
            Sistema.cadastrarClientes();
            System.out.println(Sistema.cadastrarVenda());
        } catch (Exception erro) {
            System.out.println(erro.getMessage());

        }
    }
}



