package com.daft.exercise;
//random points on a circle
public class CH_4_6 {
    public static void main(String[] args) {
        double calcAngle1 = Math.toRadians((int)(Math.random()*360));
        double calcAngle2 = Math.toRadians((int)(Math.random()*360));
        double calcAngle3 = Math.toRadians((int)(Math.random()*360));
        int radius = 40;
        double x1 = radius * Math.cos(calcAngle1);
        double y1 = radius * Math.sin(calcAngle1);
        double x2 = radius * Math.cos(calcAngle2);
        double y2 = radius * Math.sin(calcAngle2);
        double x3 = radius * Math.cos(calcAngle3);
        double y3 = radius * Math.sin(calcAngle3);
        double side1 = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
        double side2 = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
        double side3 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double angle1 = Math.toDegrees(Math.acos((side2 * side2 + side3 * side3 - side1 * side1) / 2 / side2 / side3));
        double angle2 = Math.toDegrees(Math.acos((side1 * side1 + side3 * side3 - side2 * side2) / 2 / side1 / side3));
        double angle3 = Math.toDegrees(Math.acos((side1 * side1 + side2 * side2 - side3 * side3) / 2 / side1 / side2));
        System.out.println("The coordinates of the points are (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + "), (" + x3 + ", " + y3 + ")");
        System.out.println("The three angles are: " + angle1 + ", " + angle2 + ", " + angle3);
    }
}
