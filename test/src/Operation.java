import java.util.Scanner;
public class Operation {
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		System.out.println("请输入第一个数字：按回车确定");
		int a = sc.nextInt();
		System.out.println("请输入运算符：按回车确定");
		String str = sc.next();
		char ch = str.charAt(0);
		System.out.println("请输入第二个数字：按回车确定");
		int b = sc.nextInt();
		switch(ch){
		case '+':
			System.out.println(a+"+"+b+"="+(a+b));
			break;
		case '-':
			System.out.println(a+"-"+b+"="+(a-b));
			break;
		case '*':
			System.out.println(a+"*"+b+"="+(a*b));
			break;
		case '/':
			if(b == 0){
				System.out.println("被除数为零，运算无效");
			}
			else{
			System.out.println(a+"/"+b+"="+(a/b));
			break;
			}
		default:
			System.out.println("运算符是无意义的字符！请重新输入");
			break;
		}

	}

}
