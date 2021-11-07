public interface Coordinador {
    public void registrarTopico(String topico);
    public void registrarSuscripcion(String topico, LienzoImp suscriptor);
    public void enviarFigura(String topico, FiguraImp figura);
}