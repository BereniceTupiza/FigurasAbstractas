public class Triangulo extends Figura{

    double l1;
    double l2;
    double l3;


    @Override
    public double calcularPerimetro(){
         l1 = calcularDistancia(0,1);
         l2 = calcularDistancia(0,2);
         l3 = calcularDistancia(1,2);
        return l1+l2+l3;
    }

    @Override
    public double calcularArea() {
        double s=calcularPerimetro()/2;
        double area= Math.sqrt(s*(s-l1)*(s-l2)*(s-l3));
        return area;

    }


}
