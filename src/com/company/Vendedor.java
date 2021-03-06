package com.company;

public class Vendedor {

    //Atributos

    private String nome;
    private String cpf;
    private String email;


    //Métodos construtores


    public Vendedor() {
    }

    public Vendedor(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
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


    //Métodos toString

    @Override
    public String toString() {
        StringBuilder exibir = new StringBuilder();
        exibir.append("\n ====================== ");
        exibir.append("\n Nome " + nome);
        exibir.append(("\n E-mail " + email));
        exibir.append(("\n CPF " + cpf));
        exibir.append("\n =============================== ");
        return exibir.toString();
    }
}
