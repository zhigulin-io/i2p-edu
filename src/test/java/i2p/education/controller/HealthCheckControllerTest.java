package i2p.education.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@WebMvcTest
public class HealthCheckControllerTest {
	
	@Autowired
	private HealthCheckController controller;
	
	@Test
	public void contextLoads() {
		assertThat(controller).isNotNull();
	}
	
	@Test
	public void shouldReturnPageName() {
		assertThat(controller.getSuccessPage()).contains("health");
	}
}
