package stringProgram;

public class PerfectRotaition {

	public static void main(String[] args) {
  String s="I am From Bnaglore";
 String[] str = s.split(" ");
 
 for(int i=0;i<str.length;i++)
 {
	 String temp=str[0];
	 for(int j=1;j<str.length;j++)
	 {
		str[j-1]=str[j];
		System.out.print(str[j]+" ");
	 }
	 str[str.length-1]=temp;
	 System.out.println(temp);
 }
	} 

}