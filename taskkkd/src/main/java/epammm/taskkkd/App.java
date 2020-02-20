package epammm.taskkkd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	ArrayList<String> req=new ArrayList<String>();
    	int ans=1,ch=1,start=0;
    	Gift[] g=new Gift[6];
    	g[0]=new Sweets("mysore-pak",100);
    	g[1]=new Sweets("kaju-katli",50);
    	g[2]=new Sweets("jalebi",30);
    	g[3]=new Chocolatee("dairy-milk",20);
    	g[4]=new Chocolatee("munch",45);
    	g[5]=new Chocolatee("kitkat",30);
    	        do {
    	        System.out.println("Welcome!!");
    	        System.out.println("gifts ------------quantity");
    	        System.out.println("Sweets");
    	        for(int i=0;i<3;i++) {
    	        System.out.println((i+1)+"."+g[i].getGName()+"              "+g[i].getGQty());
    	        }
    	        System.out.println("Chocolates");
    	        for(int i=3;i<6;i++) {
    	        System.out.println((i+1)+"."+g[i].getGName()+"                "+g[i].getGQty());
    	        }
    	        System.out.println("-------------------------------------");
    	        System.out.println("1.Enter the range  of your choice to view gifts");
    	        System.out.println("2.Enter your choice to wrap the gift packs");
    	        System.out.println("Enter your choice:");
    	        ans=sc.nextInt();
    	        if(ans==1) {
    	        System.out.println("Enter the range between which you want the gifts");
    	        start=sc.nextInt();
    	        //System.out.println("Available gifts are:");
    	        for(int i=0;i<6;i++) {
    	        if(g[i].getGQty()>=start) {
    	        req.add(g[i].getGName());
    	        }
    	        }
    	        if(req.isEmpty()) {
    	        System.out.println("Sorry,no gifts found in the given range!!");
    	        //break;
    	        }
    	        else {
    	        System.out.println("Gifts available in the given range are:");
    	        Iterator<String> itr=req.iterator();
    	        while(itr.hasNext()) {
    	        System.out.println(itr.next());
    	        }      
    	        }
    	        }
    	        else if(ans==2) {
    	        sc.nextLine();
    	        System.out.println("Enter the name of the gift:");
    	        String c=sc.nextLine();
    	        int h=0;
    	        for(int j=0;j<6;j++) {
    	        if(g[j].getGName().equalsIgnoreCase(c)) {
    	        g[j].wrap();
    	        h=1;
    	                    break;
    	        }
    	        }
    	        if(h==0)
    	        {
    	        System.out.println("entered gift not found! please enter the available gift");
    	        }
    	        }
    	        else {
    	        System.out.println("Enter a valid chocie");
    	        }
    	        System.out.println("Do you want to continue?Yes(1)/No(0)");
    	        ch=sc.nextInt();
    	}while(ch==1);
    	        System.out.println("Visit again!!");
    	        sc.close();
    }
}
