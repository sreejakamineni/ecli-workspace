package solid3;
class Vechile
{
	public void service()
			{
			System.out.println("general procedure is done");	
			}
}
class Bike extends Vechile
{
	public void service()
	{
		System.out.println("bike specific procedure is done ");
	}
}

public class Openclosed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = new Bike();
		b.service();

	}

}
