package solid7;

class BackEndDeveloper {

    public void writeJava() {
    	System.out.println("write java");

    }
}
    class FrontEndDeveloper {

        public void writeJavascript() {
        	System.out.println("write java script");

        }

    }
 class Project {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BackEndDeveloper b = new BackEndDeveloper();
		b.writeJava();
		FrontEndDeveloper f = new FrontEndDeveloper();
		f.writeJavascript();
		

	}

}
