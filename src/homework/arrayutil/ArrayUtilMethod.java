package homework.arrayutil;

public class ArrayUtilMethod {

    int max(int[] array) {
        int maxIndex = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxIndex) {
                maxIndex = array[i];
            }
        }
        return maxIndex;
    }
    int min (int[] array){
        int minIndex = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minIndex){
                minIndex = array[i];
            }


            }
        return  minIndex;
        }


    }







