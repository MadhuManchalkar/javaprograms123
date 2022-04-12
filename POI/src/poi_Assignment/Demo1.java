package poi_Assignment;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class ReadOperation
{
	static void display()
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			fin=new FileInputStream("E:\\Student478.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("Sheet1");
			int rownumber=sh.getPhysicalNumberOfRows();
			for(int i=0;i<rownumber;i++)
			{
				row=sh.getRow(i);
				int cellnumber=row.getPhysicalNumberOfCells();
				for(int j=0;j<cellnumber;j++)
				{
					cell=row.getCell(j);
					System.out.println(cell.getStringCellValue()+" ");
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();		
			
		}
		
	}

}

public class Demo1 {

	public static void main(String[] args) {
		ReadOperation.display();
		
	}

}
