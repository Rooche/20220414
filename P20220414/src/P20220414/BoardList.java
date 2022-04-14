package P20220414;

public class BoardList {
	private Board[] boards;

	// 배열크기 초기화
	public void init(int size) {
		boards = new Board[size]; // 초기값은 null
	}

	// 배열에 한건 입력
	public void addBoard(Board board) { // 클래스도 받아올수있음
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] == null) {
				boards[i] = board;
				break;
			}
		}
	}

	// 수정 : 게시글번호로 한건을 찾아와서 내용, 제목만 바꾸도록 하겠습니다
	public void modifyBoard(Board board) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i].getBoardNo() == board.getBoardNo()) { // 지금 바꾸려고하는 보드넘버가 같은지를 비교한다
				boards[i].setContent(board.getContent());
				boards[i].setTitle(board.getTitle());
				break;
			}
		}
	}

	// 삭제 : 게시글번호만 있으면 삭제되게
	public void removeBoard(int bNo) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i].getBoardNo() == bNo) {
				boards[i] = null; // 문자(숫자)가 들어간 배열에 null값을 넣어 글을 삭제함
				break;
			}
		}
	}

	public Board searchBoard(int bNo) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i].getBoardNo() == bNo) {
				int currentCnt = boards[i].getSearchCnt();
				boards[i].setSearchCnt(currentCnt + 1);
				return boards[i];
			}
		}
		return null;
	}

	// 게시글 목록
	public Board[] boardList() {
		return boards;
	}
}
