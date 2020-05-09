package ExcelImport;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File src=new File("C:\\Users\\Hp\\Desktop\\Software\\ExcelJars\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		//load WorkBook
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//load sheet
		XSSFSheet sh1= wb.getSheetAt(0);
		FileOutputStream fout = new FileOutputStream(src);
		sh1.getRow(0).createCell(4).setCellValue("pass");
		sh1.getRow(1).createCell(4).setCellValue("pass");
		
		wb.write(fout);
		wb.close();
	}

}
