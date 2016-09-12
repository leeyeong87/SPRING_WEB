package day0909.spring.upload;

public class UploadfileVo {
	
	private String o_name;
	private String filename;
	private String ructe;
	private String size;
	
	public UploadfileVo(){}
	
	public UploadfileVo(String o_name, String filename, String ructe, String size){
		this.o_name = o_name;
		this.filename = filename;
		this.ructe = ructe;
		this.size = size;
	}
	
	public String getO_name() {
		return o_name;
	}
	public void setO_name(String o_name) {
		this.o_name = o_name;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getRucte() {
		return ructe;
	}
	public void setRucte(String ructe) {
		this.ructe = ructe;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

}
