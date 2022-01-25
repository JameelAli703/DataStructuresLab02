package DSA_LAB_02;

public class Complex {
    int Real;
    int Imag;
    public Complex(int real, int image) {
        Real = real;
        Imag = image;
    }
    public static Complex add(Complex a, Complex b) {
        return new Complex((a.Real + b.Real), (a.Imag - b.Imag));
    }
    public static Complex diff(Complex a, Complex b) {
        return new Complex((a.Real - b.Real), (a.Imag - b.Imag));
    }
    public static Complex product(Complex a, Complex b) {
        return new Complex(((a.Real * b.Real) - (a.Imag * b.Imag)),
                ((a.Real * b.Imag) + (a.Imag * b.Real)));
    }
    public void printComplex() {
        if (Real == 0 && Imag != 0) {
            System.out.println(Imag + "i");
        } else if (Imag == 0 && Real != 0) {
            System.out.println(Real);
        } else {
            System.out.println("="+Real + "+" + Imag + "i");
        }
    }
    public static void main(String[] args) {
        Complex c = new Complex(10, 15);
        Complex d = new Complex(7, 14);
        Complex e = Complex.add(c, d);
        Complex f = Complex.diff(c, d);
        Complex g = Complex.product(c, d);
        e.printComplex();
        f.printComplex();
        g.printComplex();
    }
    }
