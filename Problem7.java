
public class Problem7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primeCount=0;//holds the number of prime numbers found

		int num=2;
		while(primeCount<10001){
			boolean isPrime=true;
			for(int i=2;i<=Math.sqrt(num)&&isPrime;i++){
				if(num%i==0)
					isPrime=false;
			}//end of for
			if(isPrime)
				primeCount++;
			num++;
			
		}//end of while
		num--; //
		System.out.println(num);
			
	}

}


