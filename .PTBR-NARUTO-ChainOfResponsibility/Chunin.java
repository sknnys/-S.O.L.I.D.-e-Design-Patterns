public class Chunin implements Naruto {
    private Naruto proximoEscolhido;

    @Override
    public void proximoEscolhido(Naruto proximoEscolhido) {
        this.proximoEscolhido = proximoEscolhido;
    }

    @Override
    public void verificador(String requisicao) {
        if (requisicao.equals("medio")) {
            System.out.println("shuriiken e bola de fogo.");
        } else if (proximoEscolhido != null) {
            proximoEscolhido.verificador(requisicao);
        }
    }
}