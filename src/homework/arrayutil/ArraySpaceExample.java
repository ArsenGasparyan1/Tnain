package homework.arrayutil;

public class ArraySpaceExample {

    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int firstindex = 0;
        int lastindex = spaceArray.length - 1;

        while (firstindex < lastindex && spaceArray[lastindex] ==' '){
            lastindex--;
        }
        while (firstindex < lastindex && spaceArray[firstindex] == ' '){
            firstindex++;
        }
        char[] result = new char[(lastindex - firstindex) + 1];
        int index = 0;
        for (int i = firstindex; i < lastindex + 1 ; i++) {
            result[index++] = spaceArray[i];
        }
        for (char c : result){
            System.out.print(c);
        }

    }
}
