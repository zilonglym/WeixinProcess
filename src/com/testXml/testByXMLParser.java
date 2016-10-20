package com.testXml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class testByXMLParser {

	public static void main(String[] args) {
		XMLParser parser = new XMLParser();
		
		List<File> listfile = new ArrayList<File>();
		File PortfolioAPT = new File("F:\\workfiles\\EclipseWorkSpace\\Geekxueyuan\\XSDTest\\merge2mdt\\PortfolioAPT_1201.xsd");
        File MorningstarData = new File("F:\\workfiles\\EclipseWorkSpace\\Geekxueyuan\\XSDTest\\merge2mdt\\_MorningstarDataType.xsd");
        listfile.add(MorningstarData);
        listfile.add(PortfolioAPT);
		
		
		File file = new File("F:\\workfiles\\EclipseWorkSpace\\Geekxueyuan\\XSDTest\\apt.xml");
		InputStream is;
		try {
			is = new FileInputStream(file);
//			parser.validateWithSingleSchema(file, PortfolioAPT);
			parser.validateWithSingleSchema(file, MorningstarData);
//			parser.validateWithMultiSchemas(is, listfile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
