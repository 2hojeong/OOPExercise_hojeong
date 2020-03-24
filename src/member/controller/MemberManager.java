package member.controller;

import member.model.vo.*;
import java.util.Scanner;
import java.util.Set;

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
		
		marr[ctn] = new Member(userId, userPwd, userName, 
								age, gender, email);
		ctn++;
	}
	
	public void searchId() {
		
		System.out.println("�˻��� ���̵� �Է��ϼ��� : ");
		String userId = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			
			if (userId.equals(marr[i].getUserId())) {
				printOne(marr[i]); return;
			} else {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�."); return;
			}
			
		}

	}
	
	public void searchName() {
		
		System.out.println("�˻��� �̸��� �Է��ϼ��� : ");
		String userName = sc.next();
		
		for(int i = 0; i <ctn; i++) {
			if(userName.equals(marr[i].getUserName())) {
				printOne(marr[i]); return;
			} else {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�."); return;
			}
		}
	}
	
	public void searchEmail() {
		
		System.out.println("�˻��� �̸����� �Է��ϼ��� : ");
		String userEmail = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(userEmail.equals(marr[i].getEmail())) {
				printOne(marr[i]); return;
			} else {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�."); return;
			}
		}
	}
	
	public void updatePwd() {
		
		System.out.println("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String userId = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(userId.equals(marr[i].getUserId())) {
				System.out.println("������ ��й�ȣ�� �Է��ϼ��� : ");
				String chPwd = sc.next();
				marr[i].setUserPwd(chPwd);
				System.out.println("�н����� ������ �Ϸ�Ǿ����ϴ�."); return;
			} else {
				System.out.println("������ ȸ���� �������� �ʽ��ϴ�."); return;
			}
		}
	}
	
	public void updateName() {
		
		System.out.println("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String userId = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(userId.equals(marr[i].getUserId())) {
				System.out.println("������ �̸��� �Է��ϼ��� : ");
				String chName = sc.next();
				marr[i].setUserName(chName);
				System.out.println("�̸� ������ �Ϸ�Ǿ����ϴ�."); return;
			} else {
				System.out.println("������ ȸ���� �������� �ʽ��ϴ�."); return;
			}
		}
	}
	
	public void updateEmail() {
		
		System.out.println("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String userId = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(userId.equals(marr[i].getUserId())) {
				System.out.println("������ �̸����� �Է��ϼ��� : ");
				String chEmail = sc.next();
				marr[i].setEmail(chEmail);
				System.out.println("�̸��� ������ �Ϸ�Ǿ����ϴ�."); return;
			} else {
				System.out.println("������ ȸ���� �������� �ʽ��ϴ�."); return;
			}
		}
	}
	
	public void deleteOne() {
		
		System.out.println("Ż���� ȸ���� ���̵� �Է��ϼ��� : ");
		String userId = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(userId.equals(marr[i].getUserId())) {
				for(int j = i; j < ctn; j++) {
					Member temp = marr[j];
					marr[j] = marr[j+1];
					marr[j+1] = temp;
				}
			} else {
				System.out.println("������ ȸ�� ������ �������� �ʽ��ϴ�."); return;
			}
		}
		ctn--;
		return;
	}
	
	public void deleteAll() {
		
		
		
	}
	
	public void printAllMember() {
		
		for(int i = 0; i < ctn; i++) {
			System.out.print("���̵� : " + marr[i].getUserId());
			System.out.print("�н����� : " + marr[i].getUserPwd());
			System.out.print("�̸� : " + marr[i].getUserName());
			System.out.print("���� : " + marr[i].getAge());
			System.out.print("���� : " + marr[i].getGender());
			System.out.print("�̸��� : " + marr[i].getEmail());
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
