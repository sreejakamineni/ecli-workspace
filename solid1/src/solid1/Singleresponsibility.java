package solid1;
class Person
{
	private String personname;
	private int personid;
	public void personDetails(String personname,int personid)
	{
		this.personname = personname;
		System.out.println("person name : "+personname);
		this.personid = personid;
		System.out.println("person id : "+personid);
	}
}
class Account
{
	private String accountname;
	private int accountno;
	public void accountDetails(String accountname,int accountno)
	{
		this.accountname = accountname;
		System.out.println("account name :"+accountname);
		this.accountno = accountno;
		System.out.println("account number :"+accountno);
	}
}

public class Singleresponsibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.personDetails("sreeja",15);
		Account a = new Account();
		a.accountDetails("incomeaccount", 12345);
		

	}

}
