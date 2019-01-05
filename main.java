import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.util.List;
import java.util.Scanner;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


public class main {
    public static void main(String args[])throws IOException,InterruptedException{
        Scanner sc=new Scanner(System.in);
        String exePath = "E:\\Softwear\\JAVA Library\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        System.out.println("enter destination: ");
        String search=sc.nextLine();
        store_matching sm=new store_matching();
        //sm.matching();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tripadvisor.in/");
        driver.findElement(By.className("typeahead_input")).sendKeys(search);
        driver.findElement(By.xpath("//*[@id=\"SUBMIT_HOTELS\"]")).click();
        data_scrap scrap_Object=new data_scrap();

        Thread.sleep(3000);
        String data=driver.getCurrentUrl();
        System.out.println(data);

        File fp=new File("website.csv");
        FileWriter fw=new FileWriter(fp);
        FileReader fr=new FileReader(fp);
        BufferedReader bfr=new BufferedReader(fr);

       //scrap with jsoup
        Document doc=Jsoup.connect(data).get();
        for(Element row : doc.select(".listing_title a")){
        String  httplink = row.attr("href");
    	 String title = row.text();
   	  System.out.println("hotel name and link  :	"+httplink+"\t\t->\t\t"+title);
   	  fw.append(httplink);
   	  fw.append(",");
   	  fw.append(title);
   	  fw.append("\n");

       }
       System.out.println("data update complete.");
       fw.close();
       driver.close();

       String n;
       while ((n=bfr.readLine())!=null){
            String[] result=n.split(",");
                //System.out.println(result[0]);
                String datascrapData="https://www.tripadvisor.in"+result[0];    //read first row of csv file
                System.out.println(result[1]);

                scrap_Object.scrapMethod(datascrapData);
       }
       bfr.close();
       fr.close();



    }
}
