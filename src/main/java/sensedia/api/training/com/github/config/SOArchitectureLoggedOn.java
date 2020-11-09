package sensedia.api.training.com.github.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SOArchitectureLoggedOn {

    @Bean(name = "osarch")
    public String getSOArchitectureLogged() {
        return System.getProperty("os.arch");
    }

    @Bean(name = "user")
    public String getUserLogged() {
        return System.getProperty("user.name");
    }

}
