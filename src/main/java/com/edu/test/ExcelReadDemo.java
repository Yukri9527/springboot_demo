package com.edu.test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.edu.domain.Population;

public class ExcelReadDemo {

	private final static String fileName = "E:\\Java_work\\2020-a.xls";

	private static HSSFWorkbook readFile(String filename) throws IOException {
		try (FileInputStream fis = new FileInputStream(filename)) {
			return new HSSFWorkbook(fis);
		}
	}

	public static void main(String[] args) throws IOException {
		try (HSSFWorkbook wb = readFile(fileName)) {
			// 取第一个sheet
			HSSFSheet sheet = wb.getSheetAt(0);
			int rows = sheet.getPhysicalNumberOfRows();
			System.out.println(rows);

			// 取十行看看
			for (int r = 10; r < 20; r++) {
				HSSFRow row = sheet.getRow(r);
				String id = row.getCell(7).getStringCellValue().trim();
				String city = row.getCell(8).getStringCellValue();
				String MP = row.getCell(9).getStringCellValue();
				System.out.println(id + "," + city.replaceAll("\\s| ", "") + "," + MP);
				
				Population p= new Population(Integer.valueOf(id),city,MP, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
				
			}

		}
	}
}
