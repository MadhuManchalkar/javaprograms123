package poi_Assignment;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class write
{
	static void disply()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			String s[][]= {{"madhu","neela","pooja"}};
			wb=new XSSFWorkbook();
			sh=wb.createSheet("Sheet12");
			for(int i=0;i<s.length;i++)
			{
				row=sh.createRow(i);
				for(int j=0;j<s[i].length;j++)
				{
					cell=row.createCell(j);
					cell.setCellValue(s[i][j]);
				}
			}
			
			
			fout=new FileOutputStream("F://Student908.xlsx");
			wb.write(fout);
			
			 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
public class Demo2 {

	public static void main(String[] args) {
		write.disply();
	}

}
