package ceaserboth;


class Caesercipher
{
	public String encrypt(String input,int key)
	{ 
		StringBuilder encrypted = new StringBuilder(input);
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lalphabet="abcdefghijklmnopqrstuvwxyz";
		String shifedalphabet = alphabet.substring(key)+alphabet.substring(0,key);
		String lshifedalphabet = lalphabet.substring(key)+lalphabet.substring(0,key);
		for(int i=0;i<encrypted.length();i++)
		{    
			if(Character.isUpperCase(encrypted.charAt(i)))
			{
			char currchar = encrypted.charAt(i);
			int idx = alphabet.indexOf(currchar);
			if(idx!=-1)
			{
				char newchar = shifedalphabet.charAt(idx);
				encrypted.setCharAt(i,newchar);
			}
			}
			if(Character.isLowerCase(encrypted.charAt(i)))
			{
			char currchar = encrypted.charAt(i);
			int idx = lalphabet.indexOf(currchar);
			if(idx!=-1)
			{
				char newchar = lshifedalphabet.charAt(idx);
				encrypted.setCharAt(i,newchar);
				
		}
			
		}
		}
		return encrypted.toString();
	}
}
public class cipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caesercipher c = new Caesercipher();
		System.out.println(c.encrypt("I AM",17));

	}

}
