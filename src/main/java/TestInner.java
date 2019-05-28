class Outter{
    private String name = "test";
    private static int age = 20;
    //成员内部类
    class Inner{
        public void fun(){
            System.out.println(name);
            System.out.println(age);
        }
    }

}


public class TestInner {
    public static void main(String[] args) {
      //创建非静态内部类
        Outter.Inner in = new Outter().new Inner();
        in.fun();

    }
}
