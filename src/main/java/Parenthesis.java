public class Parenthesis {
    public static void main(String[] args) {
        String A = "(()())";
        int k = A.length();
       boolean c= chkParenthesis(A,k);
        System.out.println(c);

    }
    public static boolean chkParenthesis(String A, int n) {
        char[] B= A.toCharArray();
        char[] C = new char[n];
        int count = 0;
        for(int i= 0;i< n;i++){
            if((B[i]=='('||B[i]==')') || (!(B[0]==')')) || (n%2==0)){
                C[i]=B[i];
                count++;
                if(C[i]=='('&& B[i+1]==')'){
                    count--;

                }
            }
        }
        if(count==0){
            return true;
        }else{
            return false;
        }


    }
}
