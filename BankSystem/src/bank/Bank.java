package bank;

import accounts.Client;

public class Bank {

	
	public void withdrawFromClient(Client client, Iteller teller ) {
		teller.deposit();
	}
	
}
