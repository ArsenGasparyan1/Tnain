package homework.arrayutil;

import java.util.Arrays;

public class CharArrayExample {

    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (c == chars[i]) {
                count++;
            }
        }
        System.out.println(count);

        char[]chars2 = {'j','a','v','a','l','o','v','e'};
        int item = (chars2.length) / 2;
        for (int i = (item - 1); i <= item; i++) {
            System.out.print(chars2[i]);
        }
        System.out.println("\n");


        char[] chars3 = {'j','a','v','a','l','o','v','e'};
        char[] checkChars = {'l', 'y'};
        char[] lastChars = new char[2];

        int lenght = 0;
        for (int i = chars3.length - 2; i <= chars3.length - 1; i++) {
            lastChars[lenght] = chars3[i];
            lenght++;
        }

        if (Arrays.equals(checkChars, lastChars)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println("\n");

        char[] text = {' ', ' ', 'b', 'a','r','e','v', ' ',' '};
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i]);
            }
        }
    }
}

