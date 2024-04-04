package testpkg;
import java.time.Duration;

import org.testng.annotations.Test;
import basepkg.Baseclass;
import pagepkg.Lululoginpage;
import utilities.Excellutilities;

public class Lulutestclass extends Baseclass{
	
	@Test
	
	public void loginpage()throws Exception
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Lululoginpage ob=new Lululoginpage(driver);
		
		ob.login();
		
		String xl="C:\\Users\\prave\\Downloads\\lulumavenprjct.xlsx";
		String Sheet="sheet1";
		int rowCount =Excellutilities.getRowCount(xl, Sheet);
		
		for(int i=1;i<=rowCount;i++)
		{

            String em=Excellutilities.getcellvalue(xl, Sheet, i,0);
               System.out.println("email---"+em);
            String Pwd=Excellutilities.getcellvalue(xl, Sheet,i,1);
             System.out.println("password---"+Pwd);
             
             ob.setvalues(em, Pwd);
             ob.loginbtn();
             
     
             String expectedurl="https://www.luluhypermarket.in/en-in/groceries-grocery/c/HYGRCR00001";
  			  String actualurl= driver.getCurrentUrl();
  			  
  			  
  			     if(actualurl.equals(expectedurl))
  			     {
  			    	System.out.println("pass");
  			     }else
  			     {
  			    	System.out.println("fail");
  			     }     
		}
		
		
		
		ob.mobilesclick();
		Thread.sleep(4000);
		ob.imageclick();
		Thread.sleep(3000);
		ob.addclick();
		Thread.sleep(2000);
		ob.cartclick();
		Thread.sleep(4000);
		ob.removeall();
		Thread.sleep(5000);
		ob.searchbar();
		ob.clicksearchbtn();
		ob.productclick();
		ob.profileclick();
		Thread.sleep(2000);
		ob.myprofileclick();
		Thread.sleep(3000);
		ob.dropdown();
		ob.profileclick();
		Thread.sleep(1000);
		ob.signoutclick();
		
		
		
		
	}
}
	


