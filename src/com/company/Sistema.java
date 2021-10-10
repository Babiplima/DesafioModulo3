package com.company;

import java.util.Scanner;


public class Sistema {

    //Método capturar dados

    public static Scanner capturarDados(String mensagem) {
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

    //Método verificar se o email existe (Percorrer a lista)

    public static Cliente verificarSeOCPFExiste() throws Exception{
        String cpfBusca = capturarDados("\nDigite o CPF do cliente que deseja buscar: ").nextLine();

        return ServicoCliente.verificarSeOCPFExiste(cpfBusca);
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

    public static Venda cadastrarVenda() throws Exception {

        String emailVendedor = capturarDados("Digite o email do vendedor: ").nextLine();
        ServicoVendedor.verificarSeOEmailExiste(emailVendedor);
        String cpfCliente = capturarDados("Digite o cpf do cliente: ").nextLine();
        double valorVenda = capturarDados("Digite o valor da venda ").nextDouble();
        String dataDeVenda = capturarDados("Digite a data da venda: ").nextLine();
        return ServicoVenda.cadastrarVenda(vendedor, cliente, valor, data);
    }

    //Método executar

    public static void executar()throws Exception {

        boolean continuarMenu = true;

        while (continuarMenu) {
            menu();
            int opcaoDoUsuario = capturarDados("Digite a opção desejada: ").nextInt();
            if (opcaoDoUsuario == 1) {
                Venda venda = cadastrarVenda();
                System.out.println(venda);
            } else if (opcaoDoUsuario == 2) {
                ServicoCliente.exibirClientesCadastrados();
            } else if (opcaoDoUsuario == 3) {
                ServicoVendedor.listarVendedores();
            } else if (opcaoDoUsuario == 4) {
                ServicoVenda.listarVendas();
            } else if (opcaoDoUsuario == 5) {
                System.out.println("Muito obrigada volte sempre. ");
                continuarMenu = false;
            }

        }

    }
}



