package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	
	public Piece(Board board) {
		//posicao da peca criada e null pq nao foi colocada no board ainda
		this.board = board;
		position =  null;
	}

	// only the boardlayer package and subclasses can access the method -  internal use 
	protected Board getBoard() {
		return board;
	}


	
	
	
	

}
