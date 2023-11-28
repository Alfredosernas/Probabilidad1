import java.util.Arrays;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> conjuntoA = DataSet.getA();
        ArrayList<String> conjuntoB = DataSet.getB();
        ArrayList<String> conjuntoC = DataSet.getC();
        ArrayList<String> conjuntoD = DataSet.getD();
        ArrayList<String>conjuntoE = DataSet.getE();
        ArrayList<String>conjuntoF = DataSet.getF();
        ArrayList<String>conjuntoG = DataSet.getG();


        //union
        ArrayList<String> unionAB= new ArrayList<>(conjuntoA);
        unionAB.addAll(conjuntoB);
        //interseccion
        ArrayList<String>interseccionAB= new ArrayList<>(conjuntoA);
        interseccionAB.retainAll(conjuntoB);
        ArrayList<String>interseccionunionABCD=new ArrayList<>(unionAB);
        //interseccionunionABCD.retainAll(interseccionCD);
        ArrayList<String>interseccionFG=new ArrayList<>(conjuntoF);
        interseccionFG.retainAll(conjuntoG);
        //diferencia
        ArrayList<String>diferenciaFG=new ArrayList<>(interseccionFG);
        diferenciaFG.removeAll(interseccionunionABCD);






        System.out.println("Conjunto A: " + conjuntoA);
        System.out.println("Conjunto B: " + conjuntoB);
        System.out.println("Conjunto C: " + conjuntoC);
        System.out.println("Conjunto D: " + conjuntoD);
        System.out.println("conjunto E: "+conjuntoE);
        System.out.println("Conjunto F:"+conjuntoF);
        System.out.println("conjunto G"+conjuntoG);
        System.out.println(" "+unionAB);
        System.out.println(interseccionAB);
    }


}