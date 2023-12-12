import org.w3c.dom.ls.LSOutput;
//MÉTODO SOBRECARGA
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
public class OperacionM {
    int a;
    int b;
    int c;
    double d;
    double e;

    public OperacionM(int a, int b) {
        // suma normal
        this.a = a;
        this.b = b;
    }

    public OperacionM(int a, int b, int c) {
        // suma normal + 5
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public OperacionM(double d, double e) {
        // suma normal + 2
        this.d = d;
        this.e = e;
    }

    // funciones
    public int suma(int a, int b) {
        int sum1;
        sum1 = (a + b);
        System.out.println("La suma es: " + sum1);
        return sum1;
    }

    public int suma(int a, int b, int c) {
        int sum2;
        sum2 = (a + b + c) + 5;
        System.out.println("La suma es: " + sum2);
        return sum2;
    }

    public double suma(double d, double e) {
        double sum3;
        sum3 = (d + e) + 2;
        System.out.println("La suma es: " + sum3);
        return sum3;
    }

    // PRINT
    public static void main(String[] args) {
        OperacionM objeto1 = new OperacionM(3, 2);
        OperacionM objeto2 = new OperacionM(3, 2, 5);
        OperacionM objeto3 = new OperacionM(2.5, 4.1);
        objeto1.suma(objeto1.a, objeto1.b);
        objeto2.suma(objeto2.a, objeto2.b, objeto2.c);
        objeto2.suma(objeto3.d, objeto3.e);
    }
}