public class DeliveryEconomic implements DeliveryStrategy {
    @Override
    public double calcularFrete(double total) {
        return total * 0.1;
    }
}