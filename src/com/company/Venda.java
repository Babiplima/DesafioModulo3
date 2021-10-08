package com.company;

public class Venda {

    //Atributos

    Vendedores vendedores;
    Clientes clientes;
    private double valor;
    private String data;

    //Métodos construtores


    public Venda() {
    }

    public Venda(Vendedores vendedores, Clientes clientes, double valor, String data) {
        this.vendedores = vendedores;
        this.clientes = clientes;
        this.valor = valor;
        this.data = data;
    }

    //Permissões para manipular atributos Get e Set


    public Vendedores getVendedores() {
        return vendedores;
    }

    public void setVendedores(Vendedores vendedores) {
        this.vendedores = vendedores;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder exibir = new StringBuilder();
        exibir.append(super.toString());
        exibir.append("\n =============================== ");
        exibir.append("\n Vendedor " + vendedores);
        exibir.append("\n Cliente " + clientes);
        exibir.append("\n O valor da venda é " + valor);
        exibir.append("\n A data da venda é " + data);
        exibir.append("\n =============================== ");
        return exibir.toString();
    }
}
