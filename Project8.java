
public class Project8 {
	public static long max13(int[] arr){
		long max=0;
		for(int i=0;i<arr.length-13;i++){
			long product=1;
			for(int j=i;j<i+13;j++){
				product=product*arr[j];
			}
			if(product>max)
				max=product;
		}
		return max;
	}
	
	public static void main(String[] args){
		
		int[] arr=new int[1000];
		TextIO.readFile("input.txt");
		int i=0;
		while(i<1000){
			char ch=TextIO.getChar();
			arr[i]=ch%48;
			i++;
		}
		
		
		System.out.println(max13(arr));
		
		
	}
			
			
		
	

}
