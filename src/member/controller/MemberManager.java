package member.controller;

import member.model.vo.*;
import java.util.Scanner;

public class MemberManager {

	Member[] marr = new Member[10];
	static int ctn = 0; //회원수 체크용 변수
	Scanner sc = new Scanner(System.in);
	
	public void insertMember() {
		System.out.println("아이디 입력 : ");
		String userId = sc.next();
		System.out.println("패스워드 입력 : ");
		String userPwd = sc.next();
		System.out.println("이름 입력 : ");
		String userName = sc.next();
		System.out.println("나이 입력 : ");
		int age = sc.nextInt();
		System.out.println("성별 입력 : ");
		char gender = sc.next().charAt(0);
		System.out.println("이메일 입력 : ");
		String email = sc.next();
		
		marr[ctn] = new Member(userId, userPwd, userName, age, gender, email);
		ctn++;
	}
	
	public void searchId() {
		System.out.println("검색할 아이디를 입력하세요 : ");
		String userId = sc.next();
		
		for(int i = 0; i < ctn; i++) {
//			marr[i].getUserId();
//			userId.equals(marr[i].getUserId());
			
			if (userId.contentEquals(marr[i].getUserId())) {
				printOne(marr[i]);
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다."); return;
			}
			
		}

	}
	
	public void searchName() {
		System.out.println("검색할 이름을 입력하세요 : ");
		String userName = sc.next();
		
		for(int i = 0; i <ctn; i++) {
			if(userName.contentEquals(marr[i].getUserName())) {
				printOne(marr[i]);
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다.");
			}
		}
	}
	
	public void searchEmail() {
		System.out.println("검색할 이메일을 입력하세요 : ");
		String userEmail = sc.next();
		
	
	}
	
	public void updatePwd() {
		System.out.println("수정할 회원의 아이디를 입력하세요 : ");
		String userId = sc.next();
	}
	
	public void updateName() {
		System.out.println("수정할 회원의 비밀번호를 입력하세요 : ");
		String userPwd = sc.next();
	}
	
	public void updateEmail() {
		System.out.println("수정할 회원의 이메일을 입력하세요 : ");
		String userEmail = sc.next();
	}
	
	public void deleteOne() {
		System.out.println("탈퇴할 회원의 아이디를 입력하세요 : ");
		String userId = sc.next();
	}
	
	public void deleteAll() {
		
	}
	
	public void printAllMember() {
		
	}
	
	public void printOne(Member m) {
		m.getUserId();
		m.getUserPwd();
		m.getUserName();
		m.getAge();
		m.getGender();
		m.getEmail();
	}
	
}
