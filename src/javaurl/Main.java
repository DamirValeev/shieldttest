package javaurl;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    private static void writeToFile(String str) {
        System.out.print(str);
        try {
            BufferedWriter fileOutput = new BufferedWriter(new FileWriter("htmlPage.html"));
            if(fileOutput != null) {
                fileOutput.write(str);
                fileOutput.close();
            }
        } catch (IOException e) {
            System.err.println("Exp: " + e);
            e.printStackTrace();
        }
    }

    private static Document initialization(String sUrl) {
        try {
            Document htmlDoc = Jsoup.connect(sUrl).get();
            writeToFile(htmlDoc.html());
            return htmlDoc;
        } catch (IOException e) {
            System.err.println("Exp: " + e);
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Document html[] = new Document[5];
        double midlArifmetic = 0;
        html[0] = initialization("http://www.cbr.ru/currency_base/daily.aspx?date_req=05.04.2018");
        html[1] = initialization("http://www.cbr.ru/currency_base/daily.aspx?date_req=04.04.2018");
        html[2] = initialization("http://www.cbr.ru/currency_base/daily.aspx?date_req=03.04.2018");
        html[3] = initialization("http://www.cbr.ru/currency_base/daily.aspx?date_req=02.04.2018");
        html[4] = initialization("http://www.cbr.ru/currency_base/daily.aspx?date_req=01.04.2018");
        for (int j = 0; j < html.length; j++) {
            Elements tablesElements = html[j].select("table[class=data]");
            Element tableELement = tablesElements.first();
            Elements rows = tableELement.select("tr");

            for (int i = 1; i < rows.size(); i++) {
                Element row = rows.get(i);
                Elements cols = row.select("td");

                for (Element col : cols) {
                    if (col.text().equals("Польский злотый")) {
                        Element element = col.nextElementSibling();
                        String sPrice = element.text();
                        System.out.println("sPrice:" + sPrice);
                        sPrice = sPrice.replace(",", ".");
                        float fPrice = Float.parseFloat(sPrice);
                        System.out.println("fPrice:" + fPrice);
                        midlArifmetic += fPrice;
                    }
//                    System.out.println("midlArifmetic::" + midlArifmetic);
                }
            }
        }
        midlArifmetic /= html.length;
        System.out.println("Средне арифметическое за неделю: " + midlArifmetic);
    }
}
