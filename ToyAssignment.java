import java.util.Scanner;

public class ToyAssignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a movie's name: ");
        String x = input.nextLine();

        System.out.println("The length of the string: "+x.length());

        System.out.println("Enter a letter: ");
        char y = input.next().charAt(0);
        System.out.println(x.indexOf(y));

        System.out.println("Enter a number: ");
        int z = input.nextInt();
        System.out.println(x.substring(0, z));


    }
}
