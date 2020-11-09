package sensedia.api.training.com.github;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SalesApplication.class)
public class SoInfoTest {

    @Autowired
    @Qualifier("osarch")
    String _soArchitecture;

    @Autowired
    @Qualifier("user")
    String _soUser;


    @Test
    public void validSOArchInfo() {
        assertEquals("amd64", _soArchitecture);
    }

    @Test
    public void validSONameInfo() {
        assertEquals("julio.oliveira", _soUser);
    }

    @Test
    public void invalidSOArchInfo() {
        assertNotEquals("xpto64", _soArchitecture);
    }

    @Test
    public void invalidSOUser() {
        assertNotEquals("bruce.wayne", _soUser);
    }

}
