public class Square implements Shape{
    float area, perimeter, side;

    public Square(int i) {
        side = i;
    }
    @Override
    public float calculateShapeArea(){
        area = (float)(side*side);
        return area;
    }
    @Override
    public float calculateShapePerimeter(){
        perimeter = (float)(4*side);
        return area;
    }
    public String toString()
    {
        return "Dimension is " + side + "Area is " + area + "Perimeter is " + perimeter+ ".";
    }
}
