package com.company;

import java.util.SortedMap;


public class Main {
    public static void main(String[] args) throws Exception{
        Sistema.cadastrarClientes();
        Sistema.cadastrarClientes();
        ServicoCliente.exibirClientesCadastrados();
        Sistema.cadastrarClientes();
        ServicoCliente.exibirClientesCadastrados();
        try {
            Sistema.cadastrarClientes();
            Sistema.cadastrarClientes();
            ServicoCliente.exibirClientesCadastrados();
            System.out.println(Sistema.verificarSeOCPFExiste());
        } catch (Exception erro) {
            System.out.println(erro.getMessage());

        }
    }
}



