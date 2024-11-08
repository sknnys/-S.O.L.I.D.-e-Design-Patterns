public class Genin implements Naruto {
    private Naruto proximoEscolhido;

    @Override
    public void proximoEscolhido(Naruto proximoEscolhido) {
        this.proximoEscolhido = proximoEscolhido;
    }

    @Override
    public void verificador(String requisicao) {
        if (requisicao.equals("basico")) { 
            System.out.println("só porradinha e kunais.");
        } else if (proximoEscolhido != null){
            proximoEscolhido.verificador(requisicao);
        }
    }
}
