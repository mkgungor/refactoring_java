package replace_type_code_with_state_strategy.after;

public class StateLogging extends State {

	@Override
	public int getTypeCode() {
		return Logger.STATE_LOGGING;
	}

}
