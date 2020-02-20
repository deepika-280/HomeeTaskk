package epammm.taskkkd;

public class Sweets extends Gift {
	public Sweets(String sname,int sqty) {
		super(sname,sqty);
		}
		@Override
		void wrap() {
		System.out.println(this.getGName()+" is gift wrapped!");
		}
}
