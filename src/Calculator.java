public class Calculator {
    private int a;
    private int b;
    private float aFloat;
    private float bFloat;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Calculator(float aFloat, float bFloat) {
        this.aFloat = aFloat;
        this.bFloat = bFloat;
    }
    public int minus(int a, int b){
        return a - b;
    }
    public float minus(float a, float b){
        return a - b;
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
