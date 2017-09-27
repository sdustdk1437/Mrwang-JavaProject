
public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*          *  
		 *         ***
   		 *        *****
		 *       *******
		 *      *********
		 *       *******
		 *        *****
		 *         ***
		 *          *
		 */
        //输入前五行
		for(int i=1;i<=5;i++){
		for(int j=1;j<=5-i;j++){
			System.out.print(" ");
		}
		for(int k=1;k<=2*i-1;k++){
			System.out.print("*");
		}
		System.out.println();
		}
		//输入后四行
		for(int l =1;l<=4;l++){
		for(int m = 1;m<=l;m++){
			System.out.print(" ");
		}
		for(int n = 7;n>=2*l-1;n--){
			System.out.print("*");
		}
		System.out.println();
		}
	}

}
