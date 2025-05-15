package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\bufferedimg.jpg");
		
		BufferedInputStream bin = new BufferedInputStream(in);
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		System.out.println("스트림 준비완료");
		
		while(true) {
			int data =bin.read();
			
			if(data == -1) {
			System.out.println("복사끝");
				break;
			}
			
			//out.write(data);	//바보
			bout.write(data);
		}
		
		bin.read();
		
		in.close();
		out.close();
	}

}
