import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] data =new int[]{1,3,5,2,2};
        Arrays.sort(data);
        int i = find(data,data.length,3);
        System.out.println(i);


    }
    public static int find(int[] data,int size,int k){
        int j =0;
        for(int i=0;i<size;i++){
            if(i==size-k){
                j = data[i];
                break;
            }
        }
        return j;
    }


}
