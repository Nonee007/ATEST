package selenium1;

public class ChromeDriver {
	public void test();
	
	System.setProperty("webdriver.chrome.driver","./iqif2/chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.get("https://www.google.com/");
}
