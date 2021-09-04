

import java.util.Vector;

/**
 *All Observers of the Game need to implement this interface
 *This interface has methods which gets called when state of the Game Changes
 */
public interface SimonObserver 
{
	/**
	 * Updates The Observers about the next Sequence of Colors to be Flased
	 * @param sequenceColors Sequence of Colors to be flashed
	 */
	public void nextColorSequence(Vector<FlashColors> sequenceColors);
	
	/**
	 * Informs the observers that the turn of a player is Over and 
	 * Observer should clear the buffer of the user input list.
	 */
	public void turnOver();
	
	/**
	 * Indicates whether Game is over or not. Game is over when the user enters 
	 * an incorrect sequence
	 * @param isGameOver returns true if the game is over or else returns false
	 */
	public void gameOver(boolean isGameOver);
	
	/**
	 * Updates the new Score of the user
	 */
	public void updateScore(int score);

}
