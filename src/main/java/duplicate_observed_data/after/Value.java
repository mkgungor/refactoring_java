package duplicate_observed_data.after;

import java.util.ArrayList;
import java.util.List;

public class Value {
	private final List<ValueListener> listeners;
	private int value;

	public Value(int value) {
		this.value = value;
		this.listeners = new ArrayList<>();
	}

	private void notifyToListener() {
		for(ValueListener listener : listeners) {
			listener.valueChanger(new ValueChangeEvent(this));
		}
	}

	public void addValueListener(ValueListener listener) {
		this.listeners.add(listener);
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
		notifyToListener();
	}

}
