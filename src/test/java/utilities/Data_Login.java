package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class Data_Login {

	@DataProvider(name = "Login")
	public static Object[][] fetchexcel() throws EncryptedDocumentException, IOException
	{
		Object[][] obj = new Object[1][3];
		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\nithi\\Project_By_Dream_Team_Eclipse\\Ds-Algo_Project\\Excel_Data_Sheet\\Ds_Algo_Credentials.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		obj[0][0] = w1.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
		obj[0][1] = w1.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
		obj[0][2] = w1.getSheet("Login").getRow(1).getCell(2).getStringCellValue();
		return obj;
	}

}
