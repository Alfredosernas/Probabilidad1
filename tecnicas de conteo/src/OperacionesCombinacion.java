import java.util.ArrayList;
import java.util.List;
public class OperacionesCombinacion {
    private ArrayList<String> conjunto;

    public OperacionesCombinacion(ArrayList<String> conjunto) {
        this.conjunto = conjunto;
    }

   public int calcularNumeroCombinaciones() {
        return calcularNumeroCombinacionesSinRepetir(conjunto.size(), 3);
    }

    private int calcularNumeroCombinacionesSinRepetir(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public void mostrarCombinaciones(int r) {
        List<Integer> indices = new ArrayList<>(r);
        for (int i = 0; i < r; i++) {
            indices.add(-1);
        }
        generarCombinaciones(0, 0, indices, r);
    }

    private void generarCombinaciones(int nivel, int inicio, List<Integer> indices, int r) {
        if (nivel == r) {
            imprimirCombinacion(indices);
            return;
        }

        for (int i = inicio; i < conjunto.size(); i++) {
            indices.set(nivel, i);
            generarCombinaciones(nivel + 1, i + 1, indices, r);
            while (i + 1 < conjunto.size() && conjunto.get(i).equals(conjunto.get(i + 1))) {
                i++;
            }
        }
    }

    private void imprimirCombinacion(List<Integer> indices) {
        System.out.print("(");
        for (int i = 0; i < indices.size(); i++) {
            System.out.print(conjunto.get(indices.get(i)));
            if (i < indices.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(")");
    }

    private int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}