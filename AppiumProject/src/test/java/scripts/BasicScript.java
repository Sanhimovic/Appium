package scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BasicScript {

	@Test
	public void basicTestScript() throws MalformedURLException, InterruptedException {
		
		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("SandeepDevice");
		options.setApp("C:\\Users\\QSPR\\Downloads\\ApiDemos-debug.apk");
	
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		Thread.sleep(2000);
		driver.quit();
	}
}