public class DescontoFidelidade extends Desconto {

@Override    
public double calcularDesconto(double total) {
    return total * 0.10;
    }
}