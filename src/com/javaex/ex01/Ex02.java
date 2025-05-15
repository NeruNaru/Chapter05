package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		// 스트림 준비
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\buffimg.jpg");
		System.out.println("스트림 준비 완료");
		
		byte[] buff = new byte[1024];
		
		while(true) {
//			int data = in.read();
			int data = in.read(buff);
			System.out.println(data);
			
			if(data == -1) {
				System.out.println("읽기 끝(-1)");
				break;
			}
			
			out.write(buff);
		}
		
		System.out.println("프로그램종료");
		
		
		in.close();
		out.close();
	}

}
