package sensedia.api.training.com.github.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class SystemInformationConfigurationTest {

    @Autowired
    private SystemInformationConfiguration systemInformationConfiguration;

    @Test
    public void testGetUserLoggedIn() {
        assertNotNull(systemInformationConfiguration.getUserLoggedIn());
        assertEquals("luizc", systemInformationConfiguration.getUserLoggedIn());
    }

    @Test
    public void testGetOperationalSystemName() {
        assertNotNull(systemInformationConfiguration.getOperationalSystemName());
        assertEquals("Windows 10", systemInformationConfiguration.getOperationalSystemName());
    }
}
