import java.lang.Math;

public class Complex {
    private double a=0;
    private double b=0;

    Complex(){
        this.a=0;
        this.b=0;
    }

    Complex(double Re){
        this.a=Re;
        this.b=0;
    }

    Complex(double Re, double Im){
        this.a=Re;
        this.b=Im;
    }

    @Override
    public String toString(){
        if(this.b>=0)
            return this.a + "+" +this.b+"i";
        return this.a + "" +this.b+"i";
    }

/*
    //atrapy
    public void set(double Re, double Im){
    }

    public void setRe(double Re){
    }

    public double getRe(){return 0.0;}

    public void setIm(double Im){    
    }

    public double getIm(){return 0.0;}

    public double mod(){
        return 0.0;
    }

    public void conjugate(){
    }

    public void opposite(){
    }
*/
/////////////////////////////////////////

    public void set(double Re, double Im){
        this.a=Re;
        this.b=Im;
    }

    public void setRe(double Re){
        this.a=Re;
    }

    public double getRe(){return this.a;}

    public void setIm(double Im){
        this.b=Im;
    }

    public double getIm(){return this.b;}

    public double mod(){
        return Math.sqrt(Math.pow(this.a, 2)+ Math.pow(this.b,2));
    }

    public void conjugate(){
        double newb = this.b;
        this.b = -newb;
    }

    public void opposite(){
        double newa = this.a;
        this.a=-newa;
        conjugate();
    }

    //dod
    public static Complex DodCom(Complex c1, Complex c2){
        return new Complex(c1.a+c2.a, c1.b+c2.b);
    }

    public static Complex DodDCom(double d, Complex c2){
        return new Complex(d+c2.a, c2.b);
    }

    public static Complex DodComD(Complex c1, double d){
        return new Complex(c1.a+d, c1.b);
    }

    //odej
    public static Complex Sub(Complex c1, Complex c2){
        return new Complex(c1.a-c2.a, c1.b-c2.b);
    }

    public static Complex DSub(double d, Complex c2){
        return new Complex(d-c2.a, c2.b);
    }

    public static Complex SubD(Complex c1, double d){
        return new Complex(c1.a-d, c1.b);
    }

    //mnozenie
    public static Complex multi(Complex c1, Complex c2){
        return new Complex(c1.a*c2.a-c1.b*c2.b, c1.a*c2.b+c1.b*c2.a);
    }

    public static Complex DMulti(double d, Complex c2){
        return new Complex(d*c2.a, d*c2.b);
    }

    public static Complex MultiD(Complex c1, double d){
        return new Complex(d*c1.a, d*c1.b);
    }

    //dzielenie
    public static Complex dziel(Complex c1, Complex c2){
        double licznikRe = c1.a*c2.a + c1.b*c2.b;
        double licznikIm = c1.b*c2.a-c1.a*c2.b;
        double mian = Math.pow(c2.a,2) + Math.pow(c2.b,2);
        return new Complex(licznikRe/mian, licznikIm/mian);
    }

    // public static Complex DDziel(double d, Complex c2){
    //     return new Complex(d*c2.a, d*c2.b);
    // }

    public static Complex dzielD(Complex c1, double d){
        return new Complex(c1.a/d, c1.b/d);
    }

    @Override
    public boolean equals(Object obj){
        if(obj==this) return true;
        if(obj==null) return false;
        Complex c = (Complex)obj;
        if(this.a ==c.a && this.b == c.b)
            return true;
        return false;
    }


}