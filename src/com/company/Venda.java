package com.company;

public class Venda {
    protected double valor;

    //Atributos

    Vendedor vendedor;
    Cliente cliente;

    //Métodos construtores


    public Venda() {
    }

    public Venda(Vendedor vendedor, Cliente cliente, double valor) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.valor = valor;
    }

    //Permissões para manipular atributos Get e Set


    public Vendedor getVendedores() {
        return vendedor;
    }

    public void setVendedores(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getClientes() {
        return cliente;
    }

    public void setClientes(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    @Override
    public String toString() {
        StringBuilder exibir = new StringBuilder();
        exibir.append("\n =============================== ");
        exibir.append("\n Vendedor " + vendedor);
        exibir.append("\n Cliente " + cliente);
        exibir.append("\n O valor da venda é " + valor);
        exibir.append("\n =============================== ");
        return exibir.toString();
    }
}
