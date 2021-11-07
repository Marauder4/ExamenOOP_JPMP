import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        try {
            Lienzo lienzo = new LienzoImp();
            FabricaFiguras fabrica = new FabricaFigurasImp();
            Coordinador coordinador = new CoordinadorImp();
            String topico = "figuras";
            coordinador.registrarTopico(topico);
            coordinador.registrarSuscripcion(topico, (LienzoImp)lienzo);
            System.out.println("¡Bienvenido al programa! Vamos a añadir figuras a un lienzo.");
            char addFigura, probarPunto;
            do {
                System.out.println("Especifique la forma de la figura:");
                String forma = userInput.next();
                System.out.println("Especifique el color del borde de la figura:");
                String colorBorde = userInput.next();
                System.out.println("Especifique el color del fondo de la figura:");
                String colorFondo = userInput.next();
                coordinador.enviarFigura(topico, fabrica.fabricarFigura(forma, colorBorde, colorFondo));
                System.out.println("Figuras en el lienzo:");
                lienzo.mostrarFiguras();
                System.out.println("¿Desea añadir otra figura? (y/n)");
                addFigura = userInput.next().charAt(0);
            } while (addFigura=='y' | addFigura=='Y');
            System.out.println("Ahora vamos a introducir un punto para ver con qué figuras del lienzo intersecta.");
            do {
                System.out.println("Especifique la coordenada X del punto (número entero):");
                int coordX = userInput.nextInt();
                System.out.println("Especifique la coordenada Y del punto (número entero):");
                int coordY = userInput.nextInt();
                System.out.println("Figuras en el lienzo con las que el punto especificado intersecta:");
                lienzo.mostrarIntersecciones(coordX, coordY);
                System.out.println("¿Desea probar otro punto? (y/n)");
                probarPunto = userInput.next().charAt(0);
            } while (probarPunto=='y' | probarPunto=='Y');
        } finally {
            System.out.println("¡Hasta luego!");
            userInput.close();
        }
    }
}