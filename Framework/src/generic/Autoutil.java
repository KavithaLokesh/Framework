
	package generic;

	import java.io.File;
	import java.io.FileInputStream;
	import java.util.Date;
	import java.util.Properties;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;

	public class Autoutil {
	public static String getproperty(String path,String key){
		String V="";
		try{
			Properties p=new Properties();
			p.load(new FileInputStream(path));
			V=p.getProperty(key);
		}
		catch(Exception e){}
		

	return V;
	}
	public static void getphoto(WebDriver driver,String folder,String testname){
		Date d=new Date();
		String s=d.toString();
		String dateTime=s.replaceAll(":","_");
		String path=folder+testname+dateTime+".png";
		TakesScreenshot t=(TakesScreenshot)driver;
		File srcFile = t.getScreenshotAs(OutputType.FILE);
		File destFile=new File(path);
		try{
			FileUtils.copyFile(srcFile, destFile);
		}
		catch(Exception e){}
		
		
		
	}
	}

