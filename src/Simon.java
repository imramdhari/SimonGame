
/**
 * Class Simon used to simulate the Game Simon.
 * Author: Balvinder Singh
 *
 */
public class Simon 
{
	/**
	 * Program execution begins here
	 * @param args
	 */
	public static void main(String[] args) 
	{
		SimonGame game = new SimonGame();
		
		SimonGameUi ui = new SimonGameUi(game);
		ui.setLocation(100,100);
		game.registerObserver(ui);
		game.play();

		//to add multiple UI's for the same game
		
	}

}
