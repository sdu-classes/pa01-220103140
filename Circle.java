public class Circle {
    public double radius;
    public Circle(){
        radius = 1.0;
    }
    public Circle(double r){
        radius = r;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        radius = r;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getCircumference(){
        return Math.PI * radius * 2;
    }
    public String toString(String s){
        return s;
    }
}
public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.getRadius());
    }
}

