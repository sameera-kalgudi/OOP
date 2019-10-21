package Spring;

import java.sql.SQLException;
import java.util.*;


// Because I didn't want to write a real class for something I want you to mock anyway...
public class CustomerAccountDAO {
	
	private List<CustomerAccount> account = new ArrayList<CustomerAccount>();
	
	public void saveAccount(CustomerAccount ca) throws SQLException {
		account.add(ca);
	}
	public void updateAccount(CustomerAccount ca) throws SQLException, NoSuchCustomerAccountException {
		System.out.println("Customer name now: " +  getAcctName(ca) + " for acctNumber: " + getAcctNum(ca));
	}	
	public void deleteAccount(CustomerAccount ca) throws SQLException {
		account.remove(ca);
	}
	public String getAcctNum(CustomerAccount ca)
	{
		return ca.custAcctNumber;
	}
	public String getAcctName(CustomerAccount ca)
	{
		return ca.custName;
	}
	public CustomerAccount getAccount(String acctNum) throws SQLException, NoSuchCustomerAccountException {
		for(int i = 0; i < account.size(); i++) {
			if(getAcctNum(account.get(i)) == acctNum) {
				return account.get(i);
			}
		}
		throw new NoSuchCustomerAccountException(String.format("No customer record with acctount number %s ", acctNum));
	}
	public String newAcctNumber(String name, String phone) throws SQLException {
		return name + phone;
	}
}
