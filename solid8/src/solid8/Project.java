package solid8;
interface Developer {
 
    void develop();

}
class BackEndDeveloper implements Developer
{

	@Override
	public void develop() {
		System.out.println("write java");
		
	}
	
}
class FrontEndDeveloper implements Developer
{

	@Override
	public void develop() {
		System.out.println("write java");
		
	}
	
}

class pp
{
	void add(Devloper dev)
	{
		
	}
}



class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BackEndDeveloper b = new BackEndDeveloper();
		b.develop();
		FrontEndDeveloper f = new FrontEndDeveloper();
		f.develop();
		pp j = new pp(b);
		

	   

	    }

	}
