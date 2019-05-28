class Person{

    public Person(){
        System.out.println("1.Person类的构造方法");
    }
    {
        //构造块

        System.out.println("2.Person类的构造块");

    }
    static{
        //静态代码块---被static修饰的代码块
        System.out.println("3.Person类的静态代码块");
    }
}
public class TestMethod{
    static{
        System.out.println("4.主类中的静态代码块");
    }
    public static void main(String[] args){


    }
}