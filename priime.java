package closed_lab_book;
import java.util.Scanner;
public class priime {
	
	public static void main(String[] args) {
		int tem;
		boolean isp=true;
	Scanner num=new Scanner(System.in);
	System.out.println("Enter a number=");
	int nut=num.nextInt();
	for(int i=2;i<=nut/2;i++) {
		tem=nut%i;
		if(tem==0) {
			isp=false;
			break;
		}
	}
	if(isp) System.out.println("it is a prime number");
	else System.out.println("it is not a prime number");
}
}


