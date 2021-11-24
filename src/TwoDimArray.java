import java.util.Arrays;
import java.util.OptionalInt;

public class TwoDimArray {
    public static void main(String[] args) {
        //Creating an array called a
        int [][] a = createArray(6, 6);

        for (int i = 0; i < a.length; i++) {    //rows
            for (int j = 0; j < a[0].length; j++) {     //columns
                System.out.print(" " + a[i][j] + " ");
            }
            System.out.println();   //line break for visual purposes
        }

        //findMaxNumDiagonal
        OptionalInt b = findMaxNumDiagonal(a);
        System.out.println(b.getAsInt());

        //findMaxNumDiagonalReverse
        OptionalInt c = findMaxNumDiagonalReverse(a);
        System.out.println(c.getAsInt());

        //findMaxNumOddRow
        OptionalInt d = findMaxNumOddRow(a);
        System.out.println(d.getAsInt());

        //findMaxNumOddColumn
        OptionalInt e = findMaxNumOddColumn(a);
        System.out.println(e.getAsInt());
    }
    static int[][] createArray(int sizeArrayA, int sizeArrayB){
        //sizeArrayA = rows
        //sizeArrayB = columns
        int[][] array = new int[sizeArrayA][sizeArrayB];

        //creation of array
        for (int i = 0; i < sizeArrayA; i++){
            for (int j = 0; j < sizeArrayB; j++){
                array[i][j] = (int)(Math.random()*100);
            }
        }

        return array;
    }
    static OptionalInt findMaxNumDiagonal(int[][] array){
        int[] calcArray = new int[array.length];

        //adding nums from diagonal to calcArray
        for (int i = 0; i < array.length; i++){
            calcArray[i] = array[i][i];
        }

        //defining max num
        OptionalInt max = Arrays.stream(calcArray).max();
        max.getAsInt();

        System.out.println("findMaxNumDiagonal");

        return max;
    }
    static OptionalInt findMaxNumDiagonalReverse(int[][] array){
        int[] calcArray = new int[array.length];

        //adding nums from reversed diagonal to calcArray
        for (int i = 0; i < array.length; i++){
            calcArray[i] = array[i][array.length - i - 1];
        }

        //defining max num
        OptionalInt max = Arrays.stream(calcArray).max();
        max.getAsInt();

        System.out.println("findMaxNumDiagonalReverse");

        return max;
    }
    static OptionalInt findMaxNumOddRow(int[][] array){
        int index = 0;
        int[] calcArray = new int[(array.length / 2) * array[0].length];

        //adding nums from odd rows
        for (int i = 0; i < array.length; ++i){
            for (int j = 0; j < array[0].length; ++j){
                if (i % 2 == 0 || i == 0){
                    continue;
                }
                else{
                    calcArray[index++] = array[i][j];
                }
            }
        }

        //defining max num
        OptionalInt max = Arrays.stream(calcArray).max();
        max.getAsInt();

        System.out.println("findMaxNumOddRow");
        return max;
    }
    static OptionalInt findMaxNumOddColumn(int[][] array){
        int index = 0;
        int[] calcArray = new int[(array[0].length / 2) * array.length];

        //adding nums from odd columns
        for (int i = 0; i < array[0].length; ++i){
            for (int j = 0; j < array.length; ++j){
                if (j % 2 == 0 || j == 0){
                    continue;
                }
                else{
                    calcArray[index++] = array[i][j];
                }
            }
        }

        //defining max num
        OptionalInt max = Arrays.stream(calcArray).max();
        max.getAsInt();

        System.out.println("findMaxNumOddColumn");

        return max;
    }
}
