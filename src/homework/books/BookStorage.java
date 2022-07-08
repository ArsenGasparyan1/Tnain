package homework.books;

public class BookStorage {



    private Book[]array = new Book[10];
    private int size = 0;

    void add (Book value){
        if (size == array.length){
            Book[]tmp = new Book[array.length + 10];
            for (int i = 0; i < size; i++) {
                tmp[i] = array[i];

            }
            array = tmp;
        }
        array[size++] = value;

    }
    void printarray(){
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i]);

        }
    }
    void printBookByAuthorName(String bookbyAuthorName){
        for (int i = 0; i < size; i++) {
            if (array[i].getAuthorName().equals(bookbyAuthorName)){
                System.out.println(array[i]);
            }
        }
    }
    public void printBookbyGenre(String genre) {
        for (int i = 0; i < size; i++) {
            if (array[i].getGenre().equals(genre)) {
                System.out.println(array[i]);

            }
        }
    }


    public void printBookPrice(double fprice, double sprise) {
        for (int i = 0; i < size; i++) {
            if(array[i].getPrice() < sprise && array[i].getPrice()> fprice){
                System.out.println(array[i]);
            }
        }
    }






}
