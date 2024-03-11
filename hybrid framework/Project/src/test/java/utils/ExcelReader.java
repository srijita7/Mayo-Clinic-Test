package utils;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;

public class ExcelReader extends Base {
    public String readExcel(String sheetName, int row, int col){
        String data = null;
        String path = excelFilePath();
        try{
            FileInputStream file = new FileInputStream(path);
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheet(sheetName);

            Cell cell = sheet.getRow(row).getCell(col);
            CellType type  = cell.getCellType();
            if(type==CellType.NUMERIC){
                data = String.valueOf(cell.getNumericCellValue());
            }else if(type==CellType.STRING){
                data = cell.getStringCellValue();
            }
            
            workbook.close();
        }catch(Exception e){
            e.getMessage();
        }
        return data;
    }
    
}
