
public class Account {

	String accountNumber;
	int balance;

	public String toString() {
		return "\\" + this.balance + "(口座番号 :" + this.accountNumber + ")";
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
	if(o instanceof Account) {
		
		Account a = (Account) o;
		String an1 = this.accountNumber.trim(); //文字列から前後の空白を除去
		String an2 = a.accountNumber.trim();
		if (an1.equals(an2)) {
			return true;
		}
	}
	return false;
	
	}
	
}
