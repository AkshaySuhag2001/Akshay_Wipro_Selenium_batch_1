package sel_day25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.print.PrintOptions;

public class print_page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
        PrintOptions printOptions = new PrintOptions();
        printOptions.setOrientation(PrintOptions.Orientation.PORTRAIT);
        PrintOptions.Orientation current_orientation = printOptions.getOrientation();
        System.out.println(current_orientation);
        
        printOptions.setPageRanges("1-2");
        String[] current_range = printOptions.getPageRanges();
        System.out.println(current_range.toString());

	}

}
