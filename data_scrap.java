import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.util.regex.Pattern;

public class data_scrap{

    public void scrapMethod(String url)throws IOException,InterruptedException {

        String exePath = "E:\\Softwear\\JAVA Library\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(2000);
        boolean x,y,z;



        if(x=driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[2]/div/div[2]/div/div[1]/label")).isSelected()==false || (y=driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[2]/div/div[2]/div/div[1]")).isSelected()==false)) {
            try {
                WebElement oCheckBox11 = driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[2]/div/div[2]/div/div[1]"));
                oCheckBox11.click();
            }
            catch(Exception e){
                WebElement oCheckBox11 = driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[2]/div/div[2]/div/div[1]/label"));
                oCheckBox11.click();
            }

        }
        Thread.sleep(5000);

        String excellent1 = driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[1]/span[2]")).getText();
        String verygood1 = driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/span[2]")).getText();
        String average1 = driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[3]/span[2]")).getText();
        String poor1 = driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[4]/span[2]")).getText();
        String terrible1 = driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[5]/span[2]")).getText();

        System.out.println(excellent1);
        System.out.println(verygood1);
        System.out.println(average1);
        System.out.println(poor1);
        System.out.println(terrible1);
        System.out.println("\n");
        boolean x1,y1;
        if(x1=driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[2]/div/div[2]/div/div[1]")).isSelected()==false || (x1=driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[2]/div/div[2]/div/div[1]/label")).isSelected()==false)) {
            WebElement oCheckBox111 = driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[2]/div/div[2]/div/div[1]"));
            oCheckBox111.click();
        }
        Thread.sleep(5000);


        WebElement oCheckBox2 = driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[2]/div/div[2]/div/div[2]/label"));
        oCheckBox2.click();
        Thread.sleep(5000);

        String excellent2 = driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[1]/span[2]")).getText();
        String verygood2 = driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/span[2]")).getText();
        String average2 = driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[3]/span[2]")).getText();
        String poor2 = driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[4]/span[2]")).getText();
        String terrible2 = driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[5]/span[2]")).getText();

        System.out.println(excellent2);
        System.out.println(verygood2);
        System.out.println(average2);
        System.out.println(poor2);
        System.out.println(terrible2);
        System.out.println("\n");

        boolean x2,y2;
        if(x2=driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[2]/div/div[2]/div/div[2]/label")).isSelected()==false || (x2=driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[2]/div/div[2]/div/div[2]")).isSelected()==false)) {
            WebElement oCheckBox22 = driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[2]/div/div[2]/div/div[2]/label"));
            oCheckBox22.click();
        }
        Thread.sleep(5000);

        WebElement oCheckBox3 = driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[2]/div/div[2]/div/div[3]/label"));
        oCheckBox3.click();
        Thread.sleep(5000);

        String excellent3 = driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[1]/span[2]")).getText();
        String verygood3 = driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/span[2]")).getText();
        String average3 = driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[3]/span[2]")).getText();
        String poor3 = driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[4]/span[2]")).getText();
        String terrible3 = driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[5]/span[2]")).getText();

        System.out.println(excellent3);
        System.out.println(verygood3);
        System.out.println(average3);
        System.out.println(poor3);
        System.out.println(terrible3);
        System.out.println("\n");

        boolean x3,y3;
        if(x3=driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[2]/div/div[2]/div/div[3]/label")).isSelected()==false || (x3=driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[2]/div/div[2]/div/div[3]")).isSelected()==false)) {
            WebElement oCheckBox33 = driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[2]/div/div[2]/div/div[3]/label"));
            oCheckBox33.click();
        }
        Thread.sleep(5000);

        WebElement oCheckBox4 = driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[2]/div/div[2]/div/div[4]/label"));
        oCheckBox4.click();
        Thread.sleep(1000);

        String excellent4;
        String verygood4;
        String average4;
        String poor4;
        String terrible4;
        try {
             excellent4 = driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[1]/span[2]")).getText();
             verygood4 = driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/span[2]")).getText();
             average4 = driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[3]/span[2]")).getText();
             poor4 = driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[4]/span[2]")).getText();
             terrible4 = driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[5]/span[2]")).getText();
        }
        catch (Exception e){
             excellent4 = driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[1]/span[2]")).getText();
             verygood4 = driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/span[2]")).getText();

             average4 = driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[3]/span[2]")).getText();
             poor4 = driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[4]/span[2]")).getText();
             terrible4 = driver.findElement(By.xpath("//*[@id=\"taplc_detail_filters_hr_resp_0\"]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[5]/span[2]")).getText();

        }
        System.out.println(excellent4);
        System.out.println(verygood4);
        System.out.println(average4);
        System.out.println(poor4);
        System.out.println(terrible4);
        System.out.println("\n");

        driver.close();
    }

}
