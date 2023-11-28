import java.util.ArrayList;
import java.util.Arrays;

public class DiscreteMaths {
    public int media(int[] dataset) {
        int suma = 0;
        for (int dato : dataset) {
            suma += dato;
        }
        return suma / dataset.length;
    }

    public int moda(int[] dataset) {
        int moda = dataset[0];
        int maxCount = 0;

        for (int i = 0; i < dataset.length; i++) {
            int count = 0;
            for (int j = 0; j < dataset.length; j++) {
                if (dataset[j] == dataset[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                moda = dataset[i];
            }
        }
        return moda;
    }

    public int mediana(int[] dataset) {
        Arrays.sort(dataset);
        int n = dataset.length;
        if (n % 2 == 0) {
            int middle1 = dataset[n / 2];
            int middle2 = dataset[n / 2 - 1];
            return (middle1 + middle2) / 2;
        } else {
            return dataset[n / 2];
        }
    }
}
