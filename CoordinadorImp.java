import java.util.HashMap;
import java.util.ArrayList;
public class CoordinadorImp implements Coordinador {
    private HashMap<String, ArrayList<LienzoImp>> suscripciones;
    public CoordinadorImp() {
        this.suscripciones = new HashMap<>();
    }
    public void registrarTopico(String topico) {
        this.suscripciones.put(topico, new ArrayList<>());
    }
    public void registrarSuscripcion(String topico, LienzoImp suscriptor) {
        this.suscripciones.get(topico).add(suscriptor);
    }
    public void enviarFigura(String topico, FiguraImp figura) {
        ArrayList<LienzoImp> destinatarios = this.suscripciones.get(topico);
        for(LienzoImp destinatario: destinatarios){
            destinatario.recibirFigura(figura);
        }
    }
}