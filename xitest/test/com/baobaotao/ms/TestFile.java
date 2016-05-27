package com.baobaotao.ms;

import java.io.File;
/**
 * 
 * @author Administrator
 * 2016年3月5日上午9:38:30
 */
public class TestFile {
	public static void main(String[] args) {
		File file = new File("E:\\xiazai");
		File[] files = file.listFiles();
		for(int i=0;i<files.length;i++){
			if(files[i].isFile()){
				System.out.println(files[i]);
			}
		}
	}
	/**
	 * 
	 * @param str1
	 */
	private void testFile(String str1){
		
	}
}
