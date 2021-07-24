package frames8amclass;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample {
	
	

	public static void main(String[] args) throws IOException  {
		
		File file  =new File("C:\\Users\\Hp\\eclipse-workspace\\frames8amclass\\Findingdatas\\ex.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet("Datas");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
				if (cellType==1) {
					cell.getStringCellValue();
					System.out.println(cell);
				}
				if (cellType==0) {
					if (DateUtil.isCellDateFormatted(cell)) {
					Date date = cell.getDateCellValue();
	SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MMM-yy");
					
					String format = DateFormat.format(date);
					System.out.println(format);
					}
					
					
					
				}
				
				
				
				}
				
				
				
				
			}
			
			}
			
			
			
		}
	


