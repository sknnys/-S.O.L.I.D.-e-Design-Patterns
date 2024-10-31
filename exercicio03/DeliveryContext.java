public class DeliveryContext {
    private DeliveryStrategy strategy;
    
    public DeliveryContext(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }

    public void strategy(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }
    
    public double calcularFrete(double total) {
        return strategy.calcularFrete(total);
    }
}