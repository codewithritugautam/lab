package thurdylab;

public class atleasttwocustomer {
public static void main(String[] args) {
	customer c = new customer();
	c.setAccountNumber1(7435845344L);
	c.setAccountName1("Ritu");
	c.setAccountBalance1(50000);
	c.setWithdrawAmount(1000);
	System.out.println("Account number1:"+c.getAccountNumber1());
	System.out.println("Account name1:"+c.getAccountName1());
	System.out.println("Account Balance1:"+c.getAccountBalance1());
	System.out.println("withdraw successfully"+c.getWithdrawAmount());
	c.setAccountNumber2(78354854L);
	c.setAccountName2("Himanshu");
	c.setAccountBalance2(65000);
	System.out.println("Account number2:"+c.getAccountNumber2());
	System.out.println("Account name2:"+c.getAccountName2());
	System.out.println("Account Balance2:"+c.getAccountBalance2());

}
}










