package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		
		//읽기 스트림 준비
		
		InputStream in = new FileInputStream("C:\\javaStudy\\MS949.txt"); //주스트림 2진수로 읽어온다
		InputStreamReader isr = new InputStreamReader(in, "MS949");
		BufferedReader br = new BufferedReader(isr);
		
		//쓰기 스트림 준비
		OutputStream out = new FileOutputStream("C:\\javaStudy\\MS949-copy.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out, "MS949");
		BufferedWriter bw = new BufferedWriter(osw);
		
		System.out.println("=================스트림 준비 완료");
		
		while(true) {
			String str = br.readLine();
			
			if(str == null) {
				System.out.println("읽기 끝");
				break;
			}
			
//			System.out.println(str);
			bw.write(str);
			bw.newLine();
		}
		
		System.out.println("프로그램 종료");
		isr.close();
		bw.close();

	}

}
