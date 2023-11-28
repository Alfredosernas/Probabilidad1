import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        DiscreteMaths discreteMaths = new DiscreteMaths();
        int opcion;
        int [] dataset = DataSet.getX();
        do {
            System.out.println("0._SALIR");
            System.out.println("1._MEDIA");
            System.out.println("2._MODA");
            System.out.println("3._MEDIANA");
            opcion = lector.nextInt();
            switch (opcion) {
                case 1 -> {
                    int media = discreteMaths.media(dataset);
                    System.out.println("La media es: " + media);
                }
                case 2 -> {
                    int moda = discreteMaths.moda(dataset);
                    System.out.println("La moda es: " + moda);
                }
                case 3 -> {
                    int mediana = discreteMaths.mediana(dataset);
                    System.out.println("La mediana es: " + mediana);
                }
                default -> throw new IllegalStateException("Unexpected value: " + opcion);
            }
        } while (opcion != 0);
    }
}
