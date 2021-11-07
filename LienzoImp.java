import java.util.ArrayList;
public class LienzoImp implements Lienzo {
    private ArrayList<FiguraImp> figuras;
    public LienzoImp() {
        this.figuras = new ArrayList<>();
    }
    public void mostrarFiguras() {
        for(FiguraImp figura: figuras) {
            System.out.println(figura.toString());
        }
    }
    public void recibirFigura(FiguraImp figura) {
        figuras.add(figura);
    }
    public void mostrarIntersecciones(int x, int y) {
        for(FiguraImp figura: figuras) {
            if(Core.intersecta(figura, x, y)) {
                System.out.println(figura.toString());
            }
        }
    }
}