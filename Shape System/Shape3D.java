public abstract class Shape3D extends Shape{
    public Shape3D(String name){
        super(name);
    }


    @Override
    public abstract double area();


    public abstract double volume();
}