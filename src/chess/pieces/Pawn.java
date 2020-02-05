package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {

	public Pawn(Board board, Color color) {
		super(board, color);
		
	}
	
	@Override
	public boolean[][] possibleMoves(){
		boolean[][] matrix = new boolean[getBoard().getRows()][getBoard().getColumns()];
		// acima
		Position auxPosition = new Position(0, 0);
		//verifica se eh a peca eh da cor branca
		if (getColor() == Color.WHITE) {
			//pega a peca e move uma linha a cima 
			auxPosition.setValues(position.getRow() -1 , position.getColumn());
			//verifica se a posicao existe e se a posicao esta vazia naquela posicao
			if(getBoard().positionExists(auxPosition) && !getBoard().thereIsAPiece(auxPosition)) {
				//diz que a matriz e verdadeira naquela posicao
				matrix[auxPosition.getRow()][auxPosition.getColumn()] = true;
			}
			//pega a peca e move duas linhas a cima 
			auxPosition.setValues(position.getRow() -2 , position.getColumn());
			Position auxPosition2 = new Position(position.getRow() -1, position.getColumn());
			//verifica se a posicao existe e se a posicao esta vazia naquela posicao
			if(getBoard().positionExists(auxPosition) && !getBoard().thereIsAPiece(auxPosition) && getBoard().positionExists(auxPosition2) && !getBoard().thereIsAPiece(auxPosition2)) {
				//diz que a matriz e verdadeira naquela posicao
				matrix[auxPosition.getRow()][auxPosition.getColumn()] = true;
		}
			//pega a peca e move uma linha e uma coluna a cima 
			auxPosition.setValues(position.getRow() -1 , position.getColumn() -1);
			//verifica se a posicao existe e se a posicao esta vazia naquela posicao
			if(getBoard().positionExists(auxPosition) && !getBoard().thereIsAPiece(auxPosition)) {
				//diz que a matriz e verdadeira naquela posicao
				matrix[auxPosition.getRow()][auxPosition.getColumn()] = true;
			}

			//pega a peca e move uma linha a cima 
			auxPosition.setValues(position.getRow() -1 , position.getColumn() +1);
			//verifica se a posicao existe e se a posicao esta vazia naquela posicao
			if(getBoard().positionExists(auxPosition) && !getBoard().thereIsAPiece(auxPosition)) {
				//diz que a matriz e verdadeira naquela posicao
				matrix[auxPosition.getRow()][auxPosition.getColumn()] = true;
			}
			
		}
		else {
			 
		}
		return null;
	}

}
