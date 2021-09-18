import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class MovieLinks {
    public static String getImdb(String a) {

        try {
            Document document = Jsoup.connect("https://www.imdb.com/find?q="+a).get();
            Element element=document.select("td.result_text").first();
            Elements b= element.getElementsByAttribute("href");
            String c=String.valueOf(b);
            c=c.substring(16,25);
            return c;
        } catch (IOException e){
            e.printStackTrace();
        }

        return a;
    }
    public static void openLinkMovie(String a){
        String b=getImdb(a);
        try
        {
            Desktop desk=Desktop.getDesktop();
            desk.browse(new URI("https://www.2embed.ru/embed/imdb/movie?id="+b));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
    public static void openLinkSeries(String a,String season,String episode){
        String name=getImdb(a);

        try
        {
            Desktop desk=Desktop.getDesktop();
            desk.browse(new URI( "https://www.2embed.ru/embed/imdb/tv?id="+name+"&s="+season+"&e="+episode));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }





    public static void main(String[] args) {

    }

}
