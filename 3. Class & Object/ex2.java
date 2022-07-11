class Account{
	
	int balance;
	
	Account() {balance = 0;}
	
	int withdraw(int amount){
		if ((balance > amount) || (balance == amount))
			balance -= amount;
		else System.out.println("잔액부족");
		return balance;
	}
	
	int deposit(int amount) {
		balance += amount;
		return balance;
	}
}

public class df {
	public static void main(String[] args) {
		Account a = new Account();
		Account b = new Account();
		
		System.out.println(a.deposit(1000));
		System.out.println(b.deposit(10000));
		
		System.out.println(b.withdraw(5000));

		System.out.println("a 잔고" + a.balance);
		System.out.println("b 잔고" + b.balance);
			
	}

}
