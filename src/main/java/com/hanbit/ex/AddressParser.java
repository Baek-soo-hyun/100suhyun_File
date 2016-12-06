package com.hanbit.ex;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class AddressParser {
	public static void main(String[] args) throws Exception {
		File setup = new File("C:/Setup.log");
		
		String setupLog = FileUtils.readFileToString(setup);
		// "C:/Setup.log" 경로에 있는 파일의 내용을 String으로 불러온다.
		
		File file = new File("C:/hanbit/hanbit.txt");
		//"C:/hanbit/hanbit.txt" 해당 경로에 해당 파일을 생성한다.
		FileUtils.writeStringToFile(file, setupLog);
		//"C:/hanbit/hanbit.txt"해당 경로에 있는 파일의 내용을 setupLog으로 불러온다.
	}

}
