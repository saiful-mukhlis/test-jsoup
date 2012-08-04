import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Test {
	public static void main(String[] args) {
		Document doc;
		try {
			doc = Jsoup.connect("http://jsoup.org").get();

			Element link = doc.select("a").first();
			String relHref = link.attr("href"); // == "/"
			String absHref = link.attr("abs:href"); // "http://jsoup.org/"
			System.out.println(absHref);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
