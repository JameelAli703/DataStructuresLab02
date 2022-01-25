package DSA_LAB_02;
public class Triangle {
    int s1 = 3, s2 =4, s3 =5;
    float perimeter = s1+s2+s3;
    float sp = perimeter/2;
    float sum = sp*(sp-s1)*(sp-s2)*(sp-s3);
    float area = (float) Math.sqrt(sum);
    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println("Perimeter: "+t.perimeter);
        System.out.println("Area : "+t.area);
    }
}
