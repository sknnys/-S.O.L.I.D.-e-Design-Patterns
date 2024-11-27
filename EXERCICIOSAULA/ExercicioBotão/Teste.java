public class Teste {
public static void main(String... args) {
        try {
            Dispositivo lampada = new Lampada();
            Dispositivo ventilador = new Ventilador();
    
            Botao botao = new Botao(lampada);
            botao.ligar();
    
            botao.setDispositivo(ventilador);
            botao.ligar();

        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}