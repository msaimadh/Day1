package square;


public class kValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr []= {0,1,2,3,4,5,6,7,8,9};
		for(int i=1;i<10;i++)
		{
			for(int j=0;j<i;j++)
			{
				int k=arr[i]-arr[j];
				System.out.println("value of k: "+k);
			}
		}

	}

}
