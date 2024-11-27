package com.strategyaula;

public class CartaoDeCreditoStrategy implements IFormaPagamentoStrategy {
    @Override
    public void efetuarPagamento(Pedido pedido) {
        String check = pedido.getFormaDePagamento(); 
        if(check.equalsIgnoreCase("cartao")) {
            System.out.println("Pagamento efetuado com Cartao de credito");
            pedido.setStatusPagamento(true);
        } else { 
            System.out.println("Forma de pagamento inválida"); 
        }   
    }
}
