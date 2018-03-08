package introduce_assertion.after;

public class SortSample {
	private final int[] data;

	public SortSample(int[] data) {
		this.data = new int[data.length];
		System.arraycopy(data, 0, this.data, 0, data.length);
	}
	
	/**
	 * 선택 정렬
	 */
	public void sort() {
		for(int x=0; x <data.length - 1; x++) {
			int m = x;
			for(int y = x + 1; y <data.length; y++) {
				if (data[m] > data[y]) {
					m = y;
				}
			}
			
			assert isMin(m, x, data.length-1);
			int v = data[m];	
			data[m] = data[x];
			data[x] = v;
			assert isSorted(0, x+1);
			
		}
	}

	private boolean isMin(int pos, int start, int end) {
		for (int i=start ; i<end+1; i++) {
			if (data[pos] > data[i]) {
				return false;
			}
		}
		return true;
	}

	private boolean isSorted(int start, int end) {
		for (int i=start ; i<end; i++) {
			if (data[i] > data[i+1]) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("[ ");
		for(int i=0; i <data.length; i++) {
			buffer.append(data[i]);
			buffer.append(",");
		}
		int start = buffer.lastIndexOf(",");
		buffer.replace(start, start+1, "");
		buffer.append(" ]");
		return buffer.toString();
	}
}
