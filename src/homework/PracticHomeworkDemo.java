package homework;

public class PracticHomeworkDemo {
    public static void main(String[] args) {


        PracticHomework prhome = new PracticHomework();
        long min = prhome.comvert(50);
        System.out.println(min);
        int  days = prhome.calcAge(10);
        System.out.println(days);
        int nextnumber = prhome.nextNumber(20);
        System.out.println(nextnumber);
        boolean ecuall = prhome.lessThanOrEqualToZero(9);
        System.out.println(ecuall);
        boolean issame = prhome.isSameNum(5,10);
        System.out.println(issame);
        boolean value = prhome.reverseBool(true );
        System.out.println(value);
        int [] arr1 = new int[30];
        int [] arr2 = new int[20];
        int maxLenght = prhome.Maxlenght(arr1, arr2);
        System.out.println(maxLenght);

    }
}
