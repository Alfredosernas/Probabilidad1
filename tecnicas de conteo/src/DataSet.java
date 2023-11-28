import java.util.ArrayList;
import java.util.Arrays;

class DataSet {
    private ArrayList<String> conjunto;

    public DataSet() {
        conjunto = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E","A"));
    }

    public ArrayList<String> getConjunto() {
        return conjunto;
    }
}
