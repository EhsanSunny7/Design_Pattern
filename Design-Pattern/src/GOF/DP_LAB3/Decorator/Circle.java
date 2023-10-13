/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_LAB3.Decorator;

/**
 *
 * @author FA20-BSE-068
 */
public class Circle implements Shape {
    private final double price;
    
    public Circle(double price){
        this.price = price;
    }

    Circle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void draw() {
        double totalCost = computeCost();
        System.out.println("Shape: Circle, Cost: " + totalCost);
    }
    
    @Override
    public double getPrice(){
        return price;
    }
    private double computeCost() {
        return getPrice();
    }
   
}