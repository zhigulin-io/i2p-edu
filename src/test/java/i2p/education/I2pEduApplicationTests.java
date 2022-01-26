package i2p.education;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class I2pEduApplicationTests {
	
	@Value("${spring.datasource.password}")
	private String password;
	
	@Value("${spring.datasource.username}")
	private String username;

	@Test
	void contextLoads() {
		assertThat(username).isEqualTo("user");
		assertThat(password).isEqualTo("password");
	}
}
