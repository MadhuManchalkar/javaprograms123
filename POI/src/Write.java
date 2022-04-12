import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class Write_operation
{
	static void display()
	{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		
		try
		{
			String s[][]= {{"madhu","manchalakar"}};
			wb=new XSSFWorkbook();
			sh=wb.createSheet();
			for(int i=0;i<s.length;i++)
			{
			row=sh.createRow(i);
			for(int j=0;j<s[i].length;j++)
			{
			cell=row.createCell(j);
			cell.setCellValue(s[i][j]);
			
			}
			fout=new FileOutputStream("E:\\Madhura.xlsx");
			wb.write(fout);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
public class Write {

	public static void main(String[] args) {
		Write_operation.display();
		
	}

}
