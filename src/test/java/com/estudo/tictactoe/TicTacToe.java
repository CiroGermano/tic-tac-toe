package com.estudo.tictactoe;

import java.util.function.BooleanSupplier;

public class TicTacToe {
	private String[][] board = {
			{"", "", ""},
			{"", "", ""},
			{"", "", ""}
	};

	public void play(int x, int y) {
		checkAxis(x);
		checkAxis(y);
		setOccupied(x, y);
	}

	private void setOccupied(int x, int y) {
		if (board[x][y] != "") {
			throw new RuntimeException("Place is occupied");
		}
		board[x][y] = "occupied";
	}

	private void checkAxis(int axis) {
		if (axis < 0 || axis > 2) {
			throw new RuntimeException("X is outside board");
		}
	}

	public boolean hasAWinner() {
		return false;
	}

}
