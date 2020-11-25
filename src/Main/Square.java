package Main;

public class Square extends Figure {
    public double Length;

    public Square(double length){
        Length=length;
    }
    @Override
    public double getPerimeter(){
        return 4*Length;
    }

    @Override
    public double getArea(){
        return Length*Length;
    }
}
