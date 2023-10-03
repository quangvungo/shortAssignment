package Model;

public class Quadratic extends  Superlative {
    private float C;
    public Quadratic(float a, float b,float c) {
        super(a, b);
        C = c;
    }
    public float getC() {
        return C;
    }

    public void setC(float c) {
        C = c;
    }
}
