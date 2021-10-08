package com.company;

public class Vendedores {

    //Atributos

    private String nome;
    private String cpf;
    private String email;
    Clientes clientes;

    //Métodos construtores


    public Vendedores() {
    }

    public Vendedores(String nome, String cpf, String email, Clientes clientes) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.clientes = clientes;
    }

    //Permissões para manipular atributos Get e Set


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    //Métodos toString

    @Override
    public String toString() {
        StringBuilder exibir = new StringBuilder();
        exibir.append(super.toString());
        exibir.append("\n =============================== ");
        exibir.append("\n Nome " + nome);
        exibir.append(("\n E-mail " + email));
        exibir.append(("\n E-mail " + cpf));
        exibir.append("\n =============================== ");
        exibir.append("\n Cliente " + clientes);
        return exibir.toString();
    }
}
