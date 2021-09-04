
public class Player {
	 String name;
	 String speed;
	 int buttons;
	
	public Player(String name, String speed, int buttons) {
		this.name=name;
		this.speed=speed;
		this.buttons=buttons;
	}
	
	 void setName(String new_name) {
		this.name = new_name;
	}
	 void setSpeed(String new_speed) {
		this.speed = new_speed;
	}
	 void setButtons(int new_buttons) {
		this.buttons = new_buttons;
	}
	 String getName() {
		return this.name;
	}
	  String getSpeed() {
		return this.speed;
	}
	 int getButtons() {
		return this.buttons;
	}
}
