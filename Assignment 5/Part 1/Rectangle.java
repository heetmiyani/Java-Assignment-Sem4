public class Rectangle implements Shape{
    float area, perimeter, length, breadth;

    public Rectangle(int i, int j) {
        length = i;
        breadth = j;
    }
    @Override
    public float calculateShapeArea(){
        area = (float)(length*breadth);
        return area;
    }
    @Override
    public float calculateShapePerimeter(){
        perimeter = (float)(2*(length+breadth));
        return area;
    }
    public String toString()
    {
        return "Dimension is " + length+","+ breadth+ "Area is " + area + "Perimeter is " + perimeter+ ".";
    }
}
