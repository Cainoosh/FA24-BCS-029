public abstract class Shape2D extends Shape{
    private boolean isFilled;

    public Shape2D(String name, boolean isFilled){
        super(name);
        this.isFilled = isFilled;
    }

    @Override
    public abstract double area();
}