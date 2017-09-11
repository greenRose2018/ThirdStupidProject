package stupid.model;

public class PlayDohX
{
	private int zebra;
	
	public PlayDohX()
	{
		this.zebra = 2;
	}
	
	public PlayDohX(int size)
	{
		this.zebra = size;
	}
	
	public String toString()
	{
		String test = "this is my size " + zebra;
		return test;
	}
}
