package stringProgram;

public class CountTheLength {

	public static void main(String[] args) {
     String str="i am from banglore";
     String[] s = str.split(" ");
     String max=s[0];
     for(int i=0;i<s.length;i++)
     {
    	 if(max.length()<s[i].length())
    	 {
    		 max=s[i];
    	 }
     }
     System.out.println(max);
	}

}
