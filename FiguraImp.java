public class FiguraImp implements Figura {
    String formaFigura, colorBordeFigura, colorFondoFigura;
    int coordXIzda, coordXDcha, coordYArriba, coordYAbajo;
    public FiguraImp(ConstructorFiguraImp constructorFigura) {
        this.formaFigura = constructorFigura.formaFigura;
        this.colorBordeFigura = constructorFigura.colorBordeFigura;
        this.colorFondoFigura = constructorFigura.colorFondoFigura;
        this.coordXIzda = constructorFigura.coordXIzda;
        this.coordXDcha = constructorFigura.coordXDcha;
        this.coordYArriba = constructorFigura.coordYArriba;
        this.coordYAbajo = constructorFigura.coordYAbajo;
    }
    public int getCoordXIzda() {
        return this.coordXIzda;
    }
    public int getCoordXDcha() {
        return this.coordXDcha;
    }
    public int getCoordYArriba() {
        return this.coordYArriba;
    }
    public int getCoordYAbajo() {
        return this.coordYAbajo;
    }
    public String toString() {
        return "Forma: " + this.formaFigura + " | Color Borde: " + this.colorBordeFigura + " | Color Fondo: " + this.colorFondoFigura 
            + " | Coordenadas rectangulo: " + "xIzda " + String.valueOf(this.coordXIzda) + ", xDcha " + String.valueOf(this.coordXDcha) + ", yArriba " + String.valueOf(this.coordYArriba) + ", yAbajo " + String.valueOf(this.coordYAbajo);
    }
}