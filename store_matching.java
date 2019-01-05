import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class store_matching {

    public void matching () throws IOException, InterruptedException {
        String exePath = "E:\\Softwear\\JAVA Library\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);

        //File fp=new File("food.txt");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.powerthesaurus.org/");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/form/div/div/input")).sendKeys("facilities");//facilities,location,food
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/form/button")).click();
        Thread.sleep(2000);
        String url = driver.getCurrentUrl();
        String currenturl=url;
        int count=2;
        for(int i=0;i<4;i++){
            jsoup(url);
            url=currenturl+"/"+count;
            count++;

        }
        driver.close();
    }
public void jsoup(String url) throws IOException {
    FileWriter fw=new FileWriter("facilities.txt",true);
    BufferedWriter bw=new BufferedWriter(fw);


        Document doc= Jsoup.connect(url).get();
        for(Element row : doc.select(".pt-thesaurus-card__term")) {
            //String httplink = row.attr("href");
            String title = row.text();
            System.out.println(title);
            bw.append(title);
            bw.append("\n");

        }
        bw.close();
    }

}
