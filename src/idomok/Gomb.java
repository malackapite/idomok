package idomok;

public class Gomb extends FaIdom{
    private double sugar;

    public Gomb(double sugar) {
        this.sugar = sugar;
    }
    
    @Override
    public double terfogat() {
        return (4*Math.PI*Math.pow(sugar, 3))/3;
    }

    @Override
    public String toString() {
        return "Gomb{" + "sugar=" + sugar + "} típusa: Gomb";
    }
}
