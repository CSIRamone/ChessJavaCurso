package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece {
	
	public Bishop(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "B";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] matrix = new boolean[getBoard().getRows()][getBoard().getColumns()];
		// nw
		Position auxPosition = new Position(0, 0);
		// pega a posicao da peca e diminui uma linha e uma coluna menos 1
		auxPosition.setValues(position.getRow() - 1, position.getColumn() -1 );
		// vai diminuir enquanto a posicao existir e a peca
		while (getBoard().positionExists(auxPosition) && !getBoard().thereIsAPiece(auxPosition)) {
			// matriz recebe true
			matrix[auxPosition.getRow() -1][auxPosition.getColumn() -1] = true;
			auxPosition.setValues(auxPosition.getRow() -1, auxPosition.getColumn() -1);
		}
		// se a posicao existir e conter uma peca oponente marca a matriz como true
		if (getBoard().positionExists(auxPosition) && isThereOpponentPiece(auxPosition)) {
			matrix[auxPosition.getRow()][auxPosition.getColumn()] = true;
		}

		// ne
		
		auxPosition.setValues(position.getRow() -1, position.getColumn() +1);
		// vai diminuir enquanto a posicao existir e a peca
		while (getBoard().positionExists(auxPosition) && !getBoard().thereIsAPiece(auxPosition)) {
			// matriz recebe true
			matrix[auxPosition.getRow()][auxPosition.getColumn()] = true;
			auxPosition.setValues(auxPosition.getRow() -1, auxPosition.getColumn() +1);
		}
		// se a posicao existir e conter uma peca oponente marca a matriz como true
		if (getBoard().positionExists(auxPosition) && isThereOpponentPiece(auxPosition)) {
			matrix[auxPosition.getRow()][auxPosition.getColumn()] = true;
		}

		// se
		
		auxPosition.setValues(position.getRow() +1, position.getColumn() + 1);
		// vai diminuir enquanto a posicao existir e a peca
		while (getBoard().positionExists(auxPosition) && !getBoard().thereIsAPiece(auxPosition)) {
			// matriz recebe true
			matrix[auxPosition.getRow()][auxPosition.getColumn()] = true;
			auxPosition.setValues(auxPosition.getRow() +1, auxPosition.getColumn() +1);
		}
		// se a posicao existir e conter uma peca oponente marca a matriz como true
		if (getBoard().positionExists(auxPosition) && isThereOpponentPiece(auxPosition)) {
			matrix[auxPosition.getRow()][auxPosition.getColumn()] = true;
		}

		// sw	
		
		auxPosition.setValues(position.getRow() + 1, position.getColumn() -1);
		// vai acrecentar enquanto a posicao existir e a peca
		while (getBoard().positionExists(auxPosition) && !getBoard().thereIsAPiece(auxPosition)) {
			// matriz recebe true
			matrix[auxPosition.getRow()][auxPosition.getColumn()] = true;
			auxPosition.setValues(auxPosition.getRow() -1, auxPosition.getColumn() -1);

		}
		// se a posicao existir e conter uma peca oponente marca a matriz como true
		if (getBoard().positionExists(auxPosition) && isThereOpponentPiece(auxPosition)) {
			matrix[auxPosition.getRow()][auxPosition.getColumn()] = true;
		}

		return matrix;
	}

}
