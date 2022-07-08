package homework.books;

import java.util.Scanner;

public class BookDemo implements Comands {

    private static Scanner scaner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    private static AuthorStorage authorStorage = new AuthorStorage();

    private static UserStorige userStorige = new UserStorige();

    public static void main(String[] args) {
        Author dante = new Author("Dante", "Aligheri", "dante@mail.com", "male");
        Author hitler = new Author("Adolf", "Hitler", "adolf@mail.com", "male");
        Author agata = new Author("Agata", "Kristi", "agata@mail.com", "female");
        authorStorage.add(dante);
        authorStorage.add(hitler);
        authorStorage.add(agata);
        bookStorage.add(new Book("inferno", dante, 4.800, 4, "Detektiv"));
        bookStorage.add(new Book("rebeka", hitler, 8.500, 3, "romantic"));
        bookStorage.add(new Book("emma", agata, 9.900, 5, "roman"));
        boolean run = true;
        while (run) {
            Comands.printreclok();
            int comand;
            try {
                comand = Integer.parseInt(scaner.nextLine());
            } catch (NumberFormatException e) {
                comand = -1;
            }
            if (comand == REGISTRATION) {
                reglog();
            }
            if(comand == LOGIN){
                login();
                while (userStorige.getSize() != 0){
                    Comands.print();
                    int innercomand =Integer.parseInt(scaner.nextLine());
                    switch (innercomand) {
                        case EXIT:
                            run = false;
                            break;

                        case ADD_BOOK:
                            addbooks();
                            break;
                        default:
                            System.out.println("invalid string");
                            break;
                        case PRINT_ALL_BOOK:
                            bookStorage.printarray();
                            break;
                        case PRINT_BOOK_BY_AUTHOR_NAME:
                            System.out.println("input bookAuthor");
                            String bauthor = scaner.nextLine();

                            bookStorage.printBookByAuthorName(bauthor);
                            break;
                        case PRINT_BOOKS_BY_GENRE:
                            System.out.println("input genre");
                            String genre = scaner.nextLine();
                            bookStorage.printBookbyGenre(genre);
                            break;
                        case PRINT_BOOKS_BY_PRICE_RANGE:
                            System.out.println("input frst price");
                            double fprice = Double.parseDouble(scaner.nextLine());
                            System.out.println("input second price");
                            double sprise = Double.parseDouble(scaner.nextLine());
                            bookStorage.printBookPrice(fprice, sprise);
                            break;
                        case ADD_AUTHOR:
                            addAuthor();
                            break;
                        case PRINT_AUTHOR:
                            authorStorage.printarray();
                            break;


                    }    
                }
            }
//            Comands.print();
//            int comand = Integer.parseInt(scaner.nextLine());
//            switch (comand){
//                case EXIT:
//                    run = false;
//                    break;
//
//                case ADD_BOOK:
//                    addbooks();
//                    break;
//                default:
//                    System.out.println("invalid string");
//                    break;
//                case PRINT_ALL_BOOK:
//                    bookStorage.printarray();
//                    break;
//                case PRINT_BOOK_BY_AUTHOR_NAME:
//                    System.out.println("input bookAuthor");
//                    String bauthor = scaner.nextLine();
//
//                    bookStorage.printBookByAuthorName(bauthor);
//                    break;
//                case PRINT_BOOKS_BY_GENRE:
//                    System.out.println("input genre");
//                    String genre = scaner.nextLine();
//                    bookStorage.printBookbyGenre(genre);
//                    break;
//                case PRINT_BOOKS_BY_PRICE_RANGE:
//                    System.out.println("input frst price");
//                    double fprice = Double.parseDouble(scaner.nextLine());
//                    System.out.println("input second price");
//                    double sprise = Double.parseDouble(scaner.nextLine());
//                    bookStorage.printBookPrice(fprice,sprise);
//                    break;
//                case ADD_AUTHOR:
//                    addAuthor();
//                    break;
//                case PRINT_AUTHOR:
//                    authorStorage.printarray();
//                    break;
//
//
//            }
        }
    }

    private static void login() {
        System.out.println("input user login");
        String login = scaner.nextLine();

        System.out.println("input user password");
        String pass = scaner.nextLine();
        userStorige.loguser(login,pass);
    }

    private static void reglog() {
        System.out.println("input  user name");
        String name = scaner.nextLine();
        System.out.println("input user surname");
        String usname = scaner.nextLine();
        System.out.println("input user years");
        int years = Integer.parseInt(scaner.nextLine());
        System.out.println("input user login");
        String login = scaner.nextLine();
        System.out.println("input user password");
        String pass = scaner.nextLine();

        Registration registration = new Registration(name,usname,years,login,pass);
        userStorige.registration(registration);


    }

    private static void addbooks() {

        System.out.println("input book title");
        String btitle = scaner.nextLine();
        Author author = addAuthor();
        System.out.println("input book price");
        String prince = scaner.nextLine();
        System.out.println("input book count");
        String counts = scaner.nextLine();
        System.out.println("input book genre");
        String genres = scaner.nextLine();

        double doublePrice = Double.parseDouble(prince);
        int intCount = Integer.parseInt(counts);

        Book book = new Book(btitle, author, doublePrice, intCount, genres);
        bookStorage.add(book);
        System.out.println("book created");
    }

    private static Author addAuthor() {
        System.out.println("Input author name");
        String authorName = scaner.nextLine();
        System.out.println("Input author surname");
        String authorSurname = scaner.nextLine();
        System.out.println("Input author email");
        String authorEmail = scaner.nextLine();
        System.out.println("Chose gender 1 for male or 2 for female");
        String c = String.valueOf(scaner.nextLine().charAt(0));
        if (Integer.parseInt(c) == 1) {
            c = "male";
        } else if (Integer.parseInt(c) == 2) {
            c = "female";
        }
        Author author = new Author(authorName, authorSurname, authorEmail, c);
        authorStorage.add(author);
        System.out.println("Author creted");
        return author;
    }


}
