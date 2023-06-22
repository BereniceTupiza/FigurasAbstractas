import java.util.Scanner;

public class Circulo extends Figura {
    double r;

    @Override
    public double calcularPerimetro() {
        double perimetro =  3.14 * r*2;
        return perimetro;
    }

    @Override
    public double calcularArea() {
        double area = Math.pow(r, 2)* 3.14 ;
        return area;
    }

        public void ingresarRadio() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el radio del círculo: ");
            r = sc.nextDouble();
            sc.nextLine();
        }

    }
