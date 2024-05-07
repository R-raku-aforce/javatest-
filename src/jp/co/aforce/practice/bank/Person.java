package jp.co.aforce.practice.bank;

public class Person extends Thread {
	private BankAccount account;
	private int cash;
	
	public Person(BankAccount m,int c) {
		account = m;
		cash = c;
	}
	
//    public Person(BankAccount account, int cash) {
//        this.account = account;
//        this.cash = cash;
//    }
	
	public void run() {
		System.out.println("" + cash + "行きます");	
		cash += account.getMoney(cash);
		System.out.println("" + cash + "なりました");	
	}
}
