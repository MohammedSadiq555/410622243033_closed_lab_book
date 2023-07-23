package closed_lab_book;
import java.util.Scanner;
class avers {
	private static int aver(int times) {
		
		int[] nums=new int[times];
		for(int i=0; i<times;i++) {
			Scanner no_times=new Scanner(System.in);
			System.out.print("Enter the element-"+ (i+1)+"  ");
			nums[i]=no_times.nextInt();
			}
		int sum=0;
		for(int j = 0;j<times;j++) {
			
			sum=sum+nums[j];
		}
		int av;
		av=sum/times;
		return av;
		}
	public static void main(String[] args) {
		
			Scanner no_times=new Scanner(System.in);
			System.out.println("Enter the number of elements::");
			int times=no_times.nextInt();
			System.out.println(aver(times));
	}
}

