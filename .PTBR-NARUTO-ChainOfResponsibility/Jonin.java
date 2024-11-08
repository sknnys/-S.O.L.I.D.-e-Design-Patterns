public class Jonin implements Naruto {
   private Naruto proximoEscolhido;
   
@Override
    public void proximoEscolhido(Naruto proximoEscolhido) {
        this.proximoEscolhido = proximoEscolhido;
}
@Override 
public void verificador(String requisicao) {
    if (requisicao.equals("avancado")) {
        System.out.println("mangekyou sharingan, tsukuyomi, amaterasu, susano'o e os carai.");
    } else if (proximoEscolhido != null) {
        proximoEscolhido.verificador(requisicao);
        }

    }
}
