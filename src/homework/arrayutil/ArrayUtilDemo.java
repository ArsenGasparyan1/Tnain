package homework.arrayutil;

import java.util.Arrays;

public class ArrayUtilDemo {
    public static void main(String[] args) {

        ArrayUtilMethod arr = new ArrayUtilMethod();
        int [] array = {4,8,0,3,6,10,14,19,22,-1};
         int max = arr.max(array);
        System.out.println(max);
        int min = arr.min(array);
        System.out.println(min);




    }

}
