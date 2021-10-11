package com.company;

import java.util.ArrayList;
import java.util.List;

public class ServicoVendedor {


    //Lista para armazenar vendedores

    private static List<Vendedor> vendedores = new ArrayList<>();


  //Método verificar cpf vendedor

    public static void verificarCpfVendedor(String cpf) throws Exception {
        for (Vendedor referencia : vendedores) {
            if (referencia.getCpf().equals(cpf)) {
                throw new Exception("\nCPF já cadastrado!");
            }
        }
    }
    //Método verificar email vendedor

    public static void verificarEmailVendedor(String email) throws Exception {
        for (Vendedor referencia : vendedores) {
            if (referencia.getEmail().equalsIgnoreCase(email)) {
                throw new Exception("Email já cadastrado!");
            }
        }
    }

    //Método cadastrar vendedores

    public static Vendedor cadastrarVendedores(String nome, String cpf, String email) {
        Vendedor vendedor = new Vendedor(nome, cpf, email);
        vendedores.add(vendedor);
        return vendedor;
    }

    //Método exiba lista

    public static List<Vendedor> exibirVendedorCadastrados() {
        for (Vendedor referencia : vendedores) {
            System.out.println(referencia);
        }

        return vendedores;

    }

    public static Vendedor buscarVendedor(String emailBusca) throws Exception {
        for (Vendedor referencia : vendedores) {
                if (referencia.getEmail().equalsIgnoreCase(emailBusca)) {
                    return referencia;
                }
            }
            throw new Exception("\nVendedor não encontrado!");
        }
    }


