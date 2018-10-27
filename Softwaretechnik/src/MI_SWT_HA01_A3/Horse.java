package MI_SWT_HA01_A3;

public class Horse extends Tier {
	
	protected String name = "Pferd";
	protected int age;
	protected String laut = "Wieher";
	
	public Horse(int age) {
			
			this.age = age;
			super.name = this.name;
			
		}
		
		public void gibTier() {
			
			System.out.println("Name: Pferd Alter: "+this.age+" Laut: "+this.laut);
		}
}
