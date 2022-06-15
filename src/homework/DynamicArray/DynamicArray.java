package homework.DynamicArray;

public class DynamicArray {
    int[] array = new int[10];
    private int size = 0;

    void add(int value) {
        if (size == array.length) {
            int[] tmp = new int[array.length + 10];
            for (int i = 0; i < size; i++) {
                tmp[i] = array[i];
            }
            array = tmp;
        }
        array[size++] = value;

    }

    void printArray() {

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public boolean isEmpty() {
        if (array.length < 0) {
            return true;
        }
        return false;
    }

    public int getByindex(int index) {
        if (index > array.length) {
            return 0;
        }
        return array[index];
    }

    public int getFirstindexByValue(int value) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (index == -1) {
                return 0;
            } else if (array[i] == value) {
                index = i;
                break;

            }

        }
        return index;
    }
        public void set(int index, int value){
            for (int i = 0; i < size; i++) {
                if (index == i){
                    array[i] = value;
                }
                System.out.print(array[i]+ " ");
            }

        }
        public void add(int index, int value){
            for (int i = index; i <= size; i++) {
                int tmp = value;
                value = array[i];
                array[i] = tmp;
            }
            size++;
        }
        public  void delete(int index){
            for (int i = index +1; i < size; i++) {
                array[i -1]= array[i];
            }
            size--;
        }



}
