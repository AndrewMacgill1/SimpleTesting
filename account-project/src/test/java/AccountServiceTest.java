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
	
	@Test
	public void testNameCount() {
		Service service3 = new Service();
		Account johnA = new Account("John","A",1234);
		Account johnB = new Account("John","B",2468);
		Account johnC = new Account("John","C",3692);
		service3.addAcc(johnA);
		service3.addAcc(johnB);
		service3.addAcc(johnC);
		assertEquals(3,service3.AccNameCounter("John"));
	}

}
