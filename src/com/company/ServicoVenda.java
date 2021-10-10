package com.company;

import java.util.ArrayList;
import java.util.List;

public class ServicoVenda {

    private static List<Venda> vendas = new ArrayList<>();


    //Método cadastrar venda

    public static Venda cadastrarVenda(Vendedor vendedor, String cpf, double valor, String data)throws Exception {
       Cliente cliente = ServicoCliente.verificarSeOCPFExiste(cpf);
        Venda venda = new Venda(vendedor, cliente, valor, data);
        vendas.add(venda);
        return venda;
    }


    //Método listar

    public static void listarVendas() {
        for (Venda venda : vendas) {
            System.out.println(venda);
        }
    }

}



