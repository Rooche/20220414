package co.edu.app;

import java.util.InputMismatchException;
import java.util.Scanner;

import P20220414.Board;

public class AccountApp {
	Account[] accounts = new Account[100]; // 계좌정보를 저장하기 위한 배열
	Scanner sc = new Scanner(System.in);
	public static int ex = 0;

	public void execute() {

		while (true) {
			System.out.println("===================================");
			System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
			System.out.println("===================================");
			System.out.println(" 선택 >> ");
			int menu = -1;
			try {
				menu = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("다시 입력해주세요");
			}
			sc.nextLine();

			if (menu == 1) {
				createAccount();

			} else if (menu == 2) {
				accountList();

			} else if (menu == 3) {
				deposit();

			} else if (menu == 4) {
				withdraw();

			} else if (menu == 5) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}
	}

	// 계좌생성시 실행할 메소드
	public void createAccount() {

		System.out.println("========");
		System.out.println("계좌생성.");
		System.out.println("========");

		System.out.println("계좌번호 : ");
		String sAno = sc.nextLine();

		System.out.println("예금주 : ");
		String sOwner = sc.nextLine();

		System.out.println("초기입금액 : ");
		int sBalance = sc.nextInt();
		sc.nextLine();

		//Account neac = new Account(sAno, sOwner, sBalance);
		//for(int = 0; i < accounts
		accounts[ex] = new Account(sAno, sOwner, sBalance);
		ex++;
		System.out.println("계좌가 생성되었습니다.");

	}

	// 계좌목록 실행할 메소드
	public void accountList() {
		System.out.println("=========");
		System.out.println("계좌목록");
		System.out.println("=========");

		for (int i = 0; i < ex; i++) {
			System.out.println("계좌번호: " + accounts[i].getAno() + " 예금주: " + accounts[i].getOwner() + " 잔액: "
					+ accounts[i].getBalance());
		}

	}

	// 예금처리시 실행할 메소드
	public void deposit() {
		System.out.println("=====");
		System.out.println("예금");
		System.out.println("=====");

		System.out.print("계좌번호: ");
		String sAno = sc.nextLine();
		System.out.print("예금 : ");
		int sBalance = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < ex; i++) {
			if (sAno.equals(accounts[i].getAno())) {
				accounts[i].depositBalance(sBalance);
				System.out.println("예금 성공.");
			} else {
				System.out.println("계좌가 존재하지 않습니다.");
				break;
			}
		}

	}

	// 출금할때 실행할 메소드
	public void withdraw() {
		System.out.println("=====");
		System.out.println("출금");
		System.out.println("====-");

		System.out.print("계좌번호: ");
		String ano = sc.nextLine();

		System.out.print("출금액: ");
		int balance = sc.nextInt();

		for (int i = 0; i < ex; i++) {
			if (ano.equals(accounts[i].getAno())) {
				accounts[i].withdrawBalance(balance);
				System.out.println("출금성공.");
			} else {
				System.out.println("계좌가 존재하지 않습니다.");
			}
		}

	}
}
