import java.util.ArrayList;

public class Wrapper {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = 16;
        int d = 6;
        Integer a1 = a;
        Integer b1 = b;
        Integer c1 = c;
        Integer d1 = d;

        ArrayList<Integer> integersarray = new ArrayList<Integer>();
        integersarray.add(a1);
        integersarray.add(b1);
        integersarray.add(c1);
        integersarray.add(d1);

        for (Integer i: integersarray) {
            System.out.println(i);
        }

    }
}
