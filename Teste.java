public class Teste {

	public Teste(){

		java.util.Scanner sc = new java.util.Scanner(System.in); 
		
		int T = sc.nextInt();
		//System.out.println(T);
			
		for(int i =0; i < T ; i++){
			
			String s1 =	sc.next();
			String s2;
			int size = s1.length();
			int result = size;
			//System.out.println(size);
			for (int a=0; a < size; a++){
				s2 = s1.substring(a+1, size);
				result += this.compare(s2, s1);
				//System.out.println(s2);
			}
			
			System.out.println(result);
		}	
	}
	

	private int compare(String c1, String c2) {
		int size, res = 0;
		size = c1.length();
		
		
		for(int i =0; i < size; i++){
			
			if (c1.charAt(i) == c2.charAt(i) ) {
				res = res + 1;
			}
			else{ 
				return res;
			}
		}
		return res;
		
	}

	public static void main(String[] args) {
		{
		// TODO Auto-generated method stub
			new Teste();
		}	
		
	}

}
