

public class Botao {
    private Dispositivo dispositivo;

    public Botao(Dispositivo dispositivo) {
        valida(dispositivo);
        this.dispositivo = dispositivo;
    }

    private void valida(Dispositivo dispositivo) {
        if(dispositivo == null) {
            throw new RuntimeException("dispositivo invalido");
        }
    }
    public void setDispositivo(Dispositivo dispositivo) {
        valida(dispositivo);
        this.dispositivo = dispositivo;
    }

    public void ligar(){
        dispositivo.ligar();
    }

}