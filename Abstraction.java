abstract class animal{
    public abstract void cow();
    public void dog(){
        System.out.println("This is a dog method");
    }
}
class Abstraction extends animal {
    @Override
    public void cow(){
        System.out.println("This is a cow method");
    }

    public static void main(String[] args) {
        Abstraction obj=new Abstraction();
        obj.dog();
        obj.cow();
    }

}
