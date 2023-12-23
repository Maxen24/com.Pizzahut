package AppPage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class ExcelRead {
	WebDriver driver;

	public static final String getURL() {
		String fPath = "C:\\ExcelRead\\ExcelFileURL.xlsx";
		String sName = "Sheet1"; // Change this to your sheet name
		String url=null;
		File file=new File(fPath);
		try {
			FileInputStream inputStream=new FileInputStream(file);
			Workbook workbook=WorkbookFactory.create(inputStream);
			Sheet sheet=workbook.getSheet(sName);
			Row row=sheet.getRow(0);
			Cell cellURL=row.getCell(0);
			String strURL=cellURL.getStringCellValue();
			url=strURL;
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IllegalArgumentException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return url;
	}
}
