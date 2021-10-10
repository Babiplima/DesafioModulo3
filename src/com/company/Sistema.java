package com.company;

import java.util.Scanner;


public class Sistema {

    //Método capturar dados

    public static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menuCadastro() {
        System.out.println("Bem vindos É do Bem Comidas Saudáveis ");
        System.out.println("Digite 1 para cadastrar um cliente");
        System.out.println("Digite 2 para cadastrar um vendedor");
        System.out.println("Digite 3 para registro de venda");
        System.out.println("Digite 4 para mostrar cadastros");
        System.out.println("Digite 5 para sair ");
    }

    //Método menu Mostrar Cadastros

    public static void menuMostrarCadastrados() {
        System.out.println("Digite 1 - para mostrar todos os clientes cadastrados.");
        System.out.println("Digite 2 - para mostrar todos os vendedores cadastrados.");
        System.out.println("Digite 3 - para mostrar as vendas cadastrada.");
        System.out.println("Digite 4 - para retornar ao menu principal.");
    }


    //Método cadastrar cliente

    public static Cliente cadastrarClientes() {

        String nome = capturarDados("Digite o nome do cliente: ").nextLine();
        String cpf = capturarDados("Digite o cpf do cliente: ").nextLine();
        String email = capturarDados("Digite o email do cliente: ").nextLine();

        return ServicoCliente.cadastrarClientes(nome, cpf, email);
    }

    //Método verificar se o email existe (Percorrer a lista)

    public static Cliente verificarSeOCPFExisteCLiente() throws Exception {
        String cpfBusca = capturarDados("\nDigite o CPF do cliente que deseja buscar: ").nextLine();

        return ServicoCliente.verificarSeOCPFExisteCliente(cpfBusca);
    }
    //Método cadastrar vendedor

    public static Vendedor cadastrarVendedores() {

        String nome = capturarDados("Digite o nome do vendedor: ").nextLine();
        String cpf = capturarDados("Digite o cpf do vendedor: ").nextLine();
        String email = capturarDados("Digite o email do vendedor: ").nextLine();

        return ServicoVendedor.cadastrarVendedores(nome, cpf, email);

    }


    public static Vendedor verificarSeOEmailExisteVendedor() throws Exception {
        String emailBusca = capturarDados("\nDigite o emil do vendedor que deseja buscar: ").nextLine();

        return ServicoVendedor.verificarSeOEmailExiste(emailBusca);
    }

    //Método cadastrar venda

    public static Venda cadastrarVenda() throws Exception {

        Cliente cliente = Sistema.verificarSeOCPFExisteCLiente();
        Vendedor vendedor = Sistema.verificarSeOEmailExisteVendedor();
        double valor = capturarDados("Por favor, digite o valor da venda ").nextDouble();
        String data = capturarDados("Por favor, digite a data da venda ").nextLine();
        return ServicoVenda.cadastrarVenda(cliente, vendedor, valor, data);
    }


    //Método executar

    public static boolean executar() throws Exception {

        boolean executarMenu = true;

        while (executarMenu) {
            menuCadastro();
            int opcaoDoUsuario = capturarDados("Digite a opção desejada: ").nextInt();
            if (opcaoDoUsuario == 1) {
                cadastrarClientes();
                System.out.println("Show! Cliente cadastrado com êxito");
            } else if (opcaoDoUsuario == 2) {
                cadastrarVendedores();
                System.out.println("Show! Vendedor cadastrado com êxito");
            } else if (opcaoDoUsuario == 3) {
                cadastrarVenda();
                System.out.println("Show! Venda cadastrada com êxito");
            } else if (opcaoDoUsuario == 4) {
                boolean exibirSubMenu = true;
                while (exibirSubMenu) {
                    menuMostrarCadastrados();
                    opcaoDoUsuario = capturarDados("Digite a opção desejada: ").nextInt();
                    if (opcaoDoUsuario == 1) {
                        ServicoCliente.exibirClientesCadastrados();

                    } else if (opcaoDoUsuario == 2) {
                        ServicoVendedor.listarVendedores();
                    } else if (opcaoDoUsuario == 3) {
                        ServicoVenda.listarVendas();
                    } else if (opcaoDoUsuario == 4) {
                        exibirSubMenu = false;
                    } else {

                        System.out.println("\n Cara, esta opção é inválida, tenta outra ai, por favor!\n");
                    }
                }
            } else if (opcaoDoUsuario == 5) {
                executarMenu = false;
                System.out.println("\n Muito obrigada, volte sempre\n ");
            } else {
                System.out.println("\n Putz, esta opção é inválida.\n");
            }

        }
        return executarMenu;
    }
}



