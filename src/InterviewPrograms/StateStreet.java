package InterviewPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StateStreet {

	public static void main(String[] args) throws IOException {

		Map<String,String> data = new HashMap<String,String>();

		File src = new File("C:\\Users\\Praveen Sunkara\\Desktop\\New Microsoft Excel Worksheet.xlsx");
		FileInputStream fis =new FileInputStream(src);
		Workbook wb = new XSSFWorkbook(fis);	
		Sheet sheet = wb.getSheetAt(0);

		List<String> list=new ArrayList<String>();
		list.add(1,"ID");
		list.add(2,"StudentName");
		list.add(3,"StudentMarks");
		list.add(4,"StudentGrade");

		for (int j = 1; j <= 4; j++) {
			sheet.getRow(0).createCell(j).setCellValue(list.get(j));
			Iterator it = data.entrySet().iterator();
			
			while (it.hasNext()) {
				Map.Entry pair = (Map.Entry)it.next();
				String key = (String) pair.getKey();

				sheet.getRow(j).createCell(j).setCellValue(key);

				for (int i = 1; i <= sheet.getLastRowNum(); i++) {

					String value = (String) pair.getValue();
					sheet.getRow(i).createCell(i+1).setCellValue(value);
					System.out.println(key+ " = " + value);
				}
				FileOutputStream fout =new FileOutputStream(src);
				wb.write(fout);
				wb.close();
			}


			HashMap<String,String> mp=new HashMap<String,String>();

			for (int i = 1; i <= sheet.getPhysicalNumberOfRows(); i++) {

				String data1 = sheet.getRow(i).getCell(i).getStringCellValue();
				String data2 = sheet.getRow(i).getCell(i+1).getStringCellValue();
				mp.put(data1,data2);

			}

		}

	}
}