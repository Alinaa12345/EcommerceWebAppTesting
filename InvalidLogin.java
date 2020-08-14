import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class InvalidLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.opera.driver", "E:\\pobrane\\operadriver.exe");
		WebDriver driver = new OperaDriver();
		driver.manage().window().maximize();
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).clear();
		driver.findElement(By.name("txtPassword")).sendKeys("Aadmin123");
		driver.findElement(By.cssSelector("input#btnLogin")).click();

	}

}
