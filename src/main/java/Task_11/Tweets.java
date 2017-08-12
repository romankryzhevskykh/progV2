package Task_11;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;


public class Tweets {

    public static void main(String[] args) throws TwitterException, IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException, JSONException {
        List<Status> tweets = getTweets();
        writeToFile(tweets);
    }

    public static List<Status> getTweets() throws TwitterException, FileNotFoundException {

        //add credential
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setOAuthConsumerKey("x50xiL7IEpKclWaq5xoydWYeU");
        cb.setOAuthConsumerSecret("oAbtv7rho24VaJQbqBbWqw5VZUpACehHDOxxKj6D9BkeURi00U");
        cb.setOAuthAccessToken("2851574961-xqgZCiamPAi8cBF1HPDbwIOuCwoCCybvTEKy6Fn");
        cb.setOAuthAccessTokenSecret("CGgHL5ipmNCyRBUZnCbcsO1gGU3S77tl9ZKRnRKYuaIi7");

        //get name from file
        File file = new File("src/main/java/Task_11/config");

        Scanner scanner1 = new Scanner(file);
        while (scanner1.hasNextLine()) {
            String nick = scanner1.nextLine();

        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        String username = nick;
        List<Status> tweets = twitter.getUserTimeline(username, new Paging(1, 100));

        return tweets;
    }
        return null;
    }

    public static void writeToFile(List<Status> tweets) throws IOException {
        Workbook wb = new HSSFWorkbook();
        Sheet sheet = wb.createSheet("new sheet");

        Row row1 = sheet.createRow(0);
        row1.createCell(0).setCellValue("Published Date");
        row1.createCell(1).setCellValue("Message");

        for (int i = 0; i < tweets.size(); i++) {
            Status tweet = tweets.get(i);
            Row row = sheet.createRow(i + 1);
            row.createCell(0).setCellValue(tweet.getCreatedAt().toString());
            row.createCell(1).setCellValue(tweet.getText());
        }

        FileOutputStream fileOut = new FileOutputStream("src/main/java/Task_11/tweets.xls");
        wb.write(fileOut);
        fileOut.close();
    }
}