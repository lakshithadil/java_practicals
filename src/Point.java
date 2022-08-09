public class Point {
    int a,b;

    public Point() {}

    public Point(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public String toString(){
        return "("+a+","+b+")";
    }
    public double distance(){
        return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    }
    public double distance(int c,int d){
        return Math.sqrt(Math.pow(Math.abs(a-c),2)+Math.pow(Math.abs(b-d),2));
    }
}
class PointClient extends Point{
    public static void main(String[] args) {
        Point a = new Point(22,3);
        Point b = new Point(4,7);
        System.out.println(a);
        System.out.println(b);
        System.out.println(b.distance());
        System.out.println(b.distance(a.a,a.b));
    }
}