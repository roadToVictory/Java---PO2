import java.lang.Math;
import java.math.BigInteger;

public class Lab02 {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("Nie podano kodu!"); System.exit(1);
        }
        BigInteger p = BigInteger.valueOf(397);
        BigInteger q = BigInteger.valueOf(103);

        BigInteger n, phi,d;
        n=p.multiply(q);
        phi=p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
        
        
        BigInteger e = new BigInteger(""+3);
        //e=e.gcd(phi);
      
        while(e.gcd(phi).intValue()!=1)
            e=e.add(new BigInteger(""+2));  


        d=e.modInverse(phi);

       /* System.out.println(e);
        System.out.println(n);
        System.out.println(d);
        */

        String kod = args[0];
        byte[] b = kod.getBytes();
        int[] kodi = new int[b.length];

        for(int i=0; i<kodi.length;i++)
            kodi[i]=(int)b[i];

        BigInteger[] zakodowane = new BigInteger[kodi.length];

        for(int i=0; i<zakodowane.length; i++){
            zakodowane[i] = BigInteger.valueOf(kodi[i]).modPow(e,n);
        }

        for(int i=0; i<zakodowane.length; i++){   System.out.println(zakodowane[i]);}  //wypisanie tekstu zakodowanego

        BigInteger[] odkodowane = new BigInteger[kodi.length];
        for(int i=0; i<odkodowane.length; i++){
            odkodowane[i] = zakodowane[i].modPow(d,n);
        }

        
        System.out.println("Odkodowane:");
         for(int i=0; i<zakodowane.length; i++){
            System.out.print((char)odkodowane[i].intValue());
        }

    }



}
//gcd