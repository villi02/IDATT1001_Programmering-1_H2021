import java.util.Scanner;
public class Matrix 
{
    private int[][] A = new int[2][2];
    private int[][] drittunge;
    
    public Matrix(int linje, int rad)
    {
        drittunge = new int[2][2];

        for (int i = 0; i < 2; i ++)
        {
            for (int j = 0; j < 2; j++)
            {
                drittunge[i][j] = 0;
            }
        }
    }

    public Matrix()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Fyll inn verdiene: ");
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)  
            {
                System.out.print("[" + i + "]" + "[" + j + "]: ");
                A[i][j] = sc.nextInt();                
            }
        }
        sc.close();
        
    }

    public int getValue(int x, int y)
    {
        return this.A[x][y];
    }

    public void assignValue(int x, int y, int value)
    {
        A[x][y] = value;
    }

    public void addere(Matrix a, Matrix B)
    {

        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                int value = a.getValue(i, j) + B.getValue(i, j);
                a.assignValue(i, j, value); 
            }
        }
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                A[i][j] = a.getValue(i, j);
            }
        }
    }

    public void transponer()
    {
        int temp[][] = new int[2][2];
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                temp[i][j] = A[j][i];
            }
        }
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                A[i][j] = temp[i][j];
            }
        }
    }

    public void multiply(Matrix a, Matrix B)
    {
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {   int sum = 0;
                for (int r = 0; r < 2; r++)
                {
                    sum += a.getValue(i, r) * B.getValue(r, j);
                }
                
                a.assignValue(i, j, sum);
                A[i][j] = a.getValue(i, j);
            }
        }
    }
}
