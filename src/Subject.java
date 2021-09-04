


/**
 *This is a Subject Interface.
 *Objects use this interface to register as an observer 
 *and also to remove themselves from being observer
 *Our Game SimonGame Model  will Implement this Subject Interface
 */
public interface Subject 
{
	 /**
	 * Adds an Observer to the set of Observers for the SimonGame Class.
	 * @throws NullPointerException If the Observer is Null
	 * @throws IllegalArgumentException If the Observer is already present 
	 * @param Observer
	 */
	 public void registerObserver(SimonObserver o);
	 
	  /**
	  * Removes an Observer from the set of Observers for the SimonGame Class.
	  * @throws NullPointerException If the Observer is Null
  	  * @throws IllegalArgumentException If the Observer is not present 
	  * in the set 
	  * @param Observer
	  */
	  public void removeObserver(SimonObserver o);
	  
	  /**
	   * Each Observer is notified about the current state of the SimonGame
	   */
	  public void notifyObservers();
}
