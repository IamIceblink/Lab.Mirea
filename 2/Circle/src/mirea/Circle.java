package mirea;


public class Circle {
    double r;
    public Circle (double r){}
    public double getR(){return r;}
    public void setR(double r){this.r = r;}
    public double countSquare(double r){
        return Math.acos(-1)*Math.pow(r,2);
    }
    public double countLength(double r){
        return Math.acos(-1)*2*r;
    }





}
