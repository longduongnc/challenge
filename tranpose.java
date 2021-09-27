import java.util.Scanner;

public class tranpose {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int x, y;
        
        System.out.println("Enter how many row: ");
        x = input.nextInt();
        System.out.println("Enter how many column: ");
        y = input.nextInt();
        int[][] arr1 = new int[x][y];
        int[][] arr2 = new int[y][x];
        
        for (int a=0; a<x; a++){
            for(int b=0; b<y;b++){
                System.out.println("Enter your "+"["+(a+1)+"]"+"["+(b+1)+"]");
                arr1[a][b] = input.nextInt();;
            }
        }

        for(int a=0; a<x; a++){
            for(int b=0; b<y; b++){
                arr2[b][a] = arr1[a][b];
            }
        }
        
        for(int a=0; a<y; a++){
            for(int b=0; b<x; b++){
                int z = arr2[a][b];
                System.out.print(z +" ");
            }
            System.out.println("");
        }
        input.close();
    }
}
