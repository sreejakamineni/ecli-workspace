package solid2;
class Vechile
{
	public void service()
	{
		System.out.println("general procedure is done on vechile");
	}
}

class Bike
{
	public void bikeService()
	{
		System.out.println("bike specific procedure is done");
	}
}

public class Ocp {
public static void main(String[] args)
{
	Vechile v = new Vechile();
	v.service();
	Bike b = new Bike();
	b.bikeService();
}
}
