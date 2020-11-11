package sensedia.api.training.com.github.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SystemInformationConfiguration {
    @Bean(name = "user")
    public String getUserLoggedIn() {
        return System.getProperty("user.name");
    }

    @Bean(name = "osName")
    public String getOperationalSystemName() {
        return System.getProperty("os.name");
    }
}
