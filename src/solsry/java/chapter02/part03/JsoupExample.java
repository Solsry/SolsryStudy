package solsry.java.chapter02.part03;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupExample {
    public static void main(String[] args) {
        String url = "https://sum.su.or.kr:8888/bible/today";
        // 예외 처리
        try {
            Document document = Jsoup.connect(url).get();

            int a = 6;
            Element bibleText = document.getElementById("bible_text");
            Element bibleinfoBox = document.getElementById("bibleinfo_box");

            System.out.println("bibleText = " + bibleText.text());
            System.out.println("bibleinfoBox = " + bibleinfoBox.text());
            System.out.println("a = " + a);

            Elements num = document.select(".num");
            Elements info = document.select(".info");

            for (int i = 0; i < num.size(); i++) {
                System.out.println(num.get(i).text()+" : " + info.get(i).text());
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
