import static java.lang.System.*;

public class Main {
    public Main() {
    }

    public static void main(String[] nousan) {
        DataSet ds = new DataSet();
        DiscreteMaths dm = new DiscreteMaths();
        double B0 = 0;
        double B1 = 0;
        double sumx = 0;
        double sumY = 0;
        double powX = 0;
        double powY = 0;
        double sumXY = 0;
        double prox = 0;
        double proY = 0;
        double num=0;

        float[]pred;
        float[]predx;

        sumx = dm.sumX(ds.getX());
        sumY = dm.sumY(ds.getY());
        powX = dm.sumpowX(ds.getX());
        powY = dm.sumpowY(ds.getY());
        sumXY = dm.sumYX(ds.getX(), ds.getY());
        prox = dm.proX(ds.getX(),sumx );
        proY = dm.proY(ds.getY(),sumY);
        num=dm.n(ds.getY());
        System.out.println("cantidad de numeros: "+num);
        System.out.println("suma de X: "+sumx);
        System.out.println("suma de Y: "+sumY);
        System.out.println("suma potencia de X: "+powX);
        System.out.println("suma de potencia de Y: "+powY);
        System.out.println("suma de XY: "+sumXY);
        System.out.println("promedio de X: "+prox);
        System.out.println("promedio de Y: "+proY);
        B1=((sumXY - ((sumx * sumY) / num)) / (powX - ((sumx * sumx) / num)));
        System.out.println("B1 = " + B1);
        B0= (proY - B1 * prox);
        System.out.println("B0 = " + B0);
        System.err.println("predicción:");

        predx = new float[] {500, 60, 153, 559};
        pred = new float[predx.length];

        for (int i = 0; i<predx.length; i++)
            pred[i] = (float) ((B0 + predx[i])*B1);

        for (int i = 0; i<pred.length; i++){
            System.out.println("********************");
            System.out.println("prediccion numero: " + predx[i]);
            System.out.println(pred[i]);

        }
}
}
