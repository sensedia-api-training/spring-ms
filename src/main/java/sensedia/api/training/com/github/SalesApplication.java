package sensedia.api.training.com.github;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@SpringBootApplication
@RestController
public class SalesApplication {

    private String user;
    private String osName;

    public static void main(String[] args) {
        SpringApplication.run(SalesApplication.class, args);
    }

    public SalesApplication(@Qualifier("user") String user, @Qualifier("osName") String osName) {
        this.user = user;
        this.osName = osName;
    }

    @GetMapping("/system/information")
    @ResponseBody
    public Map<String, String> getSystemInformation() {
        return Map.of(user, osName);
    }
}
