package ErfassenVonDaten;

public class Person {
	String fname;
	String sname;
	String address;
	String mail;
	int tel;
	
	public Person(String fname, String sname, String address, String mail,int tel) {
		this.fname = fname;
		this.sname = sname;
		this.address = address;
		this.mail = mail;
		this.tel = tel;	
	}
	//Set Methoden
	public void setAddress(String address) {
		this.address = address;
		
	}
	public void setMail(String mail) {
		this.mail = mail;
		
	}
	public void setTel(int tel) {
		this.tel = tel;
		
	}
	//Get Methoden
	public String getFname() {
		return fname;
	}
	public String getSname() {
		return sname;
	}
	public String getAddress() {
		return address;
	}
	public String getMail() {
		return mail;
	}
	public int getTel() {
		return tel;
	}

	
}
