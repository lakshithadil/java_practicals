import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Average {
    public static void main(String[] args) {
        double[][] weights = {{54.5, 50, 48}, {43, 56.5, 67, 65.5,59}, {45, 55, 63, 45.5, 54.5}, {66, 49.5,56}};
        double sum1 = 0;
        double sum2 = 0;
        double sum3 = 0;
        double sum4 = 0;
        for (int i = 0; i < weights.length; i++) {
            for (int j = 0; j < weights[i].length; j++) {
                 if(i == 0){
                     sum1  += weights[i][j];
                 }
                if(i == 1){
                    sum2  += weights[i][j];
                }
                if(i == 2){
                    sum3  += weights[i][j];
                }
                if(i == 3){
                    sum4  += weights[i][j];
                }
            }
        }
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Average of the 1st student group: "+df.format(sum1/weights[0].length));
        System.out.println("Average of the 2nd student group: "+df.format(sum2/weights[1].length));
        System.out.println("Average of the 3rd student group: "+df.format(sum3/weights[2].length));
        System.out.println("Average of the 4th student group: "+df.format(sum4/weights[3].length));

    }
}
