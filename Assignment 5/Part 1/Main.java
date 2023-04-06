public class Main {
    public static void main(String[] args){
        Triangle t  = new Triangle(5,6,7);
        t.calculateShapeArea();
        t.calculateShapePerimeter();
        System.out.println(t);

        Square s  = new Square(5);
        s.calculateShapeArea();
        s.calculateShapePerimeter();
        System.out.println(s);

        Rectangle r  = new Rectangle(5,6);
        r.calculateShapeArea();
        r.calculateShapePerimeter();
        System.out.println(r);

        Circle c  = new Circle(5);
        c.calculateShapeArea();
        c.calculateShapePerimeter();
        System.out.println(c);
    }
}