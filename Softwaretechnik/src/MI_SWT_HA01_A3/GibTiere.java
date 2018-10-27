package MI_SWT_HA01_A3;

public class GibTiere {

	public static void main(String[] args) {
		
		Dog hundMax = new Dog("Max",8);
		Cat katzeRezi = new Cat("Rezi",4);
		Horse pferdPferd = new Horse(13);
		
		hundMax.gibTier();
		katzeRezi.gibTier();
		pferdPferd.gibTier();
		
		}

}
