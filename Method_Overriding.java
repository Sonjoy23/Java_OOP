class shape{
    void draw(){
        System.out.println("Can't say shape type");
    }
}

class square extends shape{
    @Override
    void draw(){
        System.out.println("Square Shape");
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
        square obj=new square();
        obj.draw();
    }

}
