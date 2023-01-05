package org.vigilantex.demo;

import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;


public class Triangle
{
    Triangle()
    {
        System.out.println("triangle obj init");
    }


    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw()
    {
        System.out.println(pointA.getX()+" "+ pointA.getY());
        System.out.println(pointB.getX()+" "+ pointB.getY());
        System.out.println(pointC.getX()+" "+ pointC.getY());
    }
}
