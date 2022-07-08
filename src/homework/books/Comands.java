package homework.books;

public interface Comands {


    int EXIT = 0;
    int ADD_BOOK = 1;
    int PRINT_ALL_BOOK = 2;
    int PRINT_BOOK_BY_AUTHOR_NAME = 3;
    int PRINT_BOOKS_BY_GENRE = 4;
    int PRINT_BOOKS_BY_PRICE_RANGE = 5;

    int ADD_AUTHOR = 6;
    int PRINT_AUTHOR=7;
    int REGISTRATION = 8;
    int LOGIN = 9;

    static void printreclok(){
        System.out.println("input" + REGISTRATION + "for Registration" );
        System.out.println("input" + LOGIN + "for Login" );
    }

    static void print(){
        System.out.println("please input" +EXIT+" for exit");
        System.out.println("please input" +ADD_BOOK+" for add book");
        System.out.println("please input" +PRINT_ALL_BOOK+" for print all book");
        System.out.println("please input" +PRINT_BOOK_BY_AUTHOR_NAME+" for print book by author name");
        System.out.println("please input" +PRINT_BOOKS_BY_GENRE+" for print books by genre");
        System.out.println("please input" +PRINT_BOOKS_BY_PRICE_RANGE+" for print books by price range");
        System.out.println("please input" +ADD_AUTHOR+" for add author");
        System.out.println("please input" +PRINT_AUTHOR+" for print author");
    }





}
