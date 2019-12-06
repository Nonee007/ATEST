package selenium1;
import org.openqa.selenium.WebDriver;
		public class Webdriver1 {
			@Test
			
			public void launchchrome() {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
	}

		}	