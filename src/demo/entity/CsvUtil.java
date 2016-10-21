package demo.entity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CsvUtil {

//	public static void main(String[] args) {
//		GetChengji("D:\\Nonework\\001\\2.csv");
//	}
	
	public static Map<String,Map<String,String>> GetChengji(String filePath){
		Map<String,Map<String,String>> map = new HashMap<String,Map<String,String>>();
		
		File file = new File(filePath);
        BufferedReader reader = null;
        try {
            String tempString = null;
            reader = new BufferedReader(new FileReader(file));
            String[] kemu = reader.readLine().split(",");
            //
            while ((tempString = reader.readLine()) != null) {
            	Map<String,String> submap = new HashMap<String,String>();
            	String[] a = tempString.split(",");
            	for (int i = 1; i < a.length; i++) {
            		submap.put(kemu[i], a[i]);
				}
            	map.put(a[0], submap);
            }
            System.out.println(map.size());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                	e1.getMessage();
                }
            }
        }
		
		return map;
	}
	public static String[] GetChengjihangtou(String filePath){
		String[] rtn = null;
		
		File file = new File(filePath);
        BufferedReader reader = null;
        try {
            String tempString = null;
            reader = new BufferedReader(new FileReader(file));
            rtn = reader.readLine().split(",");
            //
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                	e1.getMessage();
                }
            }
        }
		
		return rtn;
	}
}
