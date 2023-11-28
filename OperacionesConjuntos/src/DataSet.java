import java.util.ArrayList;
import java.util.Arrays;
    public class DataSet {
        public static ArrayList<String> getA() {
            return new ArrayList<>(Arrays.asList("1", "3", "5", "7","9"));
        }

        public static ArrayList<String> getB() {
            return new ArrayList<>(Arrays.asList("2","4","6","8","10"));

        }
        public static ArrayList<String> getC(){
            return new ArrayList<>(Arrays.asList("5","6","7","8"));
        }
        public static ArrayList<String> getD(){
            return new ArrayList<>(Arrays.asList("7","8","9","10"));
        }
        public static ArrayList<String> getE(){
            return new ArrayList<>(Arrays.asList());
        }
        public static ArrayList<String> getF(){
            return new ArrayList<>(Arrays.asList("2","4","6","8"));
        }
        public static ArrayList<String> getG(){
            return new ArrayList<>(Arrays.asList("3","6","9","10"));
        }
    }
