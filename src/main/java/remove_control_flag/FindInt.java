package remove_control_flag;

public class FindInt {
	public static boolean find(int[] data, int target) {
		boolean flag = false;
		for(int i=0; i<data.length; i++) {
			if (data[i]==target) {
				flag = true;
			}
		}
		return flag;
	}
}
