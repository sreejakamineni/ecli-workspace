package solid;
class Details
{
	private String personname;
	private int personid;
	private int accountno;
	private String accountname;
	public void showDetails(String personname,int personid,int accountno,String accountname)
	{
		this.personname = personname;
		System.out.println("person name  : "+personname);
		this.personid = personid;
		System.out.println("person id : "+personid);
		this.accountno = accountno;
		System.out.println("accountno : "+accountno);
		this.accountname = accountname;
		System.out.println("account name : "+accountname);
		
	}
	
	
}

public class srp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Details d = new Details();
    d.showDetails("sreeja", 15, 123456, "incomeaccount");
	}
}


