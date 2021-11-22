import java.util.Arrays;

public class ForIterative {
    public static void main(String[] args) {
        int massive[] = {92,43,2,1,0,24,50,2,3,4,88};

        for (int i = 0; i < massive.length; i++){
            if (massive[i] == 24){
                System.out.println("Is a 24");
            }
            else{
                System.out.println("Isn`t a 24");

            }
        }

        for (int i = 0; i < massive.length / 2; i++) {
            int a = massive[i];
            massive[i] = massive[massive.length - 1 - i];
            massive[massive.length - 1 - i] = a;
        }
        System.out.println(Arrays.toString(massive));

        int massive2[] = {92,43,1,0,24,50,2,2,3,4,88};
        int a = 0;
        for (int i = 0; i < massive2.length; i++){
            a += massive2[i];
        }
        System.out.println(a);

        for (int i = 0; i < massive2.length; i++) {
            for (int j = i+1; j < massive2.length; j++) {
                if(massive2[i] == massive2[j]){
                    System.out.println(massive2[i]);
                }
            }
        }

        int b = 0;
        for (int i = 0; i < massive2.length; i++){
            b += massive2[i];
        }
        b /= massive2.length;
        System.out.println(b);

        int[] massive3 = new int[150];
        for (int i = 0; i < massive3.length; i++){
            massive3[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(massive3));
    }
}
