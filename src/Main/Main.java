package Main;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figure> figures=new ArrayList<Figure>();
        FigureController figureController=new FigureController();

        figures.add(new Square(3));
        figures.add(new Rectangle(10,6));
        figures.add(new Triangle(3,4,5));

        Figure biggestPerimeter=figureController.getBiggestPerimeter(figures);
        System.out.println("Biggest Perimeter: "+biggestPerimeter.getClass().getSimpleName()+" is "+biggestPerimeter.getPerimeter());
        Figure biggestArea=figureController.getBiggestArea(figures);
        System.out.println("Biggest Area: "+biggestArea.getClass().getSimpleName()+" is "+biggestArea.getArea());

        //Circle
        figures.add (new Figure(){
            double Radius=12;

            @Override
            public double getPerimeter(){
                return 2*Math.PI*Radius;
            }
            @Override
            public double getArea(){
                return Radius*Radius*Math.PI;
            }
        });

        biggestArea=figureController.getBiggestArea(figures);
        System.out.println("Final Biggest Area: "+biggestArea.getClass().getSimpleName()+" is "+biggestArea.getArea());
    }
}
