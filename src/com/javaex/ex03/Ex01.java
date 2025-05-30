package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		//스트림 준비
		Reader fr = new FileReader("C:\\javaStudy\\MS949.txt");
		
		BufferedReader br = new BufferedReader(fr);
		System.out.println("스트림 준비 완료");
		
		while(true) {
			String str = br.readLine();
			
			if(str == null) {
				System.out.println("===================파일 읽기 끝");
				break;
			}
			
			System.out.println(str);
		}
		
		System.out.println("프로그램 종료");
		
		//스트림 닫기
		br.close();
		
	}

}
