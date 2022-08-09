import java.util.Scanner;

public class Member {
    char sex;
    char ageLess40;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sex ( M or F ): ");
        char sex = Character.toUpperCase(input.next().charAt(0));
        System.out.println("Do your age less than 40 ( Y or N ): ");
        char ageLess40 = Character.toUpperCase(input.next().charAt(0));
        Member member = new Member(sex,ageLess40);
        System.out.println(member.sex +" "+ member.ageLess40);
        System.out.println(member.placeOfService(member.sex, member.ageLess40));
    }
    public String placeOfService(char sex, char ageLess40){
        String place = "";
        switch (sex){
            case 'F':
                place = "urban areas";
                break;
            case 'M':
                switch (ageLess40){
                    case 'Y':
                        place = "anywhere";
                        break;
                    case 'N':
                        place = "urban areas only";
                        break;
                    default:place = "ERROR";
                }
            default:place = "ERROR";
        }
    return place;
    }

    public Member(char sex, char ageLess40) {
        this.sex = sex;
        this.ageLess40 = ageLess40;
    }
}
