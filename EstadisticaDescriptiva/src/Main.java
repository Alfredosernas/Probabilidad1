import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int [] dataset = DataSet.getX();
        DiscreteMaths discreteMaths = new DiscreteMaths(dataset);
        int media = discreteMaths.media(dataset);
        System.out.println("La media es: " + media);
        int moda = discreteMaths.moda(dataset);
        System.out.println("La moda es: " + moda);
        int mediana = discreteMaths.mediana(dataset);
        System.out.println("La mediana es: " + mediana);
        int rango = discreteMaths.rango();
        System.out.println("El rango es: " + rango);
        int numeroClases = discreteMaths.numeroclases();
        System.out.println("El número de clases es: " + numeroClases);
        int amplitudIntervalo = discreteMaths.amplitudintervalo();
        System.out.println("La amplitud del intervalo es: " + amplitudIntervalo);
        discreteMaths.construirTablaDescriptiva();

        // Calcular medidas de tendencia agrupadas y mostrar resultados
        double mediaAgrupada = discreteMaths.calcularMediaAgrupada(discreteMaths.puntosMedios, discreteMaths.frecuenciaAbsoluta());
        double modaAgrupada = discreteMaths.calcularModaAgrupada(discreteMaths.puntosMedios, discreteMaths.frecuenciaAbsoluta());
        double medianaAgrupada = discreteMaths.calcularMedianaAgrupada(discreteMaths.puntosMedios, discreteMaths.frecuenciaAbsoluta());

        System.out.println("Medida de Tendencia Central para Datos Agrupados:");
        System.out.println("Media Agrupada: " + mediaAgrupada);
        System.out.println("Moda Agrupada: " + modaAgrupada);
        System.out.println("Mediana Agrupada: " + medianaAgrupada);
    }
}
