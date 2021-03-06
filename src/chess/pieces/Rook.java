package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "R";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] matrix = new boolean[getBoard().getRows()][getBoard().getColumns()];
		// acima
		Position auxPosition = new Position(0, 0);
		// pega a posicao da peca e diminui uma linha
		auxPosition.setValues(position.getRow() - 1, position.getColumn());
		// vai diminuir enquanto a posicao existir e a peca
		while (getBoard().positionExists(auxPosition) && !getBoard().thereIsAPiece(auxPosition)) {
			// matriz recebe true
			matrix[auxPosition.getRow()][auxPosition.getColumn()] = true;
			auxPosition.setRow(auxPosition.getRow() - 1);
		}
		// se a posicao existir e conter uma peca oponente marca a matriz como true
		if (getBoard().positionExists(auxPosition) && isThereOpponentPiece(auxPosition)) {
			matrix[auxPosition.getRow()][auxPosition.getColumn()] = true;
		}

		// esquerda
		// pega a posicao da peca e diminui uma coluna
		auxPosition.setValues(position.getRow(), position.getColumn() - 1);
		// vai diminuir enquanto a posicao existir e a peca
		while (getBoard().positionExists(auxPosition) && !getBoard().thereIsAPiece(auxPosition)) {
			// matriz recebe true
			matrix[auxPosition.getRow()][auxPosition.getColumn()] = true;
			auxPosition.setColumn(auxPosition.getColumn() - 1);
		}
		// se a posicao existir e conter uma peca oponente marca a matriz como true
		if (getBoard().positionExists(auxPosition) && isThereOpponentPiece(auxPosition)) {
			matrix[auxPosition.getRow()][auxPosition.getColumn()] = true;
		}

		// direita
		// pega a posicao da peca e acrecenta uma coluna
		auxPosition.setValues(position.getRow(), position.getColumn() + 1);
		// vai diminuir enquanto a posicao existir e a peca
		while (getBoard().positionExists(auxPosition) && !getBoard().thereIsAPiece(auxPosition)) {
			// matriz recebe true
			matrix[auxPosition.getRow()][auxPosition.getColumn()] = true;
			auxPosition.setColumn(auxPosition.getColumn() + 1);
		}
		// se a posicao existir e conter uma peca oponente marca a matriz como true
		if (getBoard().positionExists(auxPosition) && isThereOpponentPiece(auxPosition)) {
			matrix[auxPosition.getRow()][auxPosition.getColumn()] = true;
		}

		// abaixo		
		// pega a posicao da peca e acrecenta uma linha
		auxPosition.setValues(position.getRow() + 1, position.getColumn());
		// vai acrecentar enquanto a posicao existir e a peca
		while (getBoard().positionExists(auxPosition) && !getBoard().thereIsAPiece(auxPosition)) {
			// matriz recebe true
			matrix[auxPosition.getRow()][auxPosition.getColumn()] = true;
			auxPosition.setRow(auxPosition.getRow() + 1);
		}
		// se a posicao existir e conter uma peca oponente marca a matriz como true
		if (getBoard().positionExists(auxPosition) && isThereOpponentPiece(auxPosition)) {
			matrix[auxPosition.getRow()][auxPosition.getColumn()] = true;
		}

		return matrix;
	}

}
