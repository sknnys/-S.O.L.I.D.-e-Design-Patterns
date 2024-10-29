public class DescontoPorPeriodo extends Desconto {
    
@Override   
public double calcularDesconto(double total) {
   return total * 0.07;
    }
}