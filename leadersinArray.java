//java code task 1

class Main
{
    void paders(int a[], int n)  
    { 
        for (int i = 0; i < n; i++)  
        { 
            int j; 
            for (j = i+1; j < n; j++)  
            { 
                if (a[i] <= a[j]) 
                    break; 
            } 
            if (j == n) 
                System.out.print(a[i] + " "); 
        } 
    } 
  
    public static void main(String[] args)  
    { 
       Main x = new Main(); 
        int a[] = new int[]{16, 17, 4, 3, 5, 2}; 
        int n = a.length; 
        x.paders(a, n); 
    } 
}

