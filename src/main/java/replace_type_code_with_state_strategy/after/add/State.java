package replace_type_code_with_state_strategy.after.add;

public abstract class State {
	public abstract void start(Logger logger);
	public abstract void stop(Logger logger);
	public abstract void log(String info);
}
