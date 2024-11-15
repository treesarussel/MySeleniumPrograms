package selenium.packkage.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation {
	@DataProvider(name="data1")
	public Object[][] method1()
	{
		return new Object[][] {{11},{14},{21},{345},{1002},{345666},{89000},{20000},{0}};
	}
	@Test(dataProvider="data1")
	public void testcase1(int value)
	{
		int sum=value+100;
		System.out.println(sum);
		
	}

}
