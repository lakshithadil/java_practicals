public class Point {
    private int a,b;

    public Point() {}

    public Point(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public String toString(){
        return "("+a+","+b+")";
    }
    public double distance(Point q){
        return Math.sqrt(Math.pow(Math.abs(a- q.a),2)+Math.pow(Math.abs(b- q.b),2));
    }
}

class Circle{
     private static final double PI  = 3.14;
     private int r;
     private  Point c;

    public Circle(int r, Point c) {
        this.r = r;
        this.c = c;
    }
    double getArea(){
        return PI*r*r;
    }
    double getCircumference(){
        return 2*PI*r;
    }
    public String toString(){
        return "Circle[center="+ c.toString()+","+"radius="+r+"]";
    }
    String contains(Point p){
        if (r > c.distance(p)){
           return p.toString()+" lies within the circle";
        }
        else {
           return p.toString()+" does not lies within the circle";
        }
    }
}

class  CircleClient{
    public static void main(String[] args) {
        Circle circle = new Circle(7, new Point(10,5));
        System.out.println(circle.toString());
        System.out.println("Circumference is: "+circle.getCircumference());
        System.out.println("Area is: "+circle.getArea());
        System.out.println(circle.contains(new Point(5,7)));
    }

}