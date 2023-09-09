package com.mycom.word;

import java.util.Scanner;

public class WordManager {
	Scanner s= new Scanner(System.in);
	WordCRUD wordCRUD;
	/*
	 ***영단어 마스터*** 
	***************************
	1. 모든 단어 보기
	2. 수준별 단어 보기
	3. 단어 추가
	4. 단어 수정
	6. 단어 삭제 
	7. 파일 저장
	0. 나가기
	***************************
	=> 원하는 메뉴는?
	*/
	
	WordManager(){
		wordCRUD = new WordCRUD(s);
	}
	
	public int selectMenu() {
		System.out.println("***영단어 마스터***\n"
				+ "	***************************\r\n"
				+ "	1. 모든 단어 보기\r\n"
				+ "	2. 수준별 단어 보기\r\n"
				+ "	3. 단어 추가\r\n"
				+ "	4. 단어 수정\r\n"
				+ "	6. 단어 삭제 \r\n"
				+ "	7. 파일 저장\r\n"
				+ "	0. 나가기\r\n"
				+ "	***************************\r\n"
				+ "	=> 원하는 메뉴는?\r\n");
		
		return s.nextInt();
	}
	
	
	 public void start() { 
		// wordCRUD.loadFile();
		 
		while(true) {
		int menu = selectMenu();
		if(menu == 0) { System.out.println("프로그램 종료! 다음에 만나요~ ");
			
			break;}
		
		if(menu == 4) {
			wordCRUD.addItem();
			}
		else if(menu == 1) { 
			wordCRUD.listAll(); 
				}
		else if(menu == 5) { // update
			wordCRUD.updateItem(); 
				}
		else if(menu == 6) { // delete
			wordCRUD.deleteItem();
			}
		/*else if(menu == 7) { // save data
				wordCRUD.saveFile();
				
		
				
			}*/
		}
	
	}
}
