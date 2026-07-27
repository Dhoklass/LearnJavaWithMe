import java.io.*;
class Add{
	void add(int x,int y)
	{
		int z=x+y;
		System.out.println("Addition ="+z);
	}
}

class main{
	public static void main(String[] args)
	{
		Add a=new Add();
		a.add(10,20);
	}
}