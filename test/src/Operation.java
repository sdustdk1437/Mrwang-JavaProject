import java.util.Scanner;
public class Operation {
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		System.out.println("�������һ�����֣����س�ȷ��");
		int a = sc.nextInt();
		System.out.println("����������������س�ȷ��");
		String str = sc.next();
		char ch = str.charAt(0);
		System.out.println("������ڶ������֣����س�ȷ��");
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
				System.out.println("������Ϊ�㣬������Ч");
			}
			else{
			System.out.println(a+"/"+b+"="+(a/b));
			break;
			}
		default:
			System.out.println("���������������ַ�������������");
			break;
		}

	}

}
