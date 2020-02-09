
 class Interface extends Interface2{
	void clapOnce()
	{
		System.out.println("light on");
	}
	void clapTwice()
	{
		System.out.println("light off");
	}
	public static void main(String[] args) {
		Interface i = new Interface();
		i.clapOnce();
		i.clapTwice();
	}

}
