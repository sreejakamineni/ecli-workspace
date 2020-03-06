package solid6;
interface Xerox
{
	public void xeroxing();
}
interface Staple
{
	public void Stapling();
}
interface Print
{
	public void Printing();
}
class Perform implements Xerox
{

	@Override
	public void xeroxing() {
		// TODO Auto-generated method stub
		System.out.println("perform xerox");
		
	}
	
}
public class Interfacesegregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perform p = new Perform();
		p.xeroxing();

	}

}
