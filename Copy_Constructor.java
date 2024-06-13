
class classA{
    String name; int age;
    classA(){
       name="Sonjoy das"; age=20;
       System.out.println("Name: "+name+" age: "+age);
    }
    classA(classA ref){
       name=ref.name;
       age=ref.age;
        System.out.println("Name: "+name+" age: "+age);

    }
}
public class Copy_Constructor {
    public static void main(String[] args) {
        classA obj1=new classA();
        classA obj2=new classA(obj1);

    }
}
