import java.util.Scanner;


public class HelloWorld {

	public static void main(String[] args) {
		new HelloWorld().run();
	}
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0;i < n;i++){
			arr[i] = sc.nextInt();
		}
		int result = 0;
		int num = 0;
		for(int j = 0;j < (arr.length-1);j++) {
			num = arr[j] - arr[j+1];
			if(num < 0) {
				num = -num;
			}
			if(num > result){
				result = num;
			} 
		}
		System.out.println(result);
		sc.close();
	}
	
}
