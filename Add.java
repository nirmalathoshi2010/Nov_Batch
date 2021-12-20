package com.constructor;

public class Add {
public static void main(String[] args) {
	
    int s;
	int[] a= {1,5,6,4,2,3};
	int n=a.length;
	System.out.println(n);
	for(int i=0;i<n-1;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			s=a[i]+a[j];
	        if(s==10)
	        {
		      System.out.println("The positions are "+i+" "+j);
	          System.out.println("The values are "+a[i]+" "+a[j]);
	          break;
	        }
		}
	}
					
}
}