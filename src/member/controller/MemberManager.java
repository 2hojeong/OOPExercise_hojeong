package member.controller;

import member.model.vo.*;
import java.util.Scanner;
import java.util.Set;

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
		
		marr[ctn] = new Member(userId, userPwd, userName, 
								age, gender, email);
		ctn++;
	}
	
	public void searchId() {
		
		System.out.println("검색할 아이디를 입력하세요 : ");
		String userId = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			
			if (userId.equals(marr[i].getUserId())) {
				printOne(marr[i]); return;
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다."); return;
			}
			
		}

	}
	
	public void searchName() {
		
		System.out.println("검색할 이름을 입력하세요 : ");
		String userName = sc.next();
		
		for(int i = 0; i <ctn; i++) {
			if(userName.equals(marr[i].getUserName())) {
				printOne(marr[i]); return;
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다."); return;
			}
		}
	}
	
	public void searchEmail() {
		
		System.out.println("검색할 이메일을 입력하세요 : ");
		String userEmail = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(userEmail.equals(marr[i].getEmail())) {
				printOne(marr[i]); return;
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다."); return;
			}
		}
	}
	
	public void updatePwd() {
		
		System.out.println("수정할 회원의 아이디를 입력하세요 : ");
		String userId = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(userId.equals(marr[i].getUserId())) {
				System.out.println("변경할 비밀번호를 입력하세요 : ");
				String chPwd = sc.next();
				marr[i].setUserPwd(chPwd);
				System.out.println("패스워드 수정이 완료되었습니다."); return;
			} else {
				System.out.println("수정할 회원이 존재하지 않습니다."); return;
			}
		}
	}
	
	public void updateName() {
		
		System.out.println("수정할 회원의 아이디를 입력하세요 : ");
		String userId = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(userId.equals(marr[i].getUserId())) {
				System.out.println("변경할 이름을 입력하세요 : ");
				String chName = sc.next();
				marr[i].setUserName(chName);
				System.out.println("이름 수정이 완료되었습니다."); return;
			} else {
				System.out.println("수정할 회원이 존재하지 않습니다."); return;
			}
		}
	}
	
	public void updateEmail() {
		
		System.out.println("수정할 회원의 아이디를 입력하세요 : ");
		String userId = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(userId.equals(marr[i].getUserId())) {
				System.out.println("변경할 이메일을 입력하세요 : ");
				String chEmail = sc.next();
				marr[i].setEmail(chEmail);
				System.out.println("이메일 수정이 완료되었습니다."); return;
			} else {
				System.out.println("수정할 회원이 존재하지 않습니다."); return;
			}
		}
	}
	
	public void deleteOne() {
		
		System.out.println("탈퇴할 회원의 아이디를 입력하세요 : ");
		String userId = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(userId.equals(marr[i].getUserId())) {
				for(int j = i; j < ctn; j++) {
					Member temp = marr[j];
					marr[j] = marr[j+1];
					marr[j+1] = temp;
				}
			} else {
				System.out.println("삭제할 회원 정보가 존재하지 않습니다."); return;
			}
		}
		ctn--;
		return;
	}
	
	public void deleteAll() {
		
		
		
	}
	
	public void printAllMember() {
		
		for(int i = 0; i < ctn; i++) {
			System.out.print("아이디 : " + marr[i].getUserId());
			System.out.print("패스워드 : " + marr[i].getUserPwd());
			System.out.print("이름 : " + marr[i].getUserName());
			System.out.print("나이 : " + marr[i].getAge());
			System.out.print("성별 : " + marr[i].getGender());
			System.out.print("이메일 : " + marr[i].getEmail());
		}
		
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
