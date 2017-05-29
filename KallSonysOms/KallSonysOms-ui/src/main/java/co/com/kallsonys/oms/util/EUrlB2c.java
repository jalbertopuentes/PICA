package co.com.kallsonys.oms.util;

public enum EUrlB2c {
	
	URL_B2C("http://25.2.163.86:8091/Product/SingleProduct?IdProduct=");
	
	private String value;
	private EUrlB2c( String value ){
		this.value=value;
	}
	public String getValue() {
		return value;
	}

}
