package testscript;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExecuteLeadTest {
	@Test
	public void ExecuteTest_01() throws Exception	{
		Keywords key = new Keywords();
		ArrayList a = new ArrayList();
		FileInputStream file = new FileInputStream("D:\\ExecuteLeadTest.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(file);
		Sheet sheet = work.getSheet("teststeps");
		Iterator itr = sheet.iterator();
		while (itr.hasNext())	{
			Row rowitr = (Row)itr.next();
			Iterator cellitr = rowitr.cellIterator();
			while (cellitr.hasNext())	{
				Cell celldata = (Cell)cellitr.next();
				switch (celldata.getCellType())	{
				case Cell.CELL_TYPE_STRING:
					a.add(celldata.getStringCellValue());
					break;
				case Cell.CELL_TYPE_NUMERIC:
					a.add(celldata.getNumericCellValue());
					break;
				case Cell.CELL_TYPE_BOOLEAN:
					a.add(celldata.getBooleanCellValue());
					break;
				}
			}
		}
		
		for (int i=0; i<a.size(); i++)	{
			if (a.get(i).equals("Openbrowser"))	{
				String Keyword = (String)a.get(i);
				String Data = (String)a.get(i+1);
				String Objectname = (String)a.get(i+2);
				String Runmode = (String)a.get(i+3);
				System.out.println(Keyword);
				System.out.println(Data);
				System.out.println(Objectname);
				System.out.println(Runmode);
				if (Runmode.equals("Yes"))	{
					key.Openbrowser();
				}
			}
			
			if (a.get(i).equals("Navigate"))	{
				String Keyword = (String)a.get(i);
				String Data = (String)a.get(i+1);
				String Objectname = (String)a.get(i+2);
				String Runmode = (String)a.get(i+3);
				System.out.println(Keyword);
				System.out.println(Data);
				System.out.println(Objectname);
				System.out.println(Runmode);
				if (Runmode.equals("Yes"))	{
					key.Navigate(Data);
				}
			}
			
			if (a.get(i).equals("InputByCss"))	{
				String Keyword = (String)a.get(i);
				String Data = (String)a.get(i+1);
				String Objectname = (String)a.get(i+2);
				String Runmode = (String)a.get(i+3);
				System.out.println(Keyword);
				System.out.println(Data);
				System.out.println(Objectname);
				System.out.println(Runmode);
				if (Runmode.equals("Yes"))	{
					key.InputByCss(Data, Objectname);
				}
			}
			
			if (a.get(i).equals("InputByXpath"))	{
				String Keyword = (String)a.get(i);
				String Data = (String)a.get(i+1);
				String Objectname = (String)a.get(i+2);
				String Runmode = (String)a.get(i+3);
				System.out.println(Keyword);
				System.out.println(Data);
				System.out.println(Objectname);
				System.out.println(Runmode);
				if (Runmode.equals("Yes"))	{
					key.InputByXpath(Data, Objectname);
				}
			}
			
			if (a.get(i).equals("ClickByCss"))	{
				String Keyword = (String)a.get(i);
				String Data = (String)a.get(i+1);
				String Objectname = (String)a.get(i+2);
				String Runmode = (String)a.get(i+3);
				System.out.println(Keyword);
				System.out.println(Data);
				System.out.println(Objectname);
				System.out.println(Runmode);
				if (Runmode.equals("Yes"))	{
					key.ClickByCss(Objectname);
				}
			}
			
			if (a.get(i).equals("Select"))	{
				String Keyword = (String)a.get(i);
				String Data = (String)a.get(i+1);
				String Objectname = (String)a.get(i+2);
				String Runmode = (String)a.get(i+3);
				System.out.println(Keyword);
				System.out.println(Data);
				System.out.println(Objectname);
				System.out.println(Runmode);
				if (Runmode.equals("Yes"))	{
					key.Select(Data, Objectname);
				}
			}
		}
	}

}
