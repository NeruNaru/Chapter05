package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ex04 {

	public static void main(String[] args) throws IOException {
		//Phone08.txt 파일을 한줄씩 읽는다	=> 출력해본다
		//hint MS949 방식으로 저장되어 있음
		
		//이효리,010-2222-3333 을","로 구분한다 => 배열

		
		//반복
		//===>리스트에 정리
		
		
		//for문으로 출력
		//문제에 있는 형식으로 출력한다
		
		
		//스트림 준비
		InputStream in = new FileInputStream("C:\\javaStudy\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(in, "UTF-8");
		ArrayList<Person> pList = new ArrayList<Person>();
		//보조 스트림
		BufferedReader br = new BufferedReader(isr);
		//출력
		System.out.println("스트림 준비 완료");
		
		while(true) {
			String str = br.readLine();
			
			if(str == null) {
				System.out.println("읽기 끝");
				break;
			}
		}
		//스트림 닫기
		isr.close();
		br.close();
	}

}
