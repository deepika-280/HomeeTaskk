package epammm.taskkkd;

public abstract class Gift {
	 private String gname;
	    private int gqty;
	    public Gift(String name,int qty) {
	    gname=name;
	    gqty=qty;
	    }
	    public void setGName(String x) {
	    gname=x;
	    }
	    public String getGName() {
	    return gname;
	    }
	    public void setGQty(int y) {
	    gqty=y;
	    }
	    public int getGQty() {
	    return gqty;
	    }
	    abstract void wrap();

}
