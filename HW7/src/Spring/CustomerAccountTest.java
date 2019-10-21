package Spring;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerAccountTest {
	
	public CustomerAccount customerAccount;

	@BeforeEach
	public void setUp() throws Exception {
		customerAccount = new CustomerAccount();
		System.out.println("---Initialized Object---");
		
	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetAcctNum() throws SQLException, NoAccountCreatedException {
		CustomerAccountDAO test = mock(CustomerAccountDAO.class);
		customerAccount.createNewAccount("1", "2");
		when(test.getAcctNum(customerAccount)).thenReturn("12");
		assertEquals(test.getAcctNum(customerAccount), "12");
		System.out.println("Account Number= " + test.getAcctNum(customerAccount));
		
	}
	
	@Test
	public void testGetAccountName() {
		CustomerAccountDAO test = mock(CustomerAccountDAO.class);
		when(test.getAcctName(customerAccount)).thenReturn("1");
		assertEquals(test.getAcctName(customerAccount), "1");
		System.out.println("Account Name= " + test.getAcctName(customerAccount));
	}

	@Test
	public void testGetAccount() throws SQLException, NoSuchCustomerAccountException {
		CustomerAccountDAO test = mock(CustomerAccountDAO.class);
		when(test.getAccount("12")).thenReturn(customerAccount);
		assertEquals(test.getAccount("12"), customerAccount);
		System.out.println("Account = " + test.getAccount("12"));	
	}

	@Test
	public void testUpdateAccount() throws NoSuchCustomerAccountException {
		CustomerAccountDAO test = mock(CustomerAccountDAO.class);
		customerAccount.updateCustomerName("12", "newname");
		assertEquals(test.getAcctName(customerAccount), "newname");
		System.out.println("Account = " + test.getAcctName(customerAccount));
	}
	
	@Test
	public void testCreateAccount() throws SQLException, NoAccountCreatedException
	{
		customerAccount.createNewAccount("1", "2");
		CustomerAccountDAO test = mock(CustomerAccountDAO.class);
		when(test.getAcctNum(customerAccount)).thenReturn("12");
		assertEquals(test.getAcctName(customerAccount), "12");
	}

}
