public class Main {
    public static void main(String[] args) {
        /*
        boolean calc;
        int a, b, c, d, x;
        a = 1;
        b = 5;
        c = 8;
        d = 10;
        x = 3;
        System.out.println(100 * -1);
        // 1st
        calc = x < a && x > b ? true:false;
        System.out.println("1st: " + calc);
        // 2nd
        calc = (x > a && x < b) || (x > c && x < d) ? true:false;
        System.out.println("2nd: " + calc);
        // 3rd
        calc = (x < a && x > b) && (x < c && x > d) ? true:false;
        System.out.println("3rd: " + calc);
        // 4th
        calc = a % 2 == 1 ? true:false;
        System.out.println("4th: " + calc);
        // 5th
        calc = a >= 100 && a % 5 == 0 ? true:false;
        System.out.println("5th: " + calc);
        // 6th
        calc = c < a && c < b && b > a && b > c ? true:false;
        System.out.println("6th: " + calc);
        // 7th
        calc = -a == b || -a == c || -a == d || -b == a || -b == c  || -b == d || -c == a || -c == b || -c == d || -d == a || -d == b || -d == c ? true:false;
        System.out.println("7th: " + calc);
        // 8th
        calc = (a % 2 == 0 && b % 2 == 0) || (a % 2 == 0 && c % 2 == 0) || (b % 2 == 0 && c % 2 == 0) ? true:false;
        System.out.println("8th: " + calc);
        // 9th
        calc = a + b > c && a + c > b && b + c > a  ? true:false;
        System.out.println("9th: " + calc);
        // 10th
        calc = a % 4 == 0 ? true:false;
        System.out.println("10th: " + calc);
        // 11th
        calc = a % 4 != 0 ? true:false;
        System.out.println("11th: " + calc);
        // 12th
        calc = a / 1 == a && a / a == 1 ? true:false;
        System.out.println("12th: " + calc);
        // 13th
        calc = (a % 2 != 0 && b % 2 != 0) || (a % 2 != 0 && c % 2 != 0) || (b % 2 != 0 && c % 2 != 0) ? true:false;
        System.out.println("13th: " + calc);
        // 14th
        calc = Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) && Math.pow(a, 2) + Math.pow(c, 2)  == Math.pow(b, 2) && Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2) ? true:false;
        System.out.println("14th: " + calc);
         */
        //calculators for subtraction
        Calculator calc = new Calculator(6, 4);
        Calculator calc1 = new Calculator(5f, 4f);

        //calculators for division
        Calculator calc_divide = new Calculator(100, 0);
        Calculator calc_divide1 = new Calculator(51.66f, 2.1f);

        //subtraction
        calc.minus(calc.getA(), calc.getB());
        calc1.minus(calc1.getaFloat(), calc1.getbFloat());
        //division
        calc_divide.divide(calc_divide.getA(), calc_divide.getB());
        calc_divide1.divide(calc_divide1.getaFloat(), calc_divide1.getbFloat());
    }
}
