package DSA_LAB_02;

public class Rectangle {
   int length;
   int breadth;
    Rectangle (int ln, int br){
        this.length=ln;
        this.breadth=br;
    }
    public int area(){
        return length*breadth;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,5);
        Rectangle r2 = new Rectangle(5,8);

        System.out.println("Area 1: "+r1.area());
        System.out.println("Area 2: "+r2.area());
    }
 }
