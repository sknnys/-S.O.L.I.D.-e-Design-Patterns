public class Pedido {
    private Desconto desconto;

    public Pedido(Desconto desconto) {
        this.desconto = desconto;
    }

    public double calcularTotalComDesconto(double total) {
        double descontoAplicado = desconto.calcularDesconto(total);
        return total - descontoAplicado;
    }

    public void setMetodoDesconto(Desconto desconto) {
        this.desconto = desconto;
    }

    private void registraLog(String mensagem) {
        Logger logger = Logger.getInstance(); // Corrigido para getInstance()
        logger.log(mensagem);
    }
}
