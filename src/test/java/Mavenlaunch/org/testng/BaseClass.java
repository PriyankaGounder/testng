package Mavenlaunch.org.testng;


	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseClass {
		
		public static WebDriver driver;
		
		public static WebDriver loadBrowser() {
			
//			System.setProperty("webdriver.chrome.driver", "E:\\Greens\\TestNG\\Driver\\chromedriver.exe");
			
		 WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			
			return driver;

		}
		
		public static void launchUrl(String url) {
			
			driver.get(url);
					
		}
		
		public static void maxwindow() {
			
			driver.manage().window().maximize();

		}
		
		public static void closeBrowser() {
			
			driver.quit();
					
		}
		public static String pageTitel() {
			
			String title = driver.getTitle();
			return title;

		}
		
		private void add() {
			System.out.println("hi java");

		}

	}



