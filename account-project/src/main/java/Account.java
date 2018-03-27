package tester;

public class Account {
	
	private String firstName;
	private String lastName;
	private int accNo;
	
	public Account(String firstName, String lastName, int accNo) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accNo = accNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

}
