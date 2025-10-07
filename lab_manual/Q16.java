public class Q16 {
    public static void main(String[] args) {
        // for(int i=1;i<=5;i++){
        // // print first
        // for(int k=1;k<=5-i;k++){
        // System.out.print(" ");
        // }
        // for(int j=1;j<=i;j++){
        // System.out.print(i+" ");
        // }
        // System.out.println();
        // }

        for (int i = 1; i <= 5; i++) {
            // print spaces
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
}
