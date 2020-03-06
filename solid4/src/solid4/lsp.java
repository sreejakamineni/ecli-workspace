package solid4;
class Animal
{
	public void makeNoise()
	{
		System.out.println("makes noise");
	}
}
class Dog extends Animal
{
	public void makeNoise()
	{
	System.out.println("makes noise");
	}
}
class Cat extends Animal
{
	public void  makeNoise()
	{
	  System.out.println("makes noise");
	}
}
class Dambog extends Animal
{
	public void makeNoise()
	{
	System.out.println("can't make noise");//this cannot be implemented
	}
}

public class lsp {
	public static void main(String[] args)
	{
		Animal a = new Animal();
		a.makeNoise();
	}

}
