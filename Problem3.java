/*
 The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 {
	


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean found=true;
		long[] arrBig=new long[15];//array containing larger factors
		long[] arrSmall=new long[15];//array containing smaller factors
		int index=0;
		for(long i=1L;i<=Math.sqrt(600851475143L);i+=2){
			
			if(600851475143L%i==0){
				arrBig[index]=600851475143L/i;
				arrSmall[index]=i;
				found=true;
				for(int j=2;j<=Math.sqrt(arrBig[index]);j++){
					if(arrBig[index]%j==0){
						found=false;
						break;
					}
				
				}
				if(found){
					System.out.println(arrBig[index]);
					break;
				}
				index++;
			}
			
		}//end of for
		index--;// start with the last term of the array containing the smaller factors
		
		if(!found){// now array with factors less than equal to square root of functions will be evaluated
		while(index>=0 ){
			
			found=true;
			for(int j=2;j<=Math.sqrt(arrSmall[index]);j++){
				if(arrSmall[index]%j==0){
					found=false;
					break;
				}
			}
			if(found){
				System.out.println(arrSmall[index]);
				break;
			}
			index--;
				
			}
		}
				
				
					
				
			
			
		}
			
				
				
					
				
	}
			
			
			
		
		// TODO Auto-generated method stub




