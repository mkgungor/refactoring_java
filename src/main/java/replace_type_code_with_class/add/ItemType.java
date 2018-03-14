package replace_type_code_with_class.add;

public enum ItemType {
	BOOK(0), DVD(1), SOFTWARE(2);
	
	private final int typeCode;

	private ItemType(int typeCode) {
		this.typeCode = typeCode;
	}

	public int getTypeCode() {
		return typeCode;
	}
	
}
