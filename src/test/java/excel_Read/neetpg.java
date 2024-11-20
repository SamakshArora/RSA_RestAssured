package excel_Read;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class neetpg {
	private static final Logger logger = LogManager.getLogger(neetpg.class);

	public static void main(String[] args) throws IOException {

		neetpg t = new neetpg();
	
		

	}

	public String actPrice(int duration) {
		//System.out.println("neet pg "+duration);
		System.setProperty("org.apache.poi.util.POILogger", "org.apache.poi.util.SystemOutLogger");
		String actual = "";
		try {
			FileInputStream file = new FileInputStream("/Users/prepladder/Downloads/Untitled spreadsheet.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(file);

			// Get total sheets in excel file
			int sheets = workbook.getNumberOfSheets();

			// Select specific sheet
			for (int i = 0; i < sheets; i++) {
				if (workbook.getSheetName(i).equalsIgnoreCase("NEET_PG")) {
					XSSFSheet sheet = workbook.getSheetAt(i);

					// Get all the rows of the specific sheet
					Iterator<Row> rows = sheet.iterator(); // Collection of rows

					// Go to first row
					Row firstRow = rows.next();

					// Selecting specific column from first row like Category
					int k = 0;
					int column = 0;

					Iterator<Cell> cells = firstRow.cellIterator(); // Collection of cells
					while (cells.hasNext()) {
						Cell value = cells.next();
						if (value.getStringCellValue().equalsIgnoreCase("Pack Duration")) {

							column = k;
						}
						k++;

					}
					// System.out.println(column);
					int l = 0;
					while (rows.hasNext()) {
						Row r = rows.next();
						Cell packDurationCell = r.getCell(column);

						// Check if the cell is not null and its type
						if (packDurationCell != null && packDurationCell.getCellType() == CellType.NUMERIC) {
							Double packDuration = packDurationCell.getNumericCellValue();
							if (packDuration == duration) {
								Iterator<Cell> cv = r.cellIterator();
								while (cv.hasNext()) {
									Cell c = cv.next();
									if (c.getCellType() == CellType.STRING) {
//										System.out.println(c.getStringCellValue());
										
									} else {
										if (l == 7) {
											actual = NumberToTextConverter.toText(c.getNumericCellValue());
										}
										//System.out.println(NumberToTextConverter.toText(c.getNumericCellValue()));
									}
									l++;
								}
								
							}
						}
						
					}	

				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return actual;

	}
	
	
	public String mrpPrice(int duration) {
	//	System.out.println("neet pg "+duration);
		System.setProperty("org.apache.poi.util.POILogger", "org.apache.poi.util.SystemOutLogger");
		String mrp = "";
		try {
			FileInputStream file = new FileInputStream("/Users/prepladder/Downloads/Untitled spreadsheet.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(file);

			// Get total sheets in excel file
			int sheets = workbook.getNumberOfSheets();

			// Select specific sheet
			for (int i = 0; i < sheets; i++) {
				if (workbook.getSheetName(i).equalsIgnoreCase("NEET_PG")) {
					XSSFSheet sheet = workbook.getSheetAt(i);

					// Get all the rows of the specific sheet
					Iterator<Row> rows = sheet.iterator(); // Collection of rows

					// Go to first row
					Row firstRow = rows.next();

					// Selecting specific column from first row like Category
					int k = 0;
					int column = 0;

					Iterator<Cell> cells = firstRow.cellIterator(); // Collection of cells
					while (cells.hasNext()) {
						Cell value = cells.next();
						if (value.getStringCellValue().equalsIgnoreCase("Pack Duration")) {

							column = k;
						}
						k++;

					}
					// System.out.println(column);
					int l = 0;
					while (rows.hasNext()) {
						Row r = rows.next();
						Cell packDurationCell = r.getCell(column);

						// Check if the cell is not null and its type
						if (packDurationCell != null && packDurationCell.getCellType() == CellType.NUMERIC) {
							Double packDuration = packDurationCell.getNumericCellValue();
							if (packDuration == duration) {
								Iterator<Cell> cv = r.cellIterator();
								while (cv.hasNext()) {
									Cell c = cv.next();
									if (c.getCellType() == CellType.STRING) {
//										System.out.println(c.getStringCellValue());
										
									} else {
										if (l == 8) {
											mrp = NumberToTextConverter.toText(c.getNumericCellValue());
										}
									//	System.out.println(NumberToTextConverter.toText(c.getNumericCellValue()));
									}
									l++;
								}
								
							}
						}
						
					}	

				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return mrp;

	}

}