public class DataSet {
    private double x[];
    private double y[];

    public DataSet() {
        x = new double[] { 1,2,3,4,5,6,7,8,9};
        y = new double[] {2,4,6,8,10,12,14,16,18};

    }

    public double[] getX() { return this.x;
    }

    public double[] getY() {
        return this.y;
    }

}