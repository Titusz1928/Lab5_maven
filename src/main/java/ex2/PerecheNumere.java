package ex2;

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

    public boolean FiboCons(){
        int af=a;
        int bf=b;
        int n1 = 0;
        int n2 = 1;

            if(bf>af){
                n1=af;
                af=bf;
                bf=n1;
            }
            n1=0;

            if (af < 0 || bf < 0) {
                return false;  // Fibonacci numbers are non-negative.
            }

            while (true) {
                int n3 = n1 + n2;
                if (n3 == af && n2 == bf) {
                    return true;
                } else if (n3 > af && n3 > bf) {
                    return false;
                }

                n1 = n2;
                n2 = n3;
            }

    }
    public  int CMMDC() {
        int af=a;
        int bf=b;
        while (bf != 0) {
            int remainder = af % bf;
            af = bf;
            bf = remainder;
        }
        return af;
    }
    public  int CMMMC() {
            int gcd = CMMDC();
            System.out.println(gcd);
        return (a * b) / gcd;
    }

    public boolean sumCifre(){
        int af=a;
        int bf=b;
        int sum1=0,sum2=0;
        int cif;
        while(af > 0){
            cif  = af % 10;
            sum1 += cif;
            af = af/10;
        }
        while(bf > 0){
            cif  = bf % 10;
            sum2 += cif;
            bf = bf/10;
        }
        return(sum1==sum2);
    }

    public boolean nrCifrePare(){
        int af=a;
        int bf=b;
        int sum1=0,sum2=0;
        int cif;
        while(af > 0){
            cif  = af % 10;
            if(cif % 2==0)
                sum1++;
            af = af/10;
        }
        while(bf > 0){
            cif  = bf % 10;
            if(cif % 2==0)
                sum2++;
            bf = bf/10;
        }
        return(sum1==sum2);
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
