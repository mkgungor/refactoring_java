package replace_type_code_with_state_strategy.after.add;

public class Logger {
	private State state;

	public void setState(State state) {
		this.state = state;
	}

	public Logger() {
		this.state = StateStopped.getInstance();
	}

	public void start() {
		state.start(this);
	}

	public void stop() {
		state.stop(this);
	}

	public void log(String info) {
		state.log(info);
	}
}
