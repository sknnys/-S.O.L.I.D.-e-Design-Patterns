public class ConcretHandlerJonin implements HandlerNaruto {
   private HandlerNaruto nextHandler;
   
@Override
    public void setNextHandler(HandlerNaruto nextHandler) {
        this.nextHandler = nextHandler;
}
@Override 
public void handlerRequest(String request) {
    if (request.equals("nivel3")) {
        System.out.println("mangekyou sharingan, tsukuyomi, amaterasu, susano'o e os carai.");
    } else if (nextHandler != null) {
        nextHandler.handlerRequest(request);
        }

    }
}
