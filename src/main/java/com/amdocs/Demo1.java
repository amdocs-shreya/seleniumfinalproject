package com.amdocs;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1 {
	public static void main(String[]args) throws InterruptedException {
		EdgeDriver dr=new EdgeDriver();
		dr.get("http://www.tutorialspoint.com");
		dr.manage().window().maximize();
		dr.findElement(By.xpath("//*[@id=\"search-strings\"]")).sendKeys("java certificate");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//*[@id=\"btnSearch\"]/i")).click();
		dr.findElement(By.xpath("//*[@id=\"ebook-button-card-10724\"]/a[2]")).click();
		////*[@id="ebook-button-card-10724"]/a[2]
		//dr.findElement(By.xpath("//*[@id=\"cartContent\"]/div/div/a")).click();
		//*[@id="cartContent"]/div/div/a
    	//dr.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/span/a/div/div/div")).click();
	}

}
