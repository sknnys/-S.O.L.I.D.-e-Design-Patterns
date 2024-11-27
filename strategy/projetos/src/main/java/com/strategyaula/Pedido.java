package com.strategyaula;

public class Pedido {
    private double valorTotal;
    private String formaDePagamento;
    private boolean statusPagamento;

    public Pedido() {
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setStatusPagamento(boolean statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public boolean getStatusPagamento() {
        return statusPagamento;
    }
    
}