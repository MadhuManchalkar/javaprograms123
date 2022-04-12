package constructor1;
class primenumber
{
    static void disply()
    {
    	int i=8,c=0,j,k;
    	for( j=1;j<=100;j++)
    	{
    		for( k=1;k<=j;k++)
    		{
    		if(j%k==0)
    		{
    			c++;
    			
    		}
    		}
    		
    		if(c==2)
        	{
        		System.out.println("the given number is prime"+j);
        	}
    		c=0;
    	}
    	
    	
    }

}
public class Prime1234 {

	public static void main(String[] args) {
		primenumber.disply();

	}

}
