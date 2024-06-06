package TESTRUNNER;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import VMAPS.VMAPS_LOGIN.Baseclass;
import VMAPS_POM.Login;
import VMAPS_POM.Registration;


public class TestRunner extends Baseclass {
	
	Registration r;
	Login l;
	
	String xlpath ="C:\\Users\\Rakesh\\Desktop\\xlpath.xlsx";
    @BeforeClass
    public void fi() throws InterruptedException  {
 	   setproperty();
		Thread.sleep(3000);
 	  
    }
    

	
		@Test()
		public  void fa() throws InterruptedException, IOException {
			r = new Registration(d);
			l = new Login(d);
			Thread.sleep(2000);
			Clk(r.getClk());
			File src = new File(xlpath);

			FileInputStream finput = new FileInputStream(src);

			XSSFWorkbook workbook = new XSSFWorkbook(finput);

			XSSFSheet sheet= workbook.getSheetAt(0);
			Thread.sleep(2000);
			
			
			Cell cell;

			for(int i=1; i<=1; i++)
			     {

			cell = sheet.getRow(i).getCell(0);
			
			String fname =cell.getStringCellValue();
			
			send(r.getfullname(), fname);
			
			//WebElement user = d.findElement(By.id("txt_unam"));
			//user.sendKeys(cell.getStringCellValue());


			cell = sheet.getRow(i).getCell(1);
			
			String mail =cell.getStringCellValue();
			
			send(r.getemail(),mail);
			     
			
			
			
			
cell = sheet.getRow(i).getCell(2);
			
			String mobn =cell.getStringCellValue();
			
			send(r.getMobnum(),mobn);
			     
		
		
		cell = sheet.getRow(i).getCell(3);
		
		String fpass =cell.getStringCellValue();
		
		send(r.getFpass(),fpass);
		     
cell = sheet.getRow(i).getCell(4);

String cpass =cell.getStringCellValue();

send(r.getCpass(),cpass);
     }
			Clk(r.getCheckb());
			Clk(r.getCheck());
			Clk(r.getReg());
			
			Thread.sleep(40000);
		Clk(r.verify());
			Thread.sleep(2000);
			
		
		for(int i=2; i<=2; i++)
	     {

	cell = sheet.getRow(i).getCell(0);
	
	String uname =cell.getStringCellValue();
	
	send(l.getuname(), uname);
	
	//WebElement user = d.findElement(By.id("txt_unam"));
	//user.sendKeys(cell.getStringCellValue());


	cell = sheet.getRow(i).getCell(1);
	
	String passd =cell.getStringCellValue();
	
	send(l.getpass1(),passd);
	     }
		Clk(l.getsigingin());
		Thread.sleep(3000);
		Clk(r.getsingout1());
		Thread.sleep(2000);
		Clk(r.getsigninout2());
		}
		

		@AfterClass()
		public void fin() throws InterruptedException {
			Thread.sleep(15000);
			cls();
		}
			
}