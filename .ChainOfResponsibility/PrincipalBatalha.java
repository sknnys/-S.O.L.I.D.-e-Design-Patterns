public class PrincipalBatalha {
    public static void main(String... args) {
        HandlerNaruto genin = new ConcretHandlerGenin();
        HandlerNaruto chunin = new ConcretHandlerChunin();
        HandlerNaruto jonin = new ConcretHandlerJonin();

        genin.setNextHandler(chunin);
        chunin.setNextHandler(jonin);
        
        System.out.println("----------");

        genin.handlerRequest("nivel3");

        System.out.println("----------");

    }
}
