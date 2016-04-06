package cpa.qa.testcases;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Hashtable;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import cpa.qa.util.*;


public class PRD {
	Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"\\src\\cpa\\qa\\xls\\PRD.xlsx");

	@Test(dataProvider="getData")
		public void doPRD(Hashtable<String,String> testData) throws Throwable{
		System.out.println("##teamcity[testSuiteStarted name='suite.PRD']");
		
		// run-mode of test
		if(!TestUtil.getRunmode("PRD", xls))
			throw new SkipException("Skipping the entire test as Runmode is N");

		// run-mode of Data set
		if(testData.get("Runmode").equals("N"))
			throw new SkipException("Skipping the test data set as runmode is N");
		
	// execution
		if(testData.get("Runmode").equals("Y")) {
		Keywords k = Keywords.getInstance();//new Keywords();// init OR
		k.executeTest("PRD",xls,testData); 
		
		Xls_Reader xls1 = new Xls_Reader(System.getProperty("user.dir")+"\\src\\cpa\\qa\\xls\\Test Report.xlsx");
		TestUtil.getReport("PRD", xls1);	
		
		System.out.println("##teamcity[testSuiteFinished name='suite.PRD']");
		String filename=System.getProperty("user.dir")+"\\src\\cpa\\qa\\xls\\Test Report.xlsx";
		FileInputStream fs =new FileInputStream(filename);    
	    XSSFWorkbook wb = new XSSFWorkbook(fs);
		
		FileOutputStream fileOut =  new FileOutputStream(filename);
		wb.write(fileOut);
		fileOut.close();
		System.out.println("THE END >>>>>>>>>>>>");
		}
	}
	
	
	@DataProvider
	public Object[][] getData(){
			return 	TestUtil.getData("PRD", xls);
	}

}
