package com.company;

import java.util.Date;
import java.util.Scanner;

public class ServicoVenda extends Venda {

    //Método sobrescreve o construtor

    public ServicoVenda(Vendedor vendedor, Cliente cliente, double valor) {
        super(vendedor, cliente, valor);
    }
    //Atributo

    private Date data;

    public Venda criarVenda(Vendedor vendedor, Cliente cliente, double valor, Date data) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.valor = valor;
        this.data = data;
        return criarVenda(vendedor, cliente, valor, data);
    }


    //Método capturar dados

    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //Método cadastrar venda

    public static Venda cadastrarVenda() {

        String emailVendedor = capturarDados("Digite o email do vendedor: ").nextLine();
        ServicoVendedor.verificarSeOEmailExiste(emailVendedor);
        String emailCliente = capturarDados("Digite o email cliente: ").nextLine();
        ServicoCliente.verificarSeOEmailExiste(emailCliente);
       // Venda venda = new ServicoVenda("Carlos", "Zulu", 20, new Date);
        double valorVenda = capturarDados("Digite o valor da venda ").nextDouble();
        String dataDeVenda = capturarDados("Digite a data da venda: ").nextLine();
        return cadastrarVenda();
    }

    //Método exibir fatura

    public static Venda exibirVenda(){
        Venda venda = exibirVenda();
        return exibirVenda();
    }
}



