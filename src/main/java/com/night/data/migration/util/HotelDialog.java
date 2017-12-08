package com.night.data.migration.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

/**
 * 
 * @author Reverien9@gmail.com
 * 2017年12月8日 上午10:12:06
 */
public class HotelDialog extends  java.awt.Component{

	private static final long serialVersionUID = 1L;

	@SuppressWarnings({ "rawtypes", "unused" })
	public Map<String, String> open() {
		Map<String, String> map = new HashMap<>();
		JFileChooser chooseFile = new JFileChooser();
//		FileFilter filter = new FileFilter() {  
//		    public boolean accept(File f) {  
//		        if (f.isDirectory()) {  
//		            return true;  
//		        }  
//		        return f.getName().endsWith(".txt") || f.getName().endsWith(".java");  
//		    }  
//		    public String getDescription() {  
//		        return "*.txt,*.java";  
//		    }  
//		};  
		FileFilter filter1 = new FileFilter() {  
		    public boolean accept(File f) {  
		        if (f.isFile()) {  
		            return true;  
		        }  
		        return f.getName().endsWith(".properties");  
		    }  
		    public String getDescription() {  
		        return "*.properties";  
		    }  
		};  
//		chooseFile.addChoosableFileFilter(filter);  
		chooseFile.addChoosableFileFilter(filter1);  
		int open = chooseFile.showOpenDialog(this);
		if (open == JFileChooser.APPROVE_OPTION) {  
			File f = chooseFile.getSelectedFile();  
			Runtime runtime = Runtime.getRuntime();  
			try{  
//				System.out.println(f.getAbsolutePath());  
//				runtime.exec("rundll32 url.dll FileProtocolHandler "+f.getAbsolutePath());
				File file = new File(f.getAbsolutePath());
				Properties prop = new Properties();
				InputStream in = new FileInputStream(file);
				prop.load(in);
				Enumeration en = prop.propertyNames();
				while(en.hasMoreElements()) {
					String strKey = (String) en.nextElement();
					String strValue = prop.getProperty(strKey);
					map.put(strKey, strValue);
					System.setProperty(strKey, strValue);
				}
			}catch(Exception ex){  
				ex.printStackTrace();  
			}
		}
		return map;
	}
	
	public String openReturnString() {
		String path = null;
		JFileChooser chooseFile = new JFileChooser();
		FileFilter filter1 = new FileFilter() {  
		    public boolean accept(File f) {  
		        if (f.isFile()) {  
		            return true;  
		        }  
		        return f.getName().endsWith(".properties");  
		    }  
		    public String getDescription() {  
		        return "*.properties";  
		    }  
		};  
		chooseFile.addChoosableFileFilter(filter1);  
		int open = chooseFile.showOpenDialog(this);
		if (open == JFileChooser.APPROVE_OPTION) {  
			File f = chooseFile.getSelectedFile();
			path = f.getAbsolutePath();
		}
		return path;
	}
	
}
