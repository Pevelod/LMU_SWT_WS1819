package MI_SWT_HA01_A3;

public class Dog extends Tier {
	
	//protected String name;
	protected int age;
	protected String laut = "Wuff";
	
	
	public Dog (String name,int age) {
		
		this.name = name;
		this.age = age;
		
	}
	
	public void gibTier() {
		
		System.out.println("Name: "+this.name+" Alter: "+this.age+" Laut: "+this.laut);
	}


}
