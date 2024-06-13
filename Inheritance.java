class child1{
    void display1(){
        System.out.println("This class name is child1");
    }
}
class child2 extends child1{
    void display2(){
        System.out.println("This class name is child2");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        child2 obj=new child2();
        obj.display1();
        obj.display2();


    }

}
