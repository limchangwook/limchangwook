package limchangwook;

import java.util.*;


public class AccountTest {
	public static void main(String args[]) throws Exception{
		
	
		
		CheckingAccount account1= new CheckingAccount(100,50,0.01,0.07);
		SavingsAccount account2 = new SavingsAccount(100,0.05);
		
		ArrayList<Account> accountList = new ArrayList<Account>();
		accountList.add(account1);
		accountList.add(account2);
		
		System.out.println("��ü ������ �ܾ� �ջ� : "+Account.sumForAccount(accountList));
		System.out.println("��ü ������ 12���� �� ����");
		Account.passTimeForList(accountList,12);
		System.out.println("��ü ������ �ܾ� �ջ� : "+Account.sumForAccount(accountList));

	}
}

