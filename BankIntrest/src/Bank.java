
public class Bank {

	double deposit(double amount,double roi,double tenure)
	{
		double p,t,r;
		
		p=amount;
		t=roi;
		r=tenure;
		
		double intrest = (p*t*r)/100;
		return intrest;

	}

	public static void main(String[] args) {

		Bank b = new Bank();
		double d = b.deposit(5000, 5, 10);
		System.out.println(d);

	}
}
