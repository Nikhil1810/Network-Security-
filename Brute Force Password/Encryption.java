

public class Encryption {
	public static void main(String[] args) {
		
		String str= "OKSTATECOWBOYS";
	   /*String str="HZFDEDRCHQWHPF";*/
	   /* String str="WLQKGKHUWOQWJQ"*/	
		int n=1551;
		int e=7;
		
		
		
		
		int []b = new int[str.length()];
        int[] result = new int[str.length()];
        
        
		for(int i=0;i<str.length();i++){
		 	b[i]= (int)str.charAt(i);
		}
		
		/*for(int i=0;i<str.length();i++){
		 	System.out.println(b[i]);
		}*/
		
		for(int i=0;i<b.length;i++){
			long k =((long)Math.pow(b[i], e))%n;
			result[i]= (int)k;
			
		}
		for(int i=0;i<str.length();i++){
		 	System.out.println(result[i]);
		}
		
	}
}