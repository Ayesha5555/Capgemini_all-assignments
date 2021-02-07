
class SmallestLargest {

	public static void main(String[] args) {
		int num[]= {33,45,67,89,12,4,79,98};
		int smallest=num[0];
		int biggest=num[0];
		for(int i=1;i<num.length;i++)
		{
			if(num[i]>biggest)
				biggest=num[i];
			else if(num[i]<smallest)
				smallest=num[i];
		}
		System.out.println("Smallest value in array is:"+smallest);
		System.out.print("Biggest value in array is:"+biggest);
	}

}
