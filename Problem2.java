import java.util.Scanner;
public class Problem2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("The output: ");
        for( int i=1; i<=2*n; i++){
            if(i % 2 == 0)
            continue;
            else
            System.out.print(i + " ");
        }
    }
}