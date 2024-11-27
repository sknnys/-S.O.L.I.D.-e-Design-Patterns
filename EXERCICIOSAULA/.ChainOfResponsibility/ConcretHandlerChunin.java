public class ConcretHandlerChunin implements HandlerNaruto {
    private HandlerNaruto nextHandler;

    @Override
    public void setNextHandler(HandlerNaruto nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handlerRequest(String request) {
        if (request.equals("nivel2")) {
            System.out.println("shuriiken e bola de fogo.");
        } else if (nextHandler != null) {
            nextHandler.handlerRequest(request);
        }
        throw 
    }
}