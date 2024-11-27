package com.strategyaula;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido(); 

        pedido.setValorTotal(1000);
        pedido.setFormaDePagamento("Boleto");

        IFormaPagamentoStrategy forma = new BoletoBancarioStrategy();
        forma.efetuarPagamento(pedido);

        
        System.out.println("Valor total do pedido: " + pedido.getValorTotal());
        System.out.println("Forma de pagamento: " + pedido.getFormaDePagamento());
        System.out.println("////////////////////////////////////////////\n");

        pedido.setFormaDePagamento("TED");
        forma = new TEDStrategy();
        forma.efetuarPagamento(pedido);

        System.out.println("Valor total do pedido: " + pedido.getValorTotal());
        System.out.println("Forma de pagamento: " + pedido.getFormaDePagamento());


    }
}