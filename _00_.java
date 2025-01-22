#1000
import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner kb = new Scanner(System.in);
        
        int a =kb.nextInt();
        int b =kb.nextInt();
        
        System.out.println(a+b);
        
        kb.close();
    }
}


#2442
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        for (int i = N; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

#2741
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
