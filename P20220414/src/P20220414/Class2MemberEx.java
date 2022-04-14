package P20220414;

import java.util.Scanner;

public class Class2MemberEx {
	public static void main(String[] args) {
		Member m1 = new Member("user1", "사용자1", "010-2343-4534", 20);
		// m1.memberAge = 25;
		m1.setMemberAge(-25);
		m1.setMemberId("user01");
//		System.out.println("아이디 : " + m1.getMemberId());
//		System.out.println("나이는 " + m1.getMemberAge());
//		m1.showInfo();

		Scanner sc = new Scanner(System.in);
		Member[] members = new Member[3];

		// 사용자가 값을 입력하는 부분
		for (int i = 0; i < members.length; i++) {
			System.out.println("아이디 이름 연락처 나이");
			String id = sc.next();
			String name = sc.next();
			String phone = sc.next();
			String strAge = sc.next();
			int age = Integer.parseInt(strAge); // 문자열을 숫자로 바꿔주기위해서 쓰는 Integer.parseInt
			Member newMember = new Member(id, name, phone, age);

			members[i] = newMember;
		}

		// 1. 조회(이름) 2.변경(아이디, 연락처) 3. 조회(나이가 큰 회원만) 4.종료
		while (true) {
			System.out.println("1.조회(이름) 2.변경(아이디, 연락처) 3.조회(나이가 큰 회원만) 4.종료");
			System.out.print("선택 >>");
			int menu = sc.nextInt();// Integer.parseInt(sc.next());
			sc.nextLine();

			if (menu == 1) {
				System.out.println("조회 할 이름?");
				String sName = sc.nextLine();
				for (Member member : members) {
					if (member.getMemberName().equals(sName)) {
						member.showInfo();
					}
				}

			} else if (menu == 2) {
				System.out.println("아이디 변경");
				String sId = sc.nextLine();
				System.out.println("연락처 변경");
				String sPhone = sc.nextLine();

				for (Member member : members) {
					if (member.getMemberPhone().equals(sPhone)) {
						member.setMemberPhone(sPhone);
						break;
					}
				}

			} else if (menu == 3) {
				System.out.println("나이 입력 ");
				int sAge = sc.nextInt();
				for(Member member : members) {
					if(member.getMemberAge() > sAge) {
						member.showInfo();
					}
				}

			} else if (menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				for (Member member : members) {
					member.showInfo();
				}
			}

			System.out.println("프로그램 종료");
		}
	}

}
