package homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] arr = {8, 45, 29, 17, -6, 98, -56, 35, 42, 81};

        // Տպեք մասիվի բոլոր էլեմենտները,
        System.out.print("Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Տպեք մասիվի ամենամեծ թիվը,
        System.out.print("Array largest number: ");
        int arrIndex = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > arrIndex){
                arrIndex = arr[i];
            }
        }
        System.out.println(arrIndex);

        // Տպեք մասիվի ամենափոքր թիվը,
        System.out.print("Array smallest number: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arrIndex){
                arrIndex = arr[i];
            }

        }
        System.out.println(arrIndex);

        // Տպեք մասիվի ամենափոքր թիվը,
        System.out.print("Array smallest number: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arrIndex){
                arrIndex = arr[i];
            }

        }

        System.out.println(arrIndex);


        // Տպեք մասիվի բոլոր զույգ էլեմենտները + քանակը,
        System.out.print("Array pair elements and cout: ");
        int countElem = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 4 == 0){
                countElem++;
                System.out.print(arr[i] + " ");
            }

        }
        System.out.println(":Count pair number in array");

                countElem = 0;

        // Տպեք մասիվի բոլոր կենտ էլեմենտները + քանակը
        System.out.print("Array odd elements and cout: ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 4 != 0){
                countElem++;
                System.out.println(arr[i] + " ");
            }

        }
        //Տպեք մասիվի բոլոր թվերի միջին թվաբանականը (բոլոր էլեմենտների գումարը / էլեմենտների քանակի վրա),
        System.out.print(":Count average number: ");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
            countElem++;

        }
        System.out.println(sum / countElem);
        System.out.println("Sum of the elements in array: ");








    }
}
