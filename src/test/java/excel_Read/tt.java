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

public class tt {
	private static final Logger logger = LogManager.getLogger(tt.class);

	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.poi.util.POILogger", "org.apache.poi.util.SystemOutLogger");

		FileInputStream file = new FileInputStream("/Users/prepladder/Downloads/TT 11_07_24 (2).xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);

		// Get total sheets in excel file
		int sheets = workbook.getNumberOfSheets();

		// Select specific sheet
		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("11.7.24 NEET PG")) {
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
					if (value.getStringCellValue().equalsIgnoreCase("Category")) {

						column = k;
					}
					k++;

				}
				System.out.println(column);

				while (rows.hasNext()) {
				    Row r = rows.next();
				    Cell categoryCell = r.getCell(column);
				    
				    

				    // Check if the cell is not null and its type
				    if (categoryCell != null && categoryCell.getCellType() == CellType.STRING) {
				        String categoryValue = categoryCell.getStringCellValue();
				        if (categoryValue.equalsIgnoreCase("FMGE Elite Plan")) {
				            Iterator<Cell> cv = r.cellIterator();
				            while (cv.hasNext()) {
				                Cell c = cv.next();
				                if(c.getCellType()==CellType.STRING) {
				                	System.out.println(c.getStringCellValue());
				                	
				                }
				                else {
				                
				                	System.out.println(NumberToTextConverter.toText(c.getNumericCellValue()));
				                }
				                
				                
				                // Check the type of each cell and handle accordingly
//				                switch (cell.getCellType()) {
//				                    case STRING:
//				                        System.out.println(cell.getStringCellValue());
//				                        break;
//				                    case FORMULA: 
//				                        System.out.print(cell.getNumericCellValue()); 
//				                        break;
//				                    case NUMERIC:
//				                        System.out.println(cell.getNumericCellValue());
//				                        break;
//				                    case BOOLEAN:
//				                        System.out.println(cell.getBooleanCellValue());
//				                        break;
//				                  
//				                    default:
//				                        System.out.println(""); // Handle other types as needed
//				                }
				            }
				        }
				    }
				}


			}
		}
	}
}