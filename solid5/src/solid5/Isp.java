package solid5;
interface Machine
{
	public void xeroxing();
	public void stapling();
	public void printing();
}
class Xerox implements Machine
{
	public void xeroxing()
	{
		System.out.println("perform xeroxing");
	}
	public void stapling()
	{
		System.out.println("perform stapling");
	}
	public void printing()
	{
		System.out.println("perform printing");
	}
}
class staple implements Machine
{
	public void xeroxing()
	{
		System.out.println("perform xeroxing");
	}
	public void stapling()
	{
		System.out.println("perform stapling");
	}
	public void printing()
	{
		System.out.println("perform printing");
	}
}
class Print implements Machine
{
	public void xeroxing()
	{
		System.out.println("perform xeroxing");
	}
	public void stapling()
	{
		System.out.println("perform stapling");
	}
	public void printing()
	{
		System.out.println("perform printing");
	}
}

public class Isp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xerox x = new Xerox();
		x.xeroxing();
		x.stapling();
		x.printing();
		

	}

}
