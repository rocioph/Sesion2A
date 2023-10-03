package pkg;

public class calculadora {
	public static int suma (int a, int b)
	{
		return (a+b);
	}
	public static int multiplicar (int a, int b)
	{
		return (a*b);
	}
	public static int resta (int a, int b)
	{
		return (a-b);
	}
	public static int dividir (int a, int b)
	{
		if(b==0)
		{
			return -1;
		}
		else
			return(a/b);
	}
	
}
