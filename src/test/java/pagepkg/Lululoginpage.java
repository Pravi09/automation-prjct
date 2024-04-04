package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Lululoginpage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"header\"]/section/div/div/div[4]/ul/li[3]/a/span/b")
	WebElement login;
	
	@FindBy(id="emailAddress")
	WebElement email;
	
	@FindBy(id="j_password")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"loginForm\"]/div[8]/button")
	WebElement loginbtn;
	
	@FindBy(xpath="/html/body/main/header/section[2]/nav/div/div[1]/div[2]/div/ul/li[5]/a")
	WebElement mobiles;
	
	@FindBy(xpath="//*[@id=\"luluHomeBanner_en\"]/div[1]/div/div[3]/div/a/picture/img")
	WebElement firstimg;
	
	@FindBy(xpath="/html/body/main/section[4]/section[2]/div/div/div/div[2]/div[2]/div/div[3]/div[1]/div/div[3]/div/ul/li/div/div/div[1]/form[1]/div[2]/button")
	WebElement addbtn;
	
	@FindBy(xpath="//*[@id=\"header\"]/section/div/div/div[4]/ul/li[4]/a[2]")
	WebElement cart;
	
	@FindBy(xpath="//*[@id=\"removeAllCartGroupItems\"]")
	WebElement remove;
	
	@FindBy(id="js-site-search-input auto-search")
	WebElement search;
	
	@FindBy(xpath="//*[@id=\"header\"]/section/div/div/div[3]/form/div[1]/span/button[2]")
	WebElement searchbtn;
	
	@FindBy(id="productName614101")
	WebElement product;
	@FindBy(id="profile-dropdown")
	WebElement profiledropdown;
	@FindBy(xpath="//*[@id=\"header\"]/section/div/div/div[4]/ul/li[3]/div/div/ul/li[1]/a")
	WebElement myprofile; 
    @FindBy(id="account.profile.genderLabel")
	WebElement gender;
    @FindBy(xpath="//*[@id=\"updateProfileForm\"]/div[1]/div[2]/div[2]/div/span[1]/select")
    WebElement day;
    @FindBy(xpath="//*[@id=\"updateProfileForm\"]/div[1]/div[2]/div[2]/div/span[2]/select")
    WebElement month;
    @FindBy(xpath="//*[@id=\"updateProfileForm\"]/div[1]/div[2]/div[2]/div/span[3]/select")
    WebElement year;
    @FindBy(xpath="//*[@id=\"header\"]/section/div/div/div[4]/ul/li[3]/div/div/ul/li[9]")
    WebElement signout;
	
	public Lululoginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void login()
	{
		login.click();
	}
	public void setvalues(String em, String pwd)
	{
		email.clear();
		email.sendKeys(em);
		password.clear();
		password.sendKeys(pwd);
	}
	public void loginbtn()
	{
		loginbtn.click();
	}
	public void mobilesclick()
	{
		mobiles.click();
	}
	public void imageclick()
	{
		firstimg.click();
	}
	public void addclick()
	{
		addbtn.click();
	}
	public void cartclick()
	{
		cart.click();
	}
	public void removeall()
	{
		remove.click();
	}
	public void searchbar()
	{
		search.sendKeys("dell laptop");
	}
	public void clicksearchbtn()
	{
	searchbtn.click();	
	}
	public void productclick()
	{
		product.click();
	}
	public void profileclick()
	{
		profiledropdown.click();
	}
	public void myprofileclick()
	{
		myprofile.click();
	}
	public void dropdown()
  {
      gender.click();	
	  Select genderdetails=new Select(gender);
	  genderdetails.selectByVisibleText("Male");
	  
	  day.click();
	  Select daydetails=new Select(day);
	  daydetails.selectByValue("16");
	  
	  month.click();
	  Select monthdetails=new Select(month);
	  monthdetails.selectByValue("6");
	  
	  year.click();
	  Select yeardetails=new Select(year);
	  yeardetails.selectByVisibleText("1998");
	    
	  }
	public void signoutclick()
	{
		signout.click();
	}
	
	

}
