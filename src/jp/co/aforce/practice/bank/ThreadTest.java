package jp.co.aforce.practice.bank;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BankAccount account = new BankAccount(3000);
		Person husband = new Person(account, -2000);
		Person wife = new Person(account, -2000);
		
		husband.start();
		wife.start();
	}

}
