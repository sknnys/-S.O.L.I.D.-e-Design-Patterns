public class Principal {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance(); // Corrigido para getInstance()
        logger.log("Iniciando aplicação...");

        Desconto descontoFidelidade = new DescontoFidelidade();
        Pedido pedido = new Pedido(descontoFidelidade);
        double valorPedido = 100;
        double totalComDesconto = pedido.calcularTotalComDesconto(valorPedido);
        logger.log("Total com desconto: " + totalComDesconto);
    }
}
