class A{
    void add(int a, int b){
        int c=a+b;
        System.out.println("Total Integer Number is: "+c);
    }
    void add(double a, double b){
        double c=a+b;
        System.out.println("Total Double number is :"+c);
    }
    void add(){
        System.out.println("Welcome!");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        A obj=new A();
        obj.add(20,30);
        obj.add(40.5f,50.6f);
        obj.add();
    }
}
