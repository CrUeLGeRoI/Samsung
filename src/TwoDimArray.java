import java.util.Arrays;
import java.util.OptionalInt;

public class TwoDimArray {
    public static void main(String[] args) {
        int [][] a = createArray(6, 6);
        System.out.println(Arrays.deepToString(a));
        OptionalInt b = findMaxNumDiagonal(a);
        System.out.println(b.getAsInt());
        OptionalInt c = findMaxNumOddRow(a);
        System.out.println(c.getAsInt());
    }
    static int[][] createArray(int sizeArrayA, int sizeArrayB){
        //sizeArrayA = rows
        //sizeArrayB = columns
        int[][] array = new int[sizeArrayA][sizeArrayB];
        for (int i = 0; i < sizeArrayA; i++){
            for (int j = 0; j < sizeArrayB; j++){
                array[i][j] = (int)(Math.random()*100);
            }
        }

        return array;
    }
    static OptionalInt findMaxNumDiagonal(int[][] array){
        int[] calcArray = new int[array.length * 2];
        for (int i = 0; i < array.length; i++){
            calcArray[i] = array[i][i];
        }
        OptionalInt max = Arrays.stream(calcArray).max();
        max.getAsInt();
        return max;
    }
    static OptionalInt findMaxNumOddRow(int[][] array){
//        int[] calcArray = new int[6];
//        for (int i = 1; i < array.length; i += 2){
//            for (int j = 0; j < array[0].length; j++){
//                calcArray[j] = array[i][j];
//            }
//        }
//        System.out.println(Arrays.toString(calcArray));
        return OptionalInt.of(0);
    }
//    static int[] findMaxNumOddColumn(){
//
//    }
}
