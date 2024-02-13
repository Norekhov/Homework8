public class Main {
    public static void main(String[] args) {
        System.out.println("Задача № 1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();

        double[] numbersNew = {1.57, 7.654, 9.986};
        for (int i = 0; i < numbersNew.length; i++) {
            System.out.println(numbersNew[i]);
        }
        System.out.println();

        int[] studentInSchool = {30, 25, 27, 26, 25, 30, 28, 36, 29, 21, 22};
        for (int i = 0; i < studentInSchool.length; i++) {
            System.out.println(studentInSchool[i]);
        }
        System.out.println();

        System.out.println("Задача № 2");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < numbersNew.length; i++) {
            System.out.print(numbersNew[i]);
            if (i < numbersNew.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < studentInSchool.length; i++) {
            System.out.print(studentInSchool[i]);
            if (i < studentInSchool.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача № 3");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = numbersNew.length - 1; i >= 0; i--) {
            System.out.print(numbersNew[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = studentInSchool.length - 1; i >= 0; i--) {
            System.out.print(studentInSchool[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача № 4");
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                numbers[i]++;
                System.out.println(numbers[i]);
            }
        }
    }
}