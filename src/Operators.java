public class Operators {
    public static void main(String[] args) {
        int x = 8;
        int y = 5, z = 4;
        //Operators and Variables
        //arithmetic Operators
        System.out.println("x+y is " + (x+y));
        System.out.println("x-y is " + (x-y));
        System.out.println("x*y is " + (x*y));
        System.out.println("x/y is " + (x/y));
        System.out.println("x%y is " + (x%y));
        System.out.println("(x+y) % y * y / (x-y) is " + (x+y) % y * y / (x-y));
        //Comparison or Relational Operators
        System.out.println("x<y is " + (x<y));
        System.out.println("x>=y is " + (x>=y));
        System.out.println("(x-y)==y  is " + ((x-y)==y));
        System.out.println("x!=y is " + (x!=y));
        //Conditional (short-circuit) Operators
        System.out.println("(x>y)&&(x>z) is " + ((x>y)&&(x>z)));
        System.out.println("(x<=y)||(z>x)  is " + ((x<=y)||(z>x)));
        //Ternary
        System.out.println("(x>y)?z:x is " + ((x>y)?z:x));
        System.out.println("(x<y)?y:x is " + ((x<y)?y:x));
        //unary
        System.out.println("x++ is " + (x++));
        System.out.println("++x is " + (++x));
        System.out.println("++x*y-- is " + (++x*y--));
        //Bitwise
        System.out.println("x&y is " + (x&y));
        System.out.println("x^y  is " + (x^y));
        System.out.println("x|y is " + (x|y));

    }
}
