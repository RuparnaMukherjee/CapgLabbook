package com.capg.doubts;
import java.util.*;
public class Practice1 {
	int f=0;
    public int[] modifyarray(int[] a)
    {
    	int i,j;;
    	int arr[]=new int[a.length];
    	for(i=0;i<a.length;i++)
    	{
    		   for(j=i+1;j<a.length-1;j++)
    		
    		    {
    			    if(a[i]!=a[j])
    				   arr[f++]=a[i];
    		    }
    		
    	}
    	return arr;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of elements:");
        n=sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	A[i]=sc.nextInt();
        }
        Practice1 p=new Practice1();
        int arr1[]=new int[n];
        arr1=p.modifyarray(A);
        for(int i:arr1)
        {
        	System.out.println(i);
        }
        
	}

}