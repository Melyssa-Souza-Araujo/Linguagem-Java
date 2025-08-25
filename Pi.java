package exe08;

public class Pi {
    private static final double vaLorPI = 3.14159265358979;

    public double getPI() {
        return vaLorPI;
    }

    public float getPIFloat() {
        Double d = new Double(vaLorPI);
        return d.floatValue();
    }

    public int getPIInt() {
        Double d = new Double(vaLorPI);
        return d.intValue();
    }
}
