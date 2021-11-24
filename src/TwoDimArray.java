import java.util.Arrays;
import java.util.OptionalInt;

public class TwoDimArray {
    public static void main(String[] args) {
        int [][] a = createArray(6, 6);
        for (int i = 0; i < a.length; i++) {  //идём по строкам
            for (int j = 0; j < a[0].length; j++) {//идём по столбцам
                System.out.print(" " + a[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }
        OptionalInt b = findMaxNumDiagonal(a);
        System.out.println(b.getAsInt());
        OptionalInt c = findMaxNumDiagonalReverse(a);
        System.out.println(c.getAsInt());
        OptionalInt d = findMaxNumOddRow(a);
        System.out.println(d.getAsInt());
        OptionalInt e = findMaxNumOddColumn(a);
        System.out.println(e.getAsInt());
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
        int[] calcArray = new int[array.length];
        for (int i = 0; i < array.length; i++){
            calcArray[i] = array[i][i];
        }
        System.out.println("findMaxNumDiagonal");
        OptionalInt max = Arrays.stream(calcArray).max();
        max.getAsInt();
        return max;
    }
    static OptionalInt findMaxNumDiagonalReverse(int[][] array){
        int[] calcArray = new int[array.length];

        for (int i = 0; i < array.length; i++){
            calcArray[i] = array[i][array.length - i - 1];
        }


        OptionalInt max = Arrays.stream(calcArray).max();
        max.getAsInt();
        System.out.println("findMaxNumDiagonalReverse");
        return max;
    }
    static OptionalInt findMaxNumOddRow(int[][] array){
        int index = 0;
        int[] calcArray = new int[(array.length / 2) * array[0].length];
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
        System.out.println("findMaxNumOddRow");
        OptionalInt max = Arrays.stream(calcArray).max();
        max.getAsInt();
        return max;
    }
    static OptionalInt findMaxNumOddColumn(int[][] array){
        int index = 0;
        int[] calcArray = new int[(array[0].length / 2) * array.length];
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
        System.out.println("findMaxNumOddColumn");
        OptionalInt max = Arrays.stream(calcArray).max();
        max.getAsInt();
        return max;
    }
}
