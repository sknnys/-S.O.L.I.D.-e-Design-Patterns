public class CampoDeBatalha {
    public static void main(String... args) {
        Naruto genin = new Genin();
        Naruto chunin = new Chunin();
        Naruto jonin = new Jonin();
        

        genin.proximoEscolhido(chunin);
        chunin.proximoEscolhido(jonin);
        
        System.out.println("----------");

        genin.verificador("avancado");


        System.out.println("----------");

    }
}
