import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Figura figura = null;

        int opcionFigura;
        do {
            mostrarMenuFiguras();
            opcionFigura = sc.nextInt();
            sc.nextLine();

            switch (opcionFigura) {
                case 1:
                    figura = crearTriangulo();
                    break;
                case 2:
                    figura = crearCuadrado();
                    break;
                case 3:
                    figura = crearCirculo();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

            if (figura != null) {
                int opcionCalculo;
                do {
                    mostrarMenuCalculo();
                    opcionCalculo = sc.nextInt();
                    sc.nextLine();

                    switch (opcionCalculo) {
                        case 1:
                            System.out.println("Área: " + figura.calcularArea());
                            break;
                        case 2:
                            System.out.println("Perímetro: " + figura.calcularPerimetro());
                            break;
                    }
                } while (opcionCalculo != 3);
            }
        } while (true);
    }

    public static void mostrarMenuFiguras() {
        System.out.println("Seleccione una figura:");
        System.out.println("1. Triángulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Círculo");
    }

    public static void mostrarMenuCalculo() {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Calcular área");
        System.out.println("2. Calcular perímetro");
    }

    public static Triangulo crearTriangulo() {
        Triangulo triangulo = new Triangulo();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese las coordenadas del punto " + (i + 1) + ":");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double z = sc.nextDouble();
            sc.nextLine();

            Punto punto = new Punto(x, y, z);
            triangulo.listaPuntos.add(punto);
        }

        return triangulo;
    }

    public static Cuadrado crearCuadrado() {
        Cuadrado cuadrado = new Cuadrado();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el lado del cuadrado:");
        double lado = sc.nextDouble();
        cuadrado.l = lado;

        return cuadrado;
    }

    public static Circulo crearCirculo() {
        Circulo circulo = new Circulo();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el radio del círculo:");
        double radio = sc.nextDouble();
        circulo.r = radio;

        return circulo;
    }
}
