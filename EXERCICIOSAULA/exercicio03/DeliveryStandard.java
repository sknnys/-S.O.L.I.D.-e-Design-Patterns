public class DeliveryStandard implements DeliveryStrategy {
    @Override
    public double calcularFrete(double total) {
        return total * 0.15;
    }
}