package Spring;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.sql.SQLException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerAccountTest {
	
	public CustomerAccount customerAccount;

	@BeforeEach
	void setUp() throws Exception {
		customerAccount = new CustomerAccount();
		System.out.println("---Initialized Object---");
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCustomerAccount() {
		fail("Not yet implemented");
	}
	
	@Test
	void test1() {
		CustomerAccountDAO test = mock(CustomerAccountDAO.class);
		when(test.getAccount("12")).thenReturn();
	}

	@Test
	void testCreateNewAccount() {
		CustomerAccount as = CustomerAccount.createNewAccount("name1", "phone1");
		CustomerAccount accountTest = CustomerAccountDAO.getAccount("name1phone2");		
	}

	@Test
	void testUpdateCustomerName() {
		fail("Not yet implemented");
	}

}
