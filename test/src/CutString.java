
public class CutString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("hello java");
		String str2 = new String("java are easy");
		String substr1 = str1.substring(6,9);
		String substr2 = str2.substring(0,3);
		boolean b1 = substr1.equals(substr2);
		if(b1){
			System.out.println("截取的两个字符串相等");
		}else{
			System.out.println("截取的两个字符串不相等");
		}
		

	}

}
