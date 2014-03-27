package myjava.npp.homework.march2314;

/**
 * Created by Sabishinzou on 26.03.14.
 */


public class Complex implements TrigonometricForm, ComplexActions, ComplexMath
{
    private double a;
    private double b;

    public Complex(){
        this.a = 0;
        this.b = 0;
    }
    public Complex(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double getA(){
        return a;
    }
    public void setA(double a){
        this.a = a;
    }
    public double getB(){
        return b;
    }
    public void setB(double b){
        this.b = b;
    }

    public String toString(){
        String s = getA() + " + " + getB() + "*i";
        return s;
    }
    public boolean equals(Complex complex){
        if ((Math.abs(this.getA()-complex.getA()) < 1e-12)&&(Math.abs(this.getB()-complex.getB()) < 1e-12))
            return true;
        else
            return false;
    }

    public double getModule(){
        return Math.sqrt(this.getA()*this.getA() + this.getB()*this.getB());
    }
    public double getArg(){
        if ((Math.abs(this.getA()) < 1e-12)&&(Math.abs(this.getB()) < 1e-12))
            return 0;  //аргумент не определен, следует возвращать NaN, но как?
        else
            if (getA()>0) //правая коорд полуплоскость
                return Math.atan(getB()/getA());
            else
                if (getB()>0)
                    return (Math.PI + Math.atan(getB()/getA()));
                else
                    return (-Math.PI + Math.atan(getB()/getA()));
    }

    public void conjugate() {
        this.setB(-this.getB());
    }

    public void sum(Complex c){
        this.setA(this.getA() + c.getA());
        this.setB(this.getB() + c.getB());
    }
    public void difference(Complex c){
        this.setA(this.getA() - c.getA());
        this.setB(this.getB() - c.getB());
    }
    public void productOnNumber(double number) {
        this.setA(this.getA()*number);
        this.setB(this.getB()*number);
    }
}
