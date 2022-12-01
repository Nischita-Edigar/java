abstract class shape{
    abstract void draw();
}
class Rectangle extends shape{
    void draw(){System.out.println("Drawing Rectangle");}
}
class Circle extends shape{
    void draw(){System.out.println("Drawing circle");}
}
class TestAbstraction1{
    public static void main(String[]args){
        Rectangle r = new Rectangle();
        r.draw();
    }
}