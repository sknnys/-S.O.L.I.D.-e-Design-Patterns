package com.strategyaula;

public class BoletoBancarioStrategy implements IFormaPagamentoStrategy {
    @Override
    public void efetuarPagamento(Pedido pedido) {
        String check = pedido.getFormaDePagamento(); 
        if(check.equalsIgnoreCase("Boleto")) {
            System.out.println("Pagamento efetuado com boleto bancário");
            pedido.setStatusPagamento(true);
        } else { 
            System.out.println("Forma de pagamento inválida"); 
        }
    }
}
