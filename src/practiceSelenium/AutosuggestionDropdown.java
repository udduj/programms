package practiceSelenium;



public class AutosuggestionDropdown {
	
	
	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub



		
		WebDriver driver =new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("autosuggest")).sendKeys("ind");

		Thread.sleep(3000);

		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));


		for(WebElement option :options)

		{

		if(option.getText().equalsIgnoreCase("India"))

		{

		option.click();

		break;


		}

		}

















		}



}
