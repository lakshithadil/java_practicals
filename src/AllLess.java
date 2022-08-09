public class AllLess {
    public static void main(String[] args) {
        int [] a = {10, 20, 30, 40, 50};
        int [] b = {35, 30, 60, 73, 55};
        AllLess allLess = new AllLess();
        System.out.println(allLess.allLess(a,b));
        
    }
    public boolean allLess(int [] a,int [] b){
        for (int i = 0; i <a.length ; i++) {
            if(a[i]>b[i]){
                return false;
            }
        }
        return true;
    }
}
