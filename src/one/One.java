package one;

public class One {
	
	public static void mystring (String s) {
		int n =0,count=0,index;
		char [] x = s.toCharArray();
		for(int i =0; i<x.length;i++) {
			n=i; 
			while(n < x.length-1 ) {
				if(n != x.length-1)
				index=n=n+1;
				else
					index=n;
				char c=x[index];
				while(index > i) {
					 
					 if(c != x[index-1]) {
						 count = count +1;
						 index = index-1;
					 }//if
					 
					 else {
						    break;
						    
					 }
					
				}//innerwhile
					
					
			}//outer while
				
			
			
			}//for*/
		char u='d';
		u= (char) (u+1);
		System.out.println(u);
	
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "mym";
		mystring(s);

	}
	
	
	
}
