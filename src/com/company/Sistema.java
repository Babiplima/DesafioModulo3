package com.company;

import java.util.Scanner;


public class Sistema {

    //Método capturar dados

    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menu(){
        System.out.println("Bem vindos É do Bem Comidas Saudáveis ");
        System.out.println("Digite 1 - para cadastrar um cliente. ");
        System.out.println("Digite 2 - para cadastrar um vendedor. ");
        System.out.println("Digite 3 - para registrar uma venda. ");
        System.out.println("Digite 4 - para listar clientes. ");
        System.out.println("Digite 5 - para listar vendedores. ");
        System.out.println("Digite 6 - para apresentar as vendas registradas. ");
        System.out.println("Digite 7 - para sair. ");
    }


}
