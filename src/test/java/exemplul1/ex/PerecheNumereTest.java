package exemplul1.ex;

import ex2.PerecheNumere;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PerecheNumereTest {

    PerecheNumere p=new PerecheNumere(137,254);
    PerecheNumere p2=new PerecheNumere(610,987);
    PerecheNumere p3=new PerecheNumere(172,398);
    @Test
    void test_fibo() {
        assertFalse(p.FiboCons());
    }
    @Test
    void test2_fibo() {
        assertTrue(p2.FiboCons());
    }
    @Test
    void test3_fibo() {
        assertFalse(p3.FiboCons());
    }
    @Test
    void test1_CMMMC(){
        assertEquals(p.CMMMC(),34798);
    }
    @Test
    void test2_CMMMC(){
        assertNotEquals(p2.CMMMC(),215);
    }
    @Test
    void test3_CMMMC(){
        assertEquals(p3.CMMMC(),34228);
    }
    @Test
    void test1_sumCif(){
        assertTrue(p.sumCifre());
    }
    @Test
    void test2_sumCif(){
        assertFalse(p2.sumCifre());
    }
    @Test
    void test3_sumCif(){
        assertFalse(p3.sumCifre());
    }
    @Test
    void test1_nrCifPar(){
        assertFalse(p.nrCifrePare());
    }
    @Test
    void test2_nrCifPar(){
        assertFalse(p2.nrCifrePare());
    }
    @Test
    void test3_nrCifPar(){
        assertTrue(p3.nrCifrePare());
    }

}