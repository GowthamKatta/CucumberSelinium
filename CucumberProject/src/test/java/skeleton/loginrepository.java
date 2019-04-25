package skeleton;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginrepository {
	
	@FindBy(how=How.ID,using="userName")
	public static WebElement username;
	@FindBy(how=How.ID,using="password")
	public static WebElement password;
	@FindBy(how=How.CSS,using="input[type='submit']")
	public static WebElement click;
	@FindBy(how=How.CSS,using="button[type='button']")
	public static WebElement clickaddproduct;
	
	  @FindBy(how=How.ID,using="categorydropid") 
	  public static WebElement  clickaddcategory;
	  
	  @FindBy(how=How.ID,using="subcategorydropid")
	  public static WebElement clicksubcategory;
	  
	  @FindBy(how=How.ID,using="priceid")
	  public static WebElement enterprice;
	  
	  @FindBy(how=How.ID,using="quantityid")
	  public static WebElement  enternoquantity;
	  
	  @FindBy(how=How.ID,using="brandid")
	  public static WebElement enterbrandname;
	  
	  @FindBy(how=How.ID,using="description")
	  public static WebElement  enterdescription;
	  
	  @FindBy(how=How.CSS,using="input[type='submit']")
	  public static WebElement  Addproduct;
	 
	
	
	//@FindBy(how=How.CSS,using="button[type='button']")
	//public static WebElement clickaddcatagory;
	//@FindBy(how=How.ID,using="catgName")
	//public static WebElement addname;
	//@FindBy(how=How.CLASS_NAME,using="catgDesc")
	//public static WebElement adddescription;
	//@FindBy(how=How.CSS,using="input[type='submit']")
	//public static WebElement adding;


}
