// Print prime numbers between 1 and a given number using Sieve of Eratosthenes method.

import java.util.*;

class PrintPrimeNumbers
{
	public static void sieveOfEratosthenes(int n)
	{
		// Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<=n;i++)
            prime[i] = true;
         
        for(int p = 2; p*p <=n; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == true)
            {
                // Update all multiples of p
                for(int i = p*p; i <= n; i += p)
                    prime[i] = false;
            }
        }
         
        // Print all prime numbers
        for(int i = 2; i <= n; i++)
        {
            if(prime[i] == true)
                System.out.print(i + " ");
        }
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter limit : ");
		int n = sc.nextInt();
		
		System.out.print("Prime numbers between 1 and "+n+" are : ");
		sieveOfEratosthenes(n);
	}
}
