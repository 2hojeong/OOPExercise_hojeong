package member.controller;

import member.model.vo.*;
import java.util.Scanner;

public class MemberManager {

	Member[] marr = new Member[10];
	static int ctn = 0; //ȸ���� üũ�� ����
	Scanner sc = new Scanner(System.in);
	
	public void insertMember() {
		System.out.println("���̵� �Է� : ");
		String userId = sc.next();
		System.out.println("�н����� �Է� : ");
		String userPwd = sc.next();
		System.out.println("�̸� �Է� : ");
		String userName = sc.next();
		System.out.println("���� �Է� : ");
		int age = sc.nextInt();
		System.out.println("���� �Է� : ");
		char gender = sc.next().charAt(0);
		System.out.println("�̸��� �Է� : ");
		String email = sc.next();
		
		marr[ctn] = new Member(userId, userPwd, userName, age, gender, email);
		ctn++;
	}
	
	public void searchId() {
		System.out.println("�˻��� ���̵� �Է��ϼ��� : ");
		String userId = sc.next();
		
		for(int i = 0; i < ctn; i++) {
//			marr[i].getUserId();
//			userId.equals(marr[i].getUserId());
			
			if (userId.contentEquals(marr[i].getUserId())) {
				printOne(marr[i]);
			} else {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�."); return;
			}
			
		}

	}
	
	public void searchName() {
		System.out.println("�˻��� �̸��� �Է��ϼ��� : ");
		String userName = sc.next();
		
		for(int i = 0; i <ctn; i++) {
			if(userName.contentEquals(marr[i].getUserName())) {
				printOne(marr[i]);
			} else {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
			}
		}
	}
	
	public void searchEmail() {
		System.out.println("�˻��� �̸����� �Է��ϼ��� : ");
		String userEmail = sc.next();
		
	
	}
	
	public void updatePwd() {
		System.out.println("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String userId = sc.next();
	}
	
	public void updateName() {
		System.out.println("������ ȸ���� ��й�ȣ�� �Է��ϼ��� : ");
		String userPwd = sc.next();
	}
	
	public void updateEmail() {
		System.out.println("������ ȸ���� �̸����� �Է��ϼ��� : ");
		String userEmail = sc.next();
	}
	
	public void deleteOne() {
		System.out.println("Ż���� ȸ���� ���̵� �Է��ϼ��� : ");
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