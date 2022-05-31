package com.estudo.tictactoe;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


import org.junit.jupiter.api.Test;

class TicTacToeTest {
	
	private TicTacToe ttt;
	
	@BeforeEach
	public void setUp() throws Exception {
		ttt = new TicTacToe();
	}

	@Test
	public void GivenABoardWhenPutAPieceOutsideXAxisThenThrowAnError() {
		Assertions.assertThrows(RuntimeException.class, () -> {
			ttt.play(5,2);
		});
	}
	
	@Test
	public void GivenABoardWhenPutAPieceOutsideYAxisThenThrowAnError() {
		Assertions.assertThrows(RuntimeException.class, () -> {
			ttt.play(1,3);
		});
	}
	
	@Test
	public void GivenABoardWhenPlayerPutPieceOnOccupiedSpaceThenThrowAnError() {
		ttt.play(1, 1);
		
		Assertions.assertThrows(RuntimeException.class, () -> {
			ttt.play(1, 1);
		});
	}
	
	@Test
	public void GivenABoardWhenPlayerPutThreePiecesInRowThenHeWins() {
		ttt.play(0, 0);
		ttt.play(0, 1);
		ttt.play(0, 2);
		
		Assertions.assertTrue(ttt.hasAWinner());
	}
	

}
