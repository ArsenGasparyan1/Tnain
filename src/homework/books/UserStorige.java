package homework.books;

public class UserStorige {


    private Registration[]array = new Registration[10];
    private int size = 0;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void registration(Registration value){
        if (size == array.length){
            Registration[]tmp = new Registration[array.length + 10];
            for (int i = 0; i < size; i++) {
                tmp[i] = array[i];

            }
            array = tmp;
        }
        array[size++] = value;
    }

    public void loguser(String login, String pass) {
        int count = 0;
        for (int i = 0; i < size ; i++) {
            if (array[i].getUsername().equals(login) && array[i].getPassword().equals(pass)){
                System.out.println("user created");
                System.out.println("Welcom " + array[i].getName());
                count++;
            }

        }
        if(count == 0){
            System.out.println("invalid user name or password");

        }
    }
}
