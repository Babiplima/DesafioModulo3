package com.company;


import java.util.ArrayList;
import java.util.List;

public class ServicoVenda {

    private static List<Venda> vendas = new ArrayList<>();


    //Método cadastrar venda


    private  static List<Venda> registroVendas = new ArrayList<>();

    public static Venda registrarVenda(Cliente cliente,Vendedor vendedor, double valorASerPago, String dataRegistro){
        Venda venda = new Venda(vendedor, cliente,valorASerPago,dataRegistro);
        registroVendas.add(venda);

        return venda;
    }

    //Método exiba lista

    public static List<Venda> exibirVendaCadastradas() {
        for (Venda referencia : registroVendas) {
            System.out.println(referencia);
        }
        return registroVendas;
    }
 //   public static List<Venda> comprasPorCliente(Cliente cliente){
   //     List<Venda> comprasCliente = new ArrayList<>();

     //   for (Venda referencia:registroVendas){
       //     if (referencia.getClientes().equals(cliente)){
         //       comprasCliente.add(referencia);
           //     System.out.println(referencia);
            //}
        //}

        //return comprasCliente;
    //}

    //public static List<Venda> vendasPorVendedor(Vendedor vendedor){
      //  List<Venda> vendasVendedor = new ArrayList<>();

        //for (Venda referencia:registroVendas){
          //  if (referencia.getVendedores().equals(vendedor)){
            //    vendasVendedor.add(referencia);
              //  System.out.println(referencia);
            //}
        //}

        //return vendasVendedor;
    //}

}





