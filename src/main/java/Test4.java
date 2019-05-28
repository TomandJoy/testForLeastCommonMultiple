import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(1<=a && a<=100){
            int b = sum(a);

            System.out.println(b);

        }


    }
    public static int sum(int a){
        for(int x = 0; x < a; x++){
            for(int y = 0; y < a; y++){
                if((6*x+8*y==a) || (8*x+6*y==a)){
                    return x+y;
                }
            }
        }
        return -1;

    }
}
