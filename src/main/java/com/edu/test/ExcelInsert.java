package com.edu.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.edu.MySpringBootApplication;
import com.edu.domain.Population;
import com.edu.domain.TestUser;
import com.edu.repository.PopulationDAO;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MySpringBootApplication.class)
public class ExcelInsert {

	@Autowired
	public PopulationDAO populationDAO;



	@Test
	public void excelAdd() throws IOException {
		String fileName = "E:\\Java_work\\2020-a.xls";
		FileInputStream fis = new FileInputStream(fileName);
		try (HSSFWorkbook wb = new HSSFWorkbook(fis)) {
			System.out.println("Data dump:\n");
			// 如果有多个表格的话：int k = 0; k < wb.getNumberOfSheets(); k++
			HSSFSheet sheet = wb.getSheetAt(0);
			int rows = sheet.getPhysicalNumberOfRows();
			System.out.println(rows + " row(s).");
			for (int r = 10; r < 1974; r++) {// rows
				String str[] = new String[28];
				// DecimalFormat df = new DecimalFormat("0");
				HSSFRow row = sheet.getRow(r);
				if (row == null) {
					continue;
				}

				for (int c = 7; c < 30; c++) {
					HSSFCell cell = row.getCell(c);
					String value = null;
					if (cell != null) {
						switch (cell.getCellType()) {

						case FORMULA:
							value = cell.getCellFormula();
							break;

						case NUMERIC:
							value = new DecimalFormat("#").format(cell.getNumericCellValue());
							break;

						case STRING:
							value = cell.getStringCellValue();
							break;

						default:
							value = "UNKNOWN value of type " + cell.getCellType();
						}
						str[c - 7] = value;
					}
				}

				Population p = new Population(Integer.valueOf(str[0]), str[1], str[2], Long.valueOf(str[3]),
						Long.valueOf(str[4]), Long.valueOf(str[5]), Long.valueOf(str[6]), Long.valueOf(str[7]),
						Long.valueOf(str[8]), Long.valueOf(str[9]), Long.valueOf(str[10]), Long.valueOf(str[11]),
						Long.valueOf(str[12]), Long.valueOf(str[13]), Long.valueOf(str[14]), Long.valueOf(str[15]),
						Long.valueOf(str[16]), Long.valueOf(str[17]), Long.valueOf(str[18]), Long.valueOf(str[19]),
						Long.valueOf(str[20]), Long.valueOf(str[21]), Long.valueOf(str[22]));
				List<Population> list = new ArrayList<Population>();
				list.add(p);
				populationDAO.saveAll(list);

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
