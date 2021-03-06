package rewards;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import rewards.internal.account.AccountRepository;

@ContextConfiguration(classes={DbExceptionTestConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class DBExceptionHandlingAspectTests {
	
	@Autowired
	AccountRepository repository;
	
	@Test
	public void testReportException(){  
		try{
			 repository.findByCreditCard("1234123412341234");
			}
		catch(Exception e){
			System.out.println("Exception occured...... " +e);
			}
		}

}
