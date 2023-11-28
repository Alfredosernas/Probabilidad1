import java.util.logging.XMLFormatter;

public class DiscreteMaths {

    public DiscreteMaths() {
    }

    public int n(double y[]) {
        int N = 0;
        N = y.length;
        return N;
    }

    public float sumX(double x[]) {
        double sum = 0;

        for (int i = 0; i < x.length; i++)
            sum = sum + x[i];
        float totalX = (float) sum;
        return totalX;
    }

    public float sumY(double y[]) {
        double sum = 0;

        for (int i = 0; i < y.length; i++)
            sum = sum + y[i];
        float totalY = (float) sum;

        return totalY;
    }

    public float sumYX(double x[], double y[]) {
        double suma = 0;
        for (int i = 0; i < x.length; i++) {
            suma += (x[i] * y[i]);
        }

        float totalYX = (float) suma;

        return totalYX;
    }

    public float sumpowX(double x[]) {
        float totalsumpowX = 0;
        for (int i = 0; i < x.length; i++) {
            totalsumpowX += x[i] * x[i];
            totalsumpowX = (float) totalsumpowX;
        }
        return totalsumpowX;
    }

    public float sumpowY(double y[]) {
        float totalsumpowY = 0;
        for (int i = 0; i < y.length; i++) {
            totalsumpowY += y[i] * y[i];
            totalsumpowY = (float) totalsumpowY;
        }
        return totalsumpowY;
    }

    public double proX(double x[], double sumX) {
        double totalproX = 0;
        totalproX = sumX / x.length;
        totalproX= (float) totalproX;

        return totalproX;
    }

    public double proY(double y[],double sumY) {
        double pro = 0;
        pro = sumY / y.length;
        float totalproY=(float) pro;
        return totalproY;
    }


}