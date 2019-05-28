import java.util.Scanner;

public class Test1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            char[] data = scanner.nextLine().toCharArray();
            String str = scanner.nextLine();
            for (int i = 0; i <data.length ; i++) {
                if(!(str.contains(String.valueOf(data[i])))){
                    System.out.print(data[i]);
                }

            }
        }
    }
}