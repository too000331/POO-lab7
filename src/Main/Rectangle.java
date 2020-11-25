package Main;

public class Rectangle extends Figure{
    public double Length;
    public double Width;

    public Rectangle(double length, double width){
        Length=length;
        Width=width;
    }
    @Override
    public double getPerimeter(){
        return 2*(Length+Width);
    }
    @Override
    public double getArea(){
        return Length*Width;
    }
}
