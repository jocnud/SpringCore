package com.shahbaz.blog.factoryDesign;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	System.out.println(" This is something  .  ONLINE COMMITING. .   which can pass second test");
    	
    	System.out.println("Implementing Factory Desin Patterns");
    	
    	System.out.println(" tesy for collaboration");
    	
        ShapeFactory shapeFactory=new ShapeFactory();
        
        Shape triangle=shapeFactory.getShape("circle");
        triangle.draw();
        
        Shape circle=shapeFactory.getShape("circle");
        circle.draw();
        
    }
}
