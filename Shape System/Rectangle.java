public class Rectangle extends Shape2D{
    private double length;
    private double width;
    private Point topleftcorner;

    public Rectangle(String name, boolean isFilled, double length, double width){
        super(name, isFilled);
        this.length = length;
        this.width = width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }

    public Point getTopLeftCorner(){
        return topleftcorner;
    }

    public void setTopLeftCorner(Point topleftcorner){
        this.topleftcorner = topleftcorner;
    }

    public double area(){
        System.out.println("Rectangle area:");
        return length*width;
    }

    public void draw(){
        System.out.println("Rectangle drawable");
    }

    
}