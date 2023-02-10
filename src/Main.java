import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Pair[] books = new Pair[3];
        books[0] = new Pair("Евгений Онегин", "Александр Сергеевич Пушкин");
        books[1] = new Pair("Герой нашего времени", "Михаил Юрьевич Лермонтов");
        books[2] = new Pair("Гарри Поттер", "Джоан Роулинг");
        System.out.println(books[0]);
        System.out.println(books[1]);
        System.out.println(Arrays.toString(books));


    }
}