public class Cube extends Shape3D{
    private double side;

    public Cube(String name, double side){
        super(name);
        this.side = side;
    }

    public void setSide(double side){
        this.side = side;
    }

    public double getSide(){
        return side;
    }

    public double area(){
        System.out.println("Cube area:");
        return 6*side*side;
    }

    public double volume(){
        System.out.println("Cube volume:");
        return Math.pow(side, 3);
    }

    public void draw(){
        System.out.println("Cube drawable");
    }
}