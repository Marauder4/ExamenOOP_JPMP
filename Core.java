import java.util.ArrayList;
public class Core {
    public static ArrayList<Integer> dimensionesRectangulo() {
        int minXIzda, maxXIzda, minXDcha, maxXDcha, minYArriba, maxYArriba, minYAbajo, maxYAbajo;
        minXIzda = minYArriba = 0; maxXIzda = 30; minXDcha = 35; maxXDcha = 60; maxYArriba = 20; minYAbajo = 25; maxYAbajo = 50;
        ArrayList<Integer> dimensiones = new ArrayList<>();
        dimensiones.add(enteroAleatorio(minXIzda, maxXIzda));
        dimensiones.add(enteroAleatorio(minXDcha, maxXDcha));
        dimensiones.add(enteroAleatorio(minYArriba, maxYArriba));
        dimensiones.add(enteroAleatorio(minYAbajo, maxYAbajo));
        return dimensiones;
    }
    public static Integer enteroAleatorio(int min, int max) {
        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }
    public static boolean intersecta(FiguraImp figura, int x, int y) {
        if((figura.getCoordXIzda()<=x) && (x<=figura.getCoordXDcha()) && (figura.getCoordYArriba()<=y) && (y<=figura.getCoordYAbajo())) {
            return true;
        }
        return false;
    }
}