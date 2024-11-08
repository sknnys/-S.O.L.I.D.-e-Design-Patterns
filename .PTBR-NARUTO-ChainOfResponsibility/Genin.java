public class Genin implements Naruto {
    private Naruto proximoEscolhido;

    @Override
    public void proximoEscolhido(Naruto proximoEscolhido) {
        this.proximoEscolhido = proximoEscolhido;
    }

    @Override
    public void verificador(String requisicao) {
        if (requisicao.equals("nivel1")) {
            System.out.println("só porradinha e kunai.");
        } else if (proximoEscolhido != null){
            proximoEscolhido.verificador(requisicao);
        }
    }
}
