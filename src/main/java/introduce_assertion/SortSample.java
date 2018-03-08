package introduce_assertion;

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
			
			int v = data[m];	// data[m]는 data[x] ~ data[data.length-1]의 최소값
			data[m] = data[x];
			data[x] = v;
		}
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
