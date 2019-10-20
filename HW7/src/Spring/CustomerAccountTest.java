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
	void setUp() throws Exception {
		customerAccount = new CustomerAccount();
		customerAccount.createNewAccount("1", "2");
		System.out.println("---Initialized Object---");
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testGetAcctNum() throws SQLException, NoAccountCreatedException {
		CustomerAccountDAO test = mock(CustomerAccountDAO.class);
		when(test.getAcctNum(customerAccount)).thenReturn("12");
		assertEquals(test.getAcctNum(customerAccount), "12");
		System.out.println("Account Number= " + test.getAcctNum(customerAccount));
		
	}
	
	@Test
	void testGetAccountName() {
		CustomerAccountDAO test = mock(CustomerAccountDAO.class);
		when(test.getAcctName(customerAccount)).thenReturn("1");
		assertEquals(test.getAcctName(customerAccount), "1");
		System.out.println("Account Name= " + test.getAcctName(customerAccount));
	}

	@Test
	void testGetAccount() throws SQLException, NoSuchCustomerAccountException {
		CustomerAccountDAO test = mock(CustomerAccountDAO.class);
		when(test.getAccount("12")).thenReturn(customerAccount);
		assertEquals(test.getAccount("12"), customerAccount);
		System.out.println("Account Name= " + test.getAcctName(customerAccount));	
	}

	@Test
	void testUpdateCustomerName() {
		fail("Not yet implemented");
	}

}
