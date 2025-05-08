public class Sphere extends Shape3D{
    private double radius;

    public Sphere(String name, double radius){
        super(name);
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double area(){
        System.out.println("Sphere area:");
        return 4*Math.PI*radius*radius;
    }

    public double volume(){
        System.out.println("Sphere volume:");
        return (4.0/3.0)*Math.PI*radius*radius*radius;
    }

    public void draw(){
        System.out.println("Sphere drawable");
    }
}