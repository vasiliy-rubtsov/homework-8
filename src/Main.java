import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] iArr = new int[] {1, 2, 3};
        double[] dArr = {1.57, 7.654, 9.986};
        int[] iArr2 = {3, 5, 7, 9, 11};

        //Задача 2
        System.out.println("Задача 2");
        for (int i = 0; i < iArr.length; i++) {
            if (i == 0) {
                System.out.print(iArr[i]);
            } else {
                System.out.print(", " + iArr[i]);
            }
        }
        System.out.println();

        for (int i = 0; i < dArr.length; i++) {
            if (i == 0) {
                System.out.print(dArr[i]);
            } else {
                System.out.print(", " + dArr[i]);
            }
        }
        System.out.println();

        for (int i = 0; i < iArr2.length; i++) {
            if (i == 0) {
                System.out.print(iArr2[i]);
            } else {
                System.out.print(", " + iArr2[i]);
            }
        }
        System.out.println();

        System.out.println("-----");

        //Задача 3
        System.out.println("Задача 3");
        for (int i = iArr.length - 1 ; i >= 0; i--) {
            if (i == 0) {
                System.out.print(iArr[i]);
            } else {
                System.out.print(iArr[i] + ", ");
            }
        }
        System.out.println();

        for (int i = dArr.length - 1 ; i >= 0; i--) {
            if (i == 0) {
                System.out.print(dArr[i]);
            } else {
                System.out.print(dArr[i] + ", ");
            }
        }
        System.out.println();

        for (int i = iArr2.length - 1 ; i >= 0; i--) {
            if (i == 0) {
                System.out.print(iArr2[i]);
            } else {
                System.out.print(iArr2[i] + ", ");
            }
        }
        System.out.println();
        System.out.println("-----");

        //Задача 4
        System.out.println("Задача 4");
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] % 2 != 0) {
                iArr[i]++;
            }
        }
        System.out.println(Arrays.toString(iArr));
        System.out.println("-----");
    }
}