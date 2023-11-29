package faidomok;

import java.util.ArrayList;
import idomok.*;

public class FaIdomProgram {

    private ArrayList<FaIdom> idomok;

    public FaIdomProgram() {
        this.idomok = new ArrayList<>();
        this.idomok.add(new Gomb(1));
        this.idomok.add(new Hasab(1,1,.1));
        this.idomok.add(new Hasab(2,2,2));
        this.idomok.add(new Gomb(2));
    }
    
    public double osszSuly(){
        double sum=0;
        for (FaIdom faIdom : idomok) {
            sum+=faIdom.suly();
        }
        return sum;
    }
    
    public double osszGombSuly(){
        double sum=0;
        for (FaIdom faIdom : idomok) {
            if(faIdom instanceof Gomb)
                sum+=faIdom.suly();
        }
        return sum;
    }
    
    public FaIdom minV(){
        int min=0;
        for(int ix=1;ix<idomok.size();ix++)
            if(idomok.get(min).terfogat()>idomok.get(ix).terfogat())
                min=ix;
        return idomok.get(min);
    }
    
    public FaIdom maxV(){
        int max=0;
        for(int ix=1;ix<idomok.size()-1;ix++)
            if(idomok.get(max).terfogat()<idomok.get(ix).terfogat())
                max=ix;
        return idomok.get(max);
    }
    
    public void run(){
        System.out.println("osszSuly: "+ osszSuly());
        System.out.println("osszGombSuly: "+ osszGombSuly());
        System.out.println("min: "+ minV());
        System.out.println("max: "+ maxV());
    }
    
    public static void main(String[] args) {
        new FaIdomProgram().run();
    }
    
}
