package idomok;

public abstract class FaIdom {
    private static final double FAJSULY=.8;
    
    public abstract double terfogat();
    
    public double suly(){
        return FAJSULY * terfogat();
    }

    @Override
    public String toString() {
        return "FaIdom{ FAJSULY: " + FAJSULY + '}';
    }

    public static double getFAJSULY() {
        return FAJSULY;
    }
    
}
