public class ifelse {
    public static void main(String[] args) {
        int a, b, c;
        a = 3;
        b = 10;
        c = 7;
        //Min value
        if (a < b && a < c){
            System.out.println("Min: " + a);
        }
        else if (b < a && b < c){
            System.out.println("Min: " + b);
        }
        else if (c < a && c < b){
            System.out.println("Min: " + c);
        }
        //Max value
        if (a > b && a > c){
            System.out.println("Max: " + a);
        }
        else if (b > a && b > c){
            System.out.println("Max: " + b);
        }
        else if (c > a && c > b){
            System.out.println("Max: " + c);
        }
    }
}
