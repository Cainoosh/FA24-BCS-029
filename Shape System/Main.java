public class Main{
    public static void main(String[] args) {

        Shape2D s1 = new Circle("circle 1", true, 5);

        Shape s2 = new Rectangle("rectangle", true, 10, 7);
        Point point1 = new Point(5,5);
        ((Rectangle) s2).setTopLeftCorner(point1);
        System.out.println(s2.area());

        Shape s3 = new Circle("circle 2", true, 3);

        Shape s4 = new Sphere("sphere", 6);

        Shape s5 = new Cube("cube", 2.5);

        Shape s6 = new Rectangle("rectangle", true, 10, 7);
        Point point2 = new Point(5,2);
        ((Rectangle) s6).setTopLeftCorner(point2);

        Shape[] shapes = new Shape[20];
        shapes[0] = s1;
        shapes[1] = s2;
        shapes[2] = s3;
        shapes[3] = s4;
        shapes[4] = s5;
        shapes[5] = s6;

        ShapeUtils shapeU = new ShapeUtils();
        shapeU.increaseRectangleLength(shapes, 5);
        shapeU.displayShapes(shapes);

        Point point = new Point(5,2);
        Rectangle rectangle = new Rectangle("R1", true, 10, 2);
        rectangle.setTopLeftCorner(point);

        shapeU.intersect(shapes, rectangle);

        

    }
}