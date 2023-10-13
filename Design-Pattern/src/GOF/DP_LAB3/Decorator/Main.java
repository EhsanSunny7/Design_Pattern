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
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();

        SimpleShape simpleCircle = new SimpleShape(new Circle());
        simpleCircle.draw();
        SimpleShape simpleRectangle = new SimpleShape(new Rectangle());
        simpleRectangle.draw();
        RedShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        if(redCircle.instances > 0) {
            circle.draw();
        }
        RedShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        redCircle.draw();

        ThickDecorator thickDecorator = new ThickDecorator(new Circle());
        thickDecorator.draw();
    }
}