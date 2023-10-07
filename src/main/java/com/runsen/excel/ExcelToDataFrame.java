package com.runsen.excel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.collections4.map.HashedMap;
import org.apache.commons.collections4.CollectionUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExcelToDataFrame {
    public static void main(String[] args) {
        try {
            // 1. 读取Excel文件
            System.out.println();
            FileInputStream excelFile = new FileInputStream(new File("demo.xlsx"));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet sheet = workbook.getSheetAt(0); // 假设是第一个工作表

            // 2. 创建数据框
            List<Map<String, String>> dataFrame = new ArrayList<>();

            // 3.txt. 从Excel读取数据并转换为数据框格式
            for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
                Row row = sheet.getRow(rowIndex); // 获取当前行

                Map<String, String> rowMap = new HashedMap<>();

                for (Cell cell : row) {
                    String columnName = sheet.getRow(0).getCell(cell.getColumnIndex()).getStringCellValue();
                    String cellValue = getCellValueAsString(cell);
                    rowMap.put(columnName, cellValue);
                }

                dataFrame.add(rowMap);
            }
            // 4. 数据筛选示例：筛选年龄大于等于30的记录
            List<Map<String, String>> filteredDataFrame = new ArrayList<>();
            for (Map<String, String> row : dataFrame) {
                double age = Double.parseDouble(row.get("Age"));
                if (age >= 30) {
                    filteredDataFrame.add(row);
                }
            }

            // 5. 打印筛选后的数据框
            for (Map<String, String> row : filteredDataFrame) {
                System.out.println(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 辅助方法：将单元格值转换为字符串
    private static String getCellValueAsString(Cell cell) {
        if (cell == null) {
            return "";
        }

        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    return cell.getDateCellValue().toString();
                }
                return Double.toString(cell.getNumericCellValue());
            case BOOLEAN:
                return Boolean.toString(cell.getBooleanCellValue());
            default:
                return "";
        }
    }
}
