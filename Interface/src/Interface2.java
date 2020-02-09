
public class Interface2 {
	void whistleOnce()
	{
		System.out.println("Led light on");
	}
	void whistleTwice()
	{
		System.out.println("led light off");
	}
	public static void main(String[] args) {
		Interface2 i = new Interface2();
		i.whistleOnce();
		i.whistleTwice();
	}
}
