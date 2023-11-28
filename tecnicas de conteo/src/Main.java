
public class Main {
    public static void main(String[] args) {
        DataSet dataSet = new DataSet();

        OperacionesCombinacion combinaciones = new OperacionesCombinacion(dataSet.getConjunto());

        System.out.println("\nNúmero total de combinaciones: " + combinaciones.calcularNumeroCombinaciones());

        System.out.println("Combinaciones sin repetición:");
        combinaciones.mostrarCombinaciones(3);
    }
}