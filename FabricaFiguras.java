public class FabricaFiguras {
    public static FiguraImp fabricarFigura(String forma, String colorBorde, String colorFondo) {
        return new ConstructorFiguraImp(forma).darColorBordeFigura(colorBorde).darColorFondoFigura(colorFondo).darDimensionesFigura().construir();
    }
}