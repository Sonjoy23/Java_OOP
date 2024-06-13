interface client{
    void input(String n, int a);
    void output();

}
class Interface implements client {
    String name; int age;
    @Override
    public void input(String n, int a){
        name=n; age =a;
    }
    @Override
    public void output(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);

    }

    public static void main(String[] args) {
        Interface obj=new Interface();
        obj.input("Sonjoy",20);
        obj.output();
    }
}
