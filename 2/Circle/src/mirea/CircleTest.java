package mirea;

import java.util.Scanner
import java.lang.Math

public class CircleTest {
    public static void comparisonSquare(double s1, double s2){
        if (s1>s2){
            System.out.println("The first square is bigger.");
        }
        else if (s1<s2) {
            System.out.println("The second square is bigger");
        }
        else{
            System.out.println("Squares are equivalent");
        }
        return;
    }
    public static void comparisonLength(double l1, double l2){
        if (l1>l2){
            System.out.println("The first length is bigger.");
        }
        else if (l1<l2) {
            System.out.println("The second length is bigger");
        }
        else{
            System.out.println("Lengths are equivalent");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double r = input.nextDouble();
        Circle c1 = new Circle(r);
        c1.setR(r);
        double length1 = c1.countLength(r);
        double square1 = c1.countSquare(r);
        System.out.println("Enter the new radius: ");
        r = input.nextDouble();
        Circle c2 = new Circle(r);
        c2.setR(r);
        double length2 = c2.countLength(r);
        double square2 = c2.countSquare(r);
        comparisonSquare(square1, square2);
        comparisonLength(length1, length2);


    }
}