package sensedia.api.training.com.github;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class SalesApplicationTest {

    @Autowired
    private SalesApplication salesApplication;

    @Test
    public void testGetSystemInformation() {
        assertNotNull(salesApplication.getSystemInformation());
        assertEquals(Map.of("luizc", "Windows 10"), salesApplication.getSystemInformation());
    }
}
