package MI_SWT_HA01_A3;

public class Cat extends Tier {
	
	
	//protected String name;
	protected int age;
	protected String laut = "Miau";
	
	
	public Cat (String name,int age) {
		
		this.name = name;
		this.age = age;
		
	}
	
	public void gibTier() {
		
		System.out.println("Name: "+super.name+" Alter: "+this.age+" Laut: "+this.laut);
	}
}
