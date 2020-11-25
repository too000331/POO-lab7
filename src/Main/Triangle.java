package Main;

public class Triangle extends Figure{
    public double A;
    public double B;
    public double C;

    public Triangle(double a, double b, double c){
        A=a;
        B=b;
        C=c;
    }
    @Override
    public double getPerimeter(){
        return A+B+C;
    }
    @Override
    public double getArea(){
        double p=getPerimeter()/2;
        return Math.sqrt(p*(p-A)*(p-B)-(p-C));
    }

}
