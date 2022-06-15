package homework.DynamicArray;

public class DynamicArrayDemo {

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(20);
        dynamicArray.add(0);
        dynamicArray.add(77);
        dynamicArray.add(24);
        dynamicArray.add(85);
        dynamicArray.add(-87);
        dynamicArray.add(2045);
        dynamicArray.add(745);
        dynamicArray.add(784);
        dynamicArray.add(277);
        dynamicArray.add(848);
        dynamicArray.add(745);
        dynamicArray.printArray();
        System.out.println(dynamicArray.isEmpty());
        System.out.println(dynamicArray.getByindex(8));
        System.out.println(dynamicArray.getFirstindexByValue(77));
        dynamicArray.set(5, 100);
        System.out.println();
        dynamicArray.add(6, 12);
        dynamicArray.printArray();
        dynamicArray.delete(9);
        System.out.println();
        dynamicArray.printArray();

    }




}
