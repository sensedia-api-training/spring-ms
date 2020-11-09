package sensedia.api.training.com.github.ApiController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/system/information")
public class SOInfosController {
    @Autowired
    @Qualifier("osarch")
    private String _soArchitecture;

    @Autowired
    @Qualifier("user")
    private String _soUser;


    @GetMapping("user")
    public ResponseEntity getUserLogged() {
        return ResponseEntity.ok(_soUser + ": " + _soArchitecture);
    }

}
