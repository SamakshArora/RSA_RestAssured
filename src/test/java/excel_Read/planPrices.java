package excel_Read;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class planPrices {
	private static final Logger logger = LogManager.getLogger(planPrices.class);

	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.poi.util.POILogger", "org.apache.poi.util.SystemOutLogger");

		FileInputStream file = new FileInputStream("/Users/prepladder/Downloads/TT 11_07_24 (2).xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);

		// Get All sheets that excel have and go to specific sheet in excel
		int totalSheets = workbook.getNumberOfSheets();
		for (int i = 0; i < totalSheets; i++) {

			if (workbook.getSheetName(i).equalsIgnoreCase("11.7.24 NEET PG")) {
				XSSFSheet sheet = workbook.getSheetAt(i);

				int currentPriceIndex = 0;
				int increasePriceIndex = 0;
//		
//		// Identify specific column in specific sheet
//		
//		
//		// Get all the rows
				Iterator<Row> row = sheet.iterator(); // collection of rows
//		
//		// Get to first row
				Row firstRow = row.next();
//		
//		// get all column of first row
				Iterator<Cell> cell = firstRow.cellIterator(); // collection of column
//		
				int k = 0;
//		int column=0;
//	
//		// Go to specific column in sheet. In current we go to Category.
				while (cell.hasNext()) {
					Cell value = cell.next();
					if (value.getStringCellValue().equalsIgnoreCase("Current Price")) {
						currentPriceIndex = k;
					}
					if (value.getStringCellValue().equalsIgnoreCase("Price Increase")) {
						increasePriceIndex = k;
					}
					k++;

				}

				int startNeet = 2;
				int endNeet = 10;
				int startFMGE = -1;
				int endFMGE = 10;

				int l = 0;
//				while (row.hasNext()) {
//					Row values = row.next();
//					System.out.println(values.getCell(0).getStringCellValue());
//					String rowValue = values.getCell(0).getStringCellValue();
//					if (rowValue.equalsIgnoreCase("FMGE Elite Plan")) {
//						startFMGE = l;
//					}
//					if (startFMGE > -1 && !rowValue.trim().isBlank()) {
//						endFMGE = l;
////						break;
//					}
//				
//
//				}
				l++;
				
				for(int mm=0;mm<sheet.getLastRowNum();mm++) {
					String rowValue = sheet.getRow(mm).getCell(0).getStringCellValue();
					System.out.println(rowValue);
					if (startFMGE > -1 && !rowValue.trim().isBlank()) {
						endFMGE = mm;
						break;
					}
					if (rowValue.equalsIgnoreCase("FMGE Elite Plan")) {
						startFMGE = mm;
						System.out.println("mm_"+mm);
					}
				
					
				}
				
				
				
				System.out.println("Count of" + startFMGE + " " + endFMGE);
				for (int nn = startFMGE; nn < endFMGE; nn++) {
					double currentPrice = 0;
					double increasePrice = 0;
					currentPrice = sheet.getRow(nn).getCell(currentPriceIndex).getNumericCellValue();
					increasePrice = sheet.getRow(nn).getCell(increasePriceIndex).getNumericCellValue();

					System.out.println(currentPrice + increasePrice);
				}
//		System.out.println(column);

				// Go to specific Row in sheet. In current we go to FMGE Elite Plan .

			}

		}
	}
}