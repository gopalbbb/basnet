
public class AlternateSolution {

	public static void main(String[] args) {
		
				int[] arr = {1,2,3,4,5,6};
				int sum=0;

			       //array length
			       int n = arr.length;

			        // loop through the array and increment by 2
			       for(int i=1; i<=n; i = i+2)
			       {
			    	   sum=sum+(arr[i]);
			    	   
			    	   //print element
			         System.out.println(arr[i]);
			       }
			   
			         System.out.println("Sum of the alternate elements of the array :"+sum);   
			       
			         int[] arry = {1,2,3,4,5,6};
						int sum1=0;

					       //array length
					       int a = arry.length;

					        // loop through the array and increment by 2
					       for(int j=0; j<=a; j = j+2)
					       {
					    	   sum1=sum+(arry[j]);
					    	   
					    	   //print element
					         System.out.println(arry[j]);
					       }
				System.out.println("Sum of the alternate elements of the array :"+sum1);
					   
	
	}}


			   

	
