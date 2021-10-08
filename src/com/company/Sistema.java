package com.company;

import java.util.Scanner;


public class Sistema {

    //Método capturar dados

    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //Método cadastrar cliente

    public static Cliente cadastrarClientes() {

        String nome = capturarDados("Digite o nome do cliente: ").nextLine();
        String cpf = capturarDados("Digite o cpf do cliente: ").nextLine();
        String email = capturarDados("Digite o email do cliente: ").nextLine();

        return ServicoCliente.cadastrarClientes(nome, cpf, email);
    }
    //Método cadastrar vendedor

    public static Vendedor cadastrarVendedores() {

        String nome = capturarDados("Digite o nome do vendedor: ").nextLine();
        String cpf = capturarDados("Digite o cpf do vendedor: ").nextLine();
        String email = capturarDados("Digite o email do vendedor: ").nextLine();

        return ServicoVendedor.cadastrarVendedores(nome, cpf, email);

    }

    public static void menu() {
        System.out.println("Bem vindos É do Bem Comidas Saudáveis ");

        System.out.println("Digite 1 - para registrar uma venda. ");
        System.out.println("Digite 2 - para listar clientes. ");
        System.out.println("Digite 3 - para listar vendedores. ");
        System.out.println("Digite 4 - para apresentar as vendas registradas. ");
        System.out.println("Digite 5 - para sair. ");
    }

    public static Venda cadastrarVenda() {

        String emailVendedor = capturarDados("Digite o email do vendedor: ").nextLine();
        ServicoVendedor.verificarSeOEmailExiste(emailVendedor);
        String emailCliente = capturarDados("Digite o email cliente: ").nextLine();
        ServicoCliente.verificarSeOEmailExiste(emailCliente);
        double valorVenda = capturarDados("Digite o valor da venda ").nextDouble();
        String dataDeVenda = capturarDados("Digite a data da venda: ").nextLine();
        return cadastrarVenda();
    }

    //Método executar

    public static boolean executar() {

        boolean continuarMenu = true;

        while (continuarMenu) {
            menu();
            int opcaoDoUsuario = capturarDados("Digite a opção desejada: ").nextInt();
            // Cadastrar consumidor
            if (opcaoDoUsuario == 1) {
                cadastrarVenda();
            } else if (opcaoDoUsuario == 2) {
                ServicoCliente.listarClientes();
            } else if (opcaoDoUsuario == 3) {
                ServicoVendedor.listarVendedores();
            } else if (opcaoDoUsuario == 4) {
                ServicoVenda.listarVendas();
            } else if (opcaoDoUsuario == 5) {
                continuarMenu = false;
                System.out.println("Muito obrigada volte sempre. ");
            }
        }
        return continuarMenu;
    }
}


