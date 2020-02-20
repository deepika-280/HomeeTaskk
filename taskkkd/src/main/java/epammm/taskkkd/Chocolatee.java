package epammm.taskkkd;

public class Chocolatee extends Gift{
	public Chocolatee(String cname,int cqty) {
	    super(cname,cqty);
	}
	@Override
	void wrap() {
		System.out.println(this.getGName()+" is gift wrapped!");
		}
}
