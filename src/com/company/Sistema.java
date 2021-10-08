package com.company;

import java.util.Scanner;


public class Sistema {

    //Método capturar dados

    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
}
