package P20220414;

import java.util.Scanner;

public class Class4BoardEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// BoardList에 정의해놓은 필드와 메소드를 활용해서 기능
		BoardList boardList = new BoardList();
		boardList.init(5);

		while (true) {
			System.out.println("1.추가 2.수정 3.목록 4.삭제 5.한건조회 9.종료");
			System.out.println("선택 > >");
			int menu = sc.nextInt();
			sc.nextLine();

			if (menu == 1) {
				System.out.print("글 번호 입력 >>");
				int bNo = sc.nextInt();
				sc.nextLine();
				// int bNo = Interger.pareInt(sc.nextLine());
				System.out.println("제목 입력 >>");
				String bTitle = sc.nextLine();
				System.out.println("내용 입력 >>");
				String bContent = sc.nextLine();
				System.out.print("작성자 입력 >>");
				String bWriter = sc.nextLine();
				Board newBod = new Board(bNo, bTitle, bContent, bWriter); // 생성자호출
				// boardList.addBoard(newBod);
				int chk = boardList.addBoard(newBod);
				if (chk == 0) {
					System.out.println("정상입력되었습니다.");
				} else if(chk == -1){
					System.out.println("입력을 못했습니다");
				} else if(chk == 1) {
					System.out.println("이미 있는 번호입니다.");
				}

			} else if (menu == 2) {
				System.out.println("수정할 글번호 입력>>>");
				int bNo = Integer.parseInt(sc.nextLine());
				System.out.println("변경할 제목 입력>>>");
				String title = sc.nextLine();
				System.out.println("변경할 내용 입력>>>");
				String content = sc.nextLine();
				Board cBoard = new Board(bNo, title, content, null);

				if (boardList.modifyBoard(cBoard)) {
					System.out.println("정상수정완료");
				} else {
					System.out.println("변경을 못했습니다");
				}

			} else if (menu == 3) {
				Board[] boards = boardList.boardList();
				System.out.println("게시글번호         제목                   내용      사용자    조회수");
				System.out.println("=============================================================");
				for (Board board : boards) {
					if (board != null) {
						board.getInfo();
					}
				}

			} else if (menu == 4) {
				System.out.println("삭제할 글번호 >>");
				int bNo = Integer.parseInt(sc.nextLine());

				if (boardList.removeBoard(bNo)) {
					System.out.println("삭제가 되었습니다");
				} else {
					System.out.println("삭제가 안됐습니다");
				}

			} else if (menu == 5) {
				System.out.println("조회할 글번호 >>");
				int bNo = Integer.parseInt(sc.nextLine());

				Board getBoard = boardList.searchBoard(bNo);
				if (getBoard == null) {
					System.out.println("조회결과가 없습니다");
				} else {
					getBoard.getDetailInfo(); // 출력을 하겠습니다.
				}

			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;

			} else {
				System.out.println("정확한 메뉴를 선택하세요.");
			}

		}
		System.out.println("프로그램 종료");
	}
}
