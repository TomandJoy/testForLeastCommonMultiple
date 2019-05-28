import java.util.Scanner;

public class Test2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a*b;
        int d = 0;
        while (a%b!=0){
            d = a%b;
            a = b;
            b = d;
        }
        int e = c/b;
        System.out.println(e);
    }
}