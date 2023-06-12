
/**
 * Programa Calculo Perímetro de Circunferencia
 * @Autor: Diego Videla Silva
 * @Version: 1.0
 * @Fecha junio 2023
 * @Referencias
 */




/* Este Programa Calcula el Perímetro de una Circunferencia */
public class Main {
    public static void main(String[] args) {

        // Declaración de PI y las variables radio y perímetro

        final double PI = 3.1415926536;
        double radio = 25.0, perimetro;

        perimetro = 2.0*PI*radio;

        System.out.print("El perimetro de la circunferencia de radio ");
        System.out.print(radio);
        System.out.print(" es ");
        System.out.print(perimetro);
    }
}