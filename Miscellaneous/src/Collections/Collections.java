package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account accEGP = new Account<EGP>(new EGP());
		Account accAED = new Account<AED>(new AED());

		ArrayList<Account> arr  = new ArrayList();
		arr.add(accAED);
		arr.add(accEGP);
		
		for (Object object : arr) {
			System.out.println(object);
		}
		
		LinkedList<String> linkedList = new LinkedList();
		linkedList.add("Ahmed");
		linkedList.add("Ahmed");
		linkedList.add("Ahmed");
		linkedList.add("Ahmed");

		Iterator<String> itr = linkedList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	

}
