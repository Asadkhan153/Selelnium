package ExcelImport;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//specify the file of path
		File src=new File("C:\\Users\\Hp\\Desktop\\Software\\ExcelJars\\TestData.xlsx");
		//load file
		FileInputStream fis=new FileInputStream(src);
		//load WorkBook
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//load sheet
		XSSFSheet sh1= wb.getSheetAt(0);
		
//		System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
//		System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
		
//		System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
//		System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
//		System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());
//		System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
		//		
		int lastrow= sh1.getLastRowNum();
		System.out.println("Number of rwos are"+lastrow);
		for(int i=0; i<lastrow; i++) {
		String data= sh1.getRow(i).getCell(0).getStringCellValue();
		System.out.println("Test data from excel"+i +""+data);
		}
	}

}
