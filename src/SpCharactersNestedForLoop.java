public class SpCharactersNestedForLoop {
    public static void main(String[] args) {
        System.out.print("\"saman\" is \'18\' years old.\nAge\\:\t18");
        System.out.println("");
        for(int i =1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}

