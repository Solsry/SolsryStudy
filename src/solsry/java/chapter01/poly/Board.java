package solsry.java.chapter01.poly;

public class Board extends Object{ // toString()을 사용할 수 있다.
    private String title;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Board{" +
                "title='" + title + '\'' +
                '}';
    }
}
