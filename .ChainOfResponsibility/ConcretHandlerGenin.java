public class ConcretHandlerGenin implements HandlerNaruto {
    private HandlerNaruto nextHandler;

    @Override
    public void setNextHandler(HandlerNaruto nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handlerRequest(String request) {
        if (request.equals("nivel1")) {
            System.out.println("só porradinha e kunai.");
        } else if (nextHandler != null){
            nextHandler.handlerRequest(request);
        }
    }
}
