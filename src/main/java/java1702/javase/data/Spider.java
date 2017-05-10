package java1702.javase.data;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by 高伟冬 on 2017/5/9.
 * javaSE_2
 * 14:39
 * 星期二
 */

public class Spider {

    private static final String INIT_URL = "http://tj.lianjia.com/ershoufang/rs/";
    private static final String URL = "http://tj.lianjia.com";
    private Element element;

    private Spider(Element element) {
        this.element = element;
    }

    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect(INIT_URL).cookie("lianjia_uuid", "fe547e4f-b83f-49be-9708-5af2d41ebef4").get();
        Elements elements = document.select("div[data-role=ershoufang]").first().select("a[href^=/ershoufang]");
        for (Element element : elements) {
            Thread thread = new Thread((Runnable) new Spider(element));
            thread.start();
        }
    }

//    @Override
    public void run() {
        String areaUrl = element.attr("href");
        try {
            Document areaDocument = Jsoup.connect(URL.concat(areaUrl)).cookie("lianjia_uuid", "fe547e4f-b83f-49be-9708-5af2d41ebef4").get();
            int total = Integer.parseInt(areaDocument.select("h2[class=total fl]").first().child(0).text());
            int pages = (int) Math.ceil(total / 30d);
            for (int i = 0; i < pages; i++) {
                page(areaUrl, i + 1);
                System.out.println(areaUrl.replace("/", "").replace("ershoufang", "") + ", page: " + (i + 1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void page(String areaUrl, int page) {
        String areaName = areaUrl.replace("/", "").replace("ershoufang", "");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data/tj/" + areaName, true))) {
            Document document = Jsoup.connect(URL.concat(areaUrl) + "pg" + page).cookie("lianjia_uuid", "fe547e4f-b83f-49be-9708-5af2d41ebef4").get();
            Elements elements = document.select("li[class=clear]");
            for (Element element : elements) {
                String imageUrl = element.childNode(0).attr("href");
                String id = imageUrl.substring(imageUrl.lastIndexOf("/") + 1, imageUrl.lastIndexOf("."));
                String region = element.select("a[data-el=region]").first().text();
                String totalPrice = element.select("div[class=totalPrice]").first().child(0).text();
                Element houseInfoElement = element.select("div[class=houseInfo]").first();
                String houseInfo = houseInfoElement.childNode(2).toString();
                String unitPrice = element.select("div[class=unitPrice]").first().attr("data-price");
                writer.write(id + "@" + region + "@" + houseInfo + "@" + totalPrice + "@" + unitPrice + "\n");
            }
        } catch (HttpStatusException e) {
            System.out.println("http status code: " + e.getStatusCode());
            page(areaUrl, page);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



