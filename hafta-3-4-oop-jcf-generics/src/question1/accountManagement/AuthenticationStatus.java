package question1.accountManagement;

public enum AuthenticationStatus {

	SUCCESS("200","Giriş başarılı"), 

	UNSUCCESFUL("404","Böyle bir kullanıcı bulunmamaktadır.");

	private final String code;
	private final String description;

	
	private AuthenticationStatus(String code, String description) {
		this.code = code;
		this.description = description;
	}


	public String getCode() {
		return this.code;
	}

	public String getDescription() {
		return this.description;
	}
}
