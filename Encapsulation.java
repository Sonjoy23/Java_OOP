class ClassX{
    private int value;
    public void setValue(int x){
        value=x;
    }
    public int getValue(){
        return ++value;
    }
}
class Encapsulation {
    public static void main(String[] args) {
        ClassX obj =new ClassX();
        obj.setValue(100);
        System.out.println(obj.getValue());
    }
}
