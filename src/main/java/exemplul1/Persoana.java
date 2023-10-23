package exemplul1;

public class Persoana {
    private String nume;
    private int varsta;
    public String getNume() {
        return nume;
    }
    public int getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public Persoana() {}
    public Persoana(String nume, int varsta) {
        super();
        this.nume = nume;
        this.varsta = varsta;
    }
    @Override
    public String toString() {
        return nume + ", " + varsta;
    }
}
