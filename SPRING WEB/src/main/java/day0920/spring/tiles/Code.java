package day0920.spring.tiles;

public class Code {
	
	private String code;
	private String label;
	
	public Code() {
	}    
	
	public Code(String code, String value) {
		this.code = code;
		this.label = value;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String value) {
		this.label = value;
	}

}