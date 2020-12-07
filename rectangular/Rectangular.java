package rectangular;

import java.util.Random;

/**
 * Class of Rectangular.
 * @author Alex Nguyen
 */
public class Rectangular {
    private double width;
    private double length;
    private String color;
    private static int numOfSide = 4;
    // non-static variable -> belong to obj
    // static variable -> belong to class
    /**
     * Default constructor.
     */
    public Rectangular() {
        Random rng = new Random();
        
        int min = 1;
        int max = 10;
        
        this.width = rng.nextInt(max - min) + min;
        this.length = rng.nextInt(max - min) + min;
        this.color = "black";
    }
    
    /**
     * Constructor with all the parameters.
     * @param width The width of the rectangle.
     * @param length The length of the rectangle.
     * @param color The color of the rectangle.
     */
    public Rectangular(double width, double length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }
    
    /**
     * Copy constructor.
     * @param rec Another rectangle.
     */
    public Rectangular(Rectangular rec) {
        this.width = rec.width;
        this.length = rec.length;
        this.color = rec.color;
    }
    
    /**
     * Calculates the area of the rectangle.
     * @return The area of the rectangle.
     */
    // method is already reading the data members.
    public double calcArea() { 
        return width * length;
    }
    
    /**
     * Calculates the perimeter of the rectangle
     * @return The perimeter of the rectangle.
     */
    public double calcPerimeter() {
        return (width + length) * 2;
    }
    
    /**
     * Compares 2 rectangles.
     * @param rec Another rectangle.
     * @return True if the 2 rectangles are identical, false if not.
     */
    public boolean equals(Rectangular rec) {
        return this.width == rec.width &&
                this.length == rec.width &&
                this.color.equals(rec.color);
    }
    
    /**
     * Generates and formats a string to represent the values.
     * @return The values of rec.
     */
    @Override
    public String toString() {
        String str = "";
        
        str += String.format("%-10s: %f\n", "Width", width);
        str += String.format("%-10s: %f\n", "Length", length);
        str += String.format("%-10s: %s\n", "Age", color);
        str += String.format("%-10s: %s\n", "Area", calcArea());
        str += String.format("%-10s: %s\n", "Perimeter", calcPerimeter());
        
        return str;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
