public class Circle implements Shape{
    float area, perimeter, rad;

    public Circle(int i) {
        rad = i;
    }
    @Override
    public float calculateShapeArea(){
        area = (float)(Math.PI*Math.pow(rad,2));
        return area;
    }
    @Override
    public float calculateShapePerimeter(){
        perimeter = (float)(Math.PI*rad*2);
        return area;
    }
    public String toString()
        {
        return "Dimension is " + rad + "Area is " + area + "Perimeter is " + perimeter+ ".";
    }

}
