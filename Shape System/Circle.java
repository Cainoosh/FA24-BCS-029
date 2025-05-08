public class Circle extends Shape2D{
    private double radius;

    public Circle(String name, boolean isFilled, double radius){
        super(name, isFilled);
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double area(){
        System.out.println("Circle area:");
        return (Math.PI*radius*radius);
    }

    public void draw(){
        System.out.println("Circle drawable");
    }
}