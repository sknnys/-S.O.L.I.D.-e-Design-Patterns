public class DescontoFidelidade extends Desconto {
    @Override
    public double calcularDesconto(double total) {
        registraLog("Desconto fidelidade aplicado.");
        return total * 0.10;
    }

    private void registraLog(String mensagem) {
        Logger logger = Logger.getInstance(); // Corrigido para getInstance()
        logger.log(mensagem);
    }
}
