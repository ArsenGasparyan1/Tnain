package homework.books;

public class AuthorStorage {


    private Author[] array = new Author[10];
    private int size = 0;

    void add(Author value) {
        if (size == array.length) {
            Author[] tmp = new Author[array.length + 10];
            for (int i = 0; i < size; i++) {
                tmp[i] = array[i];

            }
            array = tmp;
        }
        array[size++] = value;

    }

    void printarray() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i]);

        }
    }

    void printAuthorName(String authorByAuthorName) {
        for (int i = 0; i < size; i++) {
            if (array[i].getName().equals(authorByAuthorName)) {
                System.out.println(array[i]);
            }
        }
    }
    public void printAuthorSurname(String genre) {
        for (int i = 0; i < size; i++) {
            if (array[i].getSurname().equals(genre)) {
                System.out.println(array[i]);
            }
        }
    }

            }







