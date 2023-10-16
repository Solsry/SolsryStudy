package solsry.java.chapter02.model02;

public class BookDTO {
    // 멤버변수, 상태정보, 속성(property)라고 부른다.
    private String title;
    private int price;
    private String company;
    private String author;

    
    public BookDTO() { // default 생성자
    }
    // 생성자 메서드의 중복정의(Overloading)
    public BookDTO(String title, int price, String company, String author) {
        this.title = title;
        this.price = price;
        this.company = company;
        this.author = author;
    }
    // 재정의 (OverRiding) = Object -> toString으로 재정의
    @Override
    public String toString() {
        return "BookDTO{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", company='" + company + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}
