package com.company;

import java.util.ArrayList;
import java.util.List;

public class ServicoCliente {

    //Lista para armazenar clientes

    private static List<Cliente> clientes = new ArrayList<>();


    //Método para validar email

    public static void validarEmail(String email) throws Exception {
        if (!email.contains("@")) {
            throw new Exception("Email digitado inválido!");
        }
    }
    //Método para verificar cpf

    public static void verificarCpfCliente(String cpf) throws Exception {
        for (Cliente referencia : clientes) {
            if (referencia.getCpf().equals(cpf)) {
                throw new Exception("Cpf já cadastrado!");
            }
        }
    }
    //Método para verificar cpf

    public static void verificarEmailCliente(String email) throws Exception {
        for (Cliente referencia : clientes) {
            if (referencia.getEmail().equalsIgnoreCase(email)) {
                throw new Exception("Email já cadastrado!");
            }
        }
    }

    //Método cadastrar cliente


    public static Cliente cadastrarClientes(String nome, String cpf, String email) {

        Cliente cliente = new Cliente(nome, cpf, email);
        clientes.add(cliente);
        return cliente;
    }


    //Método exiba lista

    public static List<Cliente> exibirClientesCadastrados() {
        for (Cliente referencia : clientes) {
            System.out.println(referencia);
        }

        return clientes;
    }
    public static Cliente buscarCliente(String cpfBusca) throws Exception{
        for (Cliente referencia:clientes){
            if(referencia.getCpf().equals(cpfBusca)){
                return referencia;
            }
        }
        throw new Exception("\nCliente não encontrado!");
    }

}


