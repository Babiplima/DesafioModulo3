package com.company;

public class Venda {


    //Atributos

    private Vendedor vendedor;
    private Cliente cliente;
    private double valor;
    private String data;


    //Métodos construtores


    public Venda() {
    }

    public Venda(Vendedor vendedor, Cliente cliente, double valor,String data) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.valor = valor;
        this.data = data;
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
        exibir.append("\n ============Dados de venda================ ");
        exibir.append(getClientes());
        exibir.append(getVendedores());
        exibir.append("\n Valor a ser pago " + valor);
        exibir.append("\n Data " + data);
        exibir.append("\n ==========================================");
        return exibir.toString();
    }
}
