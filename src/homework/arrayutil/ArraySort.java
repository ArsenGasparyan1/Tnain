package homework.arrayutil;

public class ArraySort {

    public static void main(String[] args) {
        int[] numbers = {43, 55, 7, 9, 0, 12, 5, 65};
        int tmp = 0;
        System.out.println("Մեծից փոքր");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }

            }
            System.out.print(numbers[i] + ",");

        }
        System.out.println();

        System.out.print('\n');

        System.out.println("Փոքրից մեծ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;

                }

            }
            System.out.print(numbers[i] + ",");

        }


        }




        }














