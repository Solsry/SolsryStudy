package solsry.java.chapter01.part01;

public class BookTest {
    public static void main(String[] args) {
        // 객체 생성
        Book b = new Book();
        b.title="java";
        b.isbn="1111";
        b.page=333;
        b.company="Solsry's Company";
        b.author=333;
        b.price=30000;


        System.out.println("title = " + b.title + "\n" + "company = " + b.company + "\n" + "page = " +b.page);
    }
}
