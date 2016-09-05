package com.company;

/**
 * Created by Carlos on 04/09/2016.
 */

public class coplex {

        private double r;
        private double i;

    public coplex (double r, double i)
    {
        this.r = r;
        this.i = i;
    }

    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void suma(coplex x, coplex y)
    {
        this.r = x.getR() + y.getR();
        this.i = x.getI() + y.getI();
    }
    public void resta(coplex x, coplex y)
    {
        this.r= x.getR() - y.getR();
        this.i = x.getI() - y.getI();
    }

    public void mult(coplex a, coplex b)
    {
        this.r = a.getR()*b.getR() - a.getI()*b.getI();
        this.i = a.getR()*b.getI() + a.getI()*b.getR();
    }

}
