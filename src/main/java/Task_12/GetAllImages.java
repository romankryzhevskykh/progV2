package Task_12;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class GetAllImages {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("/home/romario/Desktop/progV2/src/main/java/Task_12/config");
        Scanner scanner1 = new Scanner(file);

        while (scanner1.hasNextLine()) {
            String url = scanner1.nextLine();
            String webSiteURL = url;


            try {

                Document doc = Jsoup.connect(webSiteURL).get();

                Elements images = doc.getElementsByTag("img");

                for (Element element : images) {

                    String src = element.absUrl("src");
                    getImages(src);
                }
            } catch (IOException e) {
            }
        }
    }

    private static void getImages(String src) throws IOException {

        int indexname = src.lastIndexOf("/");

        if (indexname == src.length()) {
            src = src.substring(1, indexname);
        }

        indexname = src.lastIndexOf("/");
        String name = src.substring(indexname, src.length());

        System.out.println(name);

        URL url = new URL(src);
        InputStream in = url.openStream();

        String folderPath = "src/main/java/Task_12/imgs";

        OutputStream out = new BufferedOutputStream(new FileOutputStream(folderPath + name));

        for (int b; (b = in.read()) != -1; ) {
            out.write(b);
        }
        out.close();
        in.close();

    }
}