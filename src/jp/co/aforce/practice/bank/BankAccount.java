package jp.co.aforce.practice.bank;

public class BankAccount {
	private int balance;
// private final Object lock = new Object(); // 排他制御に使用するロックオブジェクト	
	
	public BankAccount(int b) {
		balance = b;
	}
//    public BankAccount(int balance) {
//        this.balance = balance;
//    }
	
	public int getMoney(int request) {
		 //synchronized (lock) {
		if(balance + request >= 0) {
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				// e.printStackTrace();
			}
			balance += request;
			System.out.println(request + "");
			System.out.println("" + balance + "");
			return -request;
		}else {
			System.out.println("足りん");
			System.out.println("" + balance + "");	
			return 0;
		}
	//}
	}
}


