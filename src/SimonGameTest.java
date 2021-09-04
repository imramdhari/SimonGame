import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimonGameTest {
	
	SimonGame sg = new SimonGame();
	SimonGameUi gui = new SimonGameUi(sg);

	@Test
	void test_updateScore() {
		int score = 5;
		gui.updateScore(score);
		assertEquals(gui.score.getText(),"5");
	}
	
	@Test
	void test_playerName() {
		String name = "test1";
		sg.currentPlayer.setName(name);
		assertEquals(sg.currentPlayer.getName(),"test1");
	}
	
	@Test
	void test_buttons() {
		sg.currentPlayer.setButtons(1);
		assertEquals(sg.sequenceLength,1);
	}
	
	@Test
	void test_speed() {
		SimonGame.currentPlayer.setSpeed("medium");
		assertEquals(gui.button_speed,1000);
	}
	
	@Test
	void test_colorState() {
		Locked lc = new Locked();
		sg.current.setColorState(lc);
		assertEquals(sg.current.getState(),lc);
	}
	
}
