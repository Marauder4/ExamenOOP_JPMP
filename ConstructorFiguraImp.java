import java.util.ArrayList;
public class ConstructorFiguraImp implements ConstructorFigura {
    String formaFigura, colorBordeFigura, colorFondoFigura;
    int coordXIzda, coordXDcha, coordYArriba, coordYAbajo;
    public ConstructorFiguraImp(String forma) {
        this.formaFigura = forma;
    }
    public ConstructorFiguraImp darColorBordeFigura(String colorBorde) {
        this.colorBordeFigura = colorBorde;
        return this;
    }
    public ConstructorFiguraImp darColorFondoFigura(String colorFondo) {
        this.colorFondoFigura = colorFondo;
        return this;
    }
    public ConstructorFiguraImp darDimensionesFigura() {
        ArrayList<Integer> dimensiones = Core.dimensionesRectangulo();
        this.coordXIzda = dimensiones.get(0);
        this.coordXDcha = dimensiones.get(1);
        this.coordYArriba = dimensiones.get(2);
        this.coordYAbajo = dimensiones.get(3);
        return this;
    }
    public FiguraImp construir() {
        return new FiguraImp(this);
    }
}