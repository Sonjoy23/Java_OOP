public class Constructor {
    String name; int age;
    public Constructor(String n, int a){
        name=n; age=a;
    }
    public void Display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    public static void main(String[] args) {
        Constructor obj=new Constructor("Sonjoy",20);
        obj.Display();

    }
}
