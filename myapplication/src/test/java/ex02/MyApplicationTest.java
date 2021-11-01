package ex02;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes= {MyApplication.class})
@SpringBootTest
public class MyApplicationTest {
	@Autowired
	private MyComponent myComponent; 
	
	@Test
	public void myComponentNoyNull() {
		assertNotNull(myComponent);
	}
}
