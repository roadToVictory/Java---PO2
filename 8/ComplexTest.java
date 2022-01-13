import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ComplexTest {
    double d = 1e-6; 

    public void assertEqualsComplexNumber(double exRe, double exIm, Complex c){
        assertEquals(exRe, c.getRe(), d);
        assertEquals(exIm, c.getIm(), d);
    }

    @Test
    public void testComplexC1(){
        Complex c = new Complex();
        // String e = "0+0i";
        assertEquals("0.0+0.0i",  c.toString());
    }

    @Test
    public void testComplexC2(){
        Complex c = new Complex(5.);
        assertEquals("5.0+0.0i", c.toString());
    }

    @Test
    public void testComplexC3(){
        Complex c = new Complex(-5.);
        assertEquals("-5.0+0.0i", c.toString());
    }

    @Test
    public void testComplexC4(){
        Complex c = new Complex(5., 10.);
        assertEquals("5.0+10.0i", c.toString());
    }

    @Test
    public void testComplexC5(){
        Complex c = new Complex(-5., -10.);
        assertEquals("-5.0-10.0i", c.toString());
    }


    @Test
    public void testSet1(){
        Complex c = new Complex(2., 4.);
        c.set(4., 5.);
        assertEqualsComplexNumber(4.,5., c);
    }

    @Test
    public void testSet2(){
        Complex c = new Complex(-2., -4.);
        c.set(-4., -5.);
        assertEqualsComplexNumber(-4.,-5., c);
    }

    @Test
    public void testSetRe1(){
        Complex c = new Complex(2., 4.);
        c.setRe(4.);
        assertEqualsComplexNumber(4.,4., c);
    }

    @Test
    public void testSetRe2(){
        Complex c = new Complex(-2., -4.);
        c.setRe(-4.);
        assertEqualsComplexNumber(-4.,-4., c);
    }

    @Test
    public void testGetRe1(){
        Complex c = new Complex(2., 4.);
        double ex = c.getRe();
        assertEquals(2.,ex);
    }

    @Test
    public void testGetRe2(){
        Complex c = new Complex(-2., -4.);
        double ex = c.getRe();
        assertEquals(-2.,ex);
    }

    @Test
    public void testSetIm1(){
        Complex c = new Complex(2., 4.);
        c.setIm(5.);
        assertEqualsComplexNumber(2.,5., c);
    }

    @Test
    public void testSetIm2(){
        Complex c = new Complex(-2., -4.);
        c.setIm(-5.);
        assertEqualsComplexNumber(-2.,-5., c);
    }

    @Test
    public void testGetIm1(){
        Complex c = new Complex(2., 4.);
        double ex = c.getIm();
        assertEquals(4.,ex);
    }

    @Test
    public void testGetIm2(){
        Complex c = new Complex(-2., -4.);
        double ex = c.getIm();
        assertEquals(-4.,ex);
    }

    @Test
    public void testMod(){
        Complex c = new Complex(3., 4.);
        double module = c.mod();
        assertEquals(5.,module);
    }

    @Test
    public void testConjugate(){
        Complex c = new Complex(3., 4.);
        c.conjugate();
        assertEqualsComplexNumber(3.,-4., c);;
    }

    @Test
    public void testOpposite(){
        Complex c = new Complex(3., 4.);
        c.opposite();
        assertEqualsComplexNumber(-3.,-4., c);;
    }

//dod
    @Test
    public void testDodCom(){
        Complex c1 = new Complex(3., 4.);
        Complex c2 = new Complex(1., 2.);
        Complex suma = Complex.DodCom(c1,c2);
        assertEqualsComplexNumber(4.,6., suma);
    }

    @Test
    public void testDodDCom(){
        Complex c1 = new Complex(3., 4.);
        double d = 1.0;
        Complex suma = Complex.DodDCom(d, c1);
        assertEqualsComplexNumber(4.,4., suma);
    }

    @Test
    public void testDodComD(){
        Complex c1 = new Complex(3., 4.);
        double d=1.0;
        Complex suma = Complex.DodComD(c1,d);
        assertEqualsComplexNumber(4.,4., suma);
    }

//odej
    @Test
    public void testSub(){
        Complex c1 = new Complex(3., 4.);
        Complex c2 = new Complex(1., 2.);
        Complex suma = Complex.Sub(c1,c2);
        assertEqualsComplexNumber(2.,2., suma);
    }

    @Test
    public void testDSub(){
        Complex c1 = new Complex(3., 4.);
        double d = 1.0;
        Complex suma = Complex.DSub(d, c1);
        assertEqualsComplexNumber(-2.,4., suma);
    }

    @Test
    public void testSubD(){
        Complex c1 = new Complex(3., 4.);
        double d=1.0;
        Complex suma = Complex.SubD(c1,d);
        assertEqualsComplexNumber(2.,4., suma);
    }

    //mnozenie
    @Test
    public void testmulti(){
        Complex c1 = new Complex(3., 4.);
        Complex c2 = new Complex(1., 2.);
        Complex mul = Complex.multi(c1,c2);
        assertEqualsComplexNumber(-5.,10., mul);
    }

    @Test
    public void testDmulti(){
        Complex c1 = new Complex(3., 4.);
        double d = 2.0;
        Complex mul = Complex.DMulti(d, c1);
        assertEqualsComplexNumber(6.,8., mul);
    }

    @Test
    public void testmultibD(){
        Complex c1 = new Complex(3., 4.);
        double d= 2.0;
        Complex mul = Complex.MultiD(c1,d);
        assertEqualsComplexNumber(6.,8., mul);
    }

    //dzielenie
    @Test
    public void testDziel(){
        Complex c1 = new Complex(3., 4.);
        Complex c2 = new Complex(1., 2.);
        Complex dzielenie = Complex.dziel(c1,c2);
        assertEqualsComplexNumber(2.2,-0.4, dzielenie);
    }

    @Test
    public void testDzielD(){
        Complex c1 = new Complex(3., 4.);
        double d = 2.0;
        Complex dzielenie = Complex.dzielD(c1,d);
        assertEqualsComplexNumber(1.5,2.0, dzielenie);
    }



    //equals
    @Test
    public void testEquals(){
        Complex c1 = new Complex(3., 4.);
        Complex c2 = new Complex(3., 4.);
        assertTrue(c1.equals(c2));
    }

    @Test
    public void testEquals2(){
        Complex c1 = new Complex(3., 4.);
        assertTrue(c1.equals(c1));
    }

    @Test
    public void testEquals3(){
        Complex c1 = new Complex(3., 4.);
        Complex c2 = new Complex(4., 4.);
        assertFalse(c1.equals(c2));
    }


}
