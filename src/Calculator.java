public class Calculator {
    private int a;
    private int b;
    private float aFloat;
    private float bFloat;
    private boolean zeroDividing;
    private int c;
    private float cFloat;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Calculator(float aFloat, float bFloat) {
        this.aFloat = aFloat;
        this.bFloat = bFloat;
    }
    public void minus(int a, int b){
        c = a - b;
        System.out.println(c);
    }
    public void minus(float a, float b){
        cFloat = a - b;
        System.out.println(cFloat);
    }

    public void divide(int a, int b){
        try {
            c = a / b;
        } catch (ArithmeticException e) {
//            System.out.println("The cause is: " + e.fillInStackTrace());
            zeroDividing = true;
        }
        if (zeroDividing){
            System.out.println("Число равно 0, замените его на другие целые числа.");
        }
        else{
            c = a / b;
            System.out.println(c);
        }
    }
    public void divide(float a, float b){
        try {
            cFloat = a / b;
        } catch (ArithmeticException e) {
//            System.out.println("The cause is: " + e.fillInStackTrace());
            zeroDividing = true;
        }
        if (zeroDividing){
            System.out.println("Число равно 0, замените его на другие целые числа.");
        }
        else{
            cFloat = a / b;
            System.out.println(cFloat);
        }
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public float getaFloat() {
        return aFloat;
    }

    public float getbFloat() {
        return bFloat;
    }
}
