public class ShapeUtils{
    public ShapeUtils(){}

    public void increaseRectangleLength(Shape[] shape, double length){
        for(int i=0; i<shape.length; i++){
            if(shape[i] instanceof Rectangle){
                ((Rectangle) shape[i]).setLength(((Rectangle) shape[i]).getLength()+length);
            }
        }
    }

    public void displayShapes(Shape shape[]){
        for(int i=0; i<shape.length; i++){
            if(shape[i] instanceof Shape2D){
                System.out.println(shape[i].area());
            }

            if(shape[i] instanceof Shape3D){
                System.out.println(shape[i].area());
                System.out.println(((Shape3D) shape[i]).volume());
            }
        }
    }

    public static void drawDrawables(Drawable[] drawables){
        for(int i=0; i<drawables.length; i++){
            drawables[i].draw();
        }
    }

    public void intersect(Shape [] shape, Rectangle rectangle){
        for(int i=0;i<shape.length;i++){
            if(shape[i]instanceof Rectangle){
                if (((Rectangle) shape[i]).getTopLeftCorner().equals(rectangle.getTopLeftCorner())){
                System.out.println("intersecting");
                }
                if(!((Rectangle) shape[i]).getTopLeftCorner().equals(rectangle.getTopLeftCorner())){
                System.out.println("not intersecting");
                }
            }
        }
    }
}