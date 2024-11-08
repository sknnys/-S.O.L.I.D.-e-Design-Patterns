public interface HandlerNaruto {
    public void setNextHandler(HandlerNaruto handler);
    public void handlerRequest(String request);
}