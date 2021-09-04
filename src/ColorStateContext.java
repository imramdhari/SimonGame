
public class ColorStateContext {
	private ColorState cs;
	ColorStateContext() {
		cs = new Unlocked();
	}
	public void setColorState(ColorState cts) {
		cs = cts;
	}
	public void state() {
		cs.state(this);
	}
	public ColorState getState() {
		return cs;
	}
}
