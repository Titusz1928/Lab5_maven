package exemplul1.ex;

public class PerecheNumere {
    private int a,b;

    public PerecheNumere(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public PerecheNumere() {
    }

    @Override
    public String toString() {
        return "PerecheNumere{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
