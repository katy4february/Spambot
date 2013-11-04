package Bot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B0t {
  
	public String ID_Name = "soome_apners" ; // user nikname
	public String ID_Pass = "password" ; // pass user 
	public String comen = "name=comment";
	public WebDriver dr ; // web driver
	public WebElement qu ; // web Element
	public WebElement q3 ; // coment
	public WebElement U1 ; // url xpath
	
	public void Run()
	{	
	        // login
	        dr = new FirefoxDriver();
	        dr.get("http://www.stardoll.com/ru/user/?id=226970907");
	        
	        qu = dr.findElement(By.name("user"));
	        qu.sendKeys(this.ID_Name);
	        qu = dr.findElement(By.name("pass"));
	        qu.sendKeys(this.ID_Pass);
	        qu.submit();       
	        dr.get("http://www.stardoll.com/ru/user/?id=226970907");
	}
	
	        // comment last any user
	public void loop(){      
		try {
		for(;;)
	        {
	        U1 = dr.findElement(By.xpath("//div[@id='lastVisitors']/div[2]/div[2]/ul/li[3]/a/span[2]"));
	        U1.click();
	        
	        //q3 = dr.findElement(By.tagName("name=comment"));
	        //if(this.comen == "name=comment")
	        //{
	        //q3.sendKeys("You look great, 5/5! Please, visit my bazaar ;)");
	        //q3.submit();
	        //}
	        
	        U1 = dr.findElement(By.xpath("//div[@id='lastVisitors']/div[2]/div[2]/ul/li[4]/a/span[2]"));
	        U1.click();
	        
	        //q3 = dr.findElement(By.name(this.comen));
	        //if(this.comen == "comment")
	        //q3.sendKeys("Such a beautiful dolly, 5/5!");
	        //q3.submit();
	        
	        U1 = dr.findElement(By.xpath("//div[@id='lastVisitors']/div[2]/div[2]/ul/li[3]/a/span[2]"));
	        U1.click();
	        
	       }
		
	        }catch(Exception e)
	        {
	        	System.out.println(e.getMessage());
	        }
	}
}

