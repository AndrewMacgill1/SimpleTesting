package tester;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountServiceTest {
	
	@Test
	public void test() {
		Service service1 = new Service();
		Account aliceSmith = new Account("Alice","Smith",1234);
		Account bobJones = new Account("Bob","Jones",5678);
		service1.addAcc(aliceSmith);
		service1.addAcc(bobJones);
		service1.getAcc(5678);
		assertEquals("Alice",aliceSmith.getFirstName());
		assertEquals(bobJones,service1.getAcc(5678));
	}
	
	@Test
	public void testJSON() {
		Service service2 = new Service();
		Account aliceSmith = new Account("Alice","Smith",1234);
		service2.addAcc(aliceSmith);
		assertEquals("{\"1234\":{\"firstName\":\"Alice\",\"lastName\":\"Smith\",\"accNo\":1234}}",service2.Conversion());
		
	}

}
