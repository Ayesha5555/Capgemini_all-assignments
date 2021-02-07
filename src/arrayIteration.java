
public class arrayIteration {

	public static void main(String[] args) {
		String message[]= {"hii", "hello","greetings"};
		String msg1=message[1];
		System.out.println("Second element is "+msg1);
		for(int i=0;i<message.length;i++)
		{
			String iteratorVal=message[i];
			System.out.println("The element is at "+i+" index and the value is "+iteratorVal);
		}

	}

}
