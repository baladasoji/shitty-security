package net.dasoji.webfinger;
import org.slf4j.Logger ;
import org.slf4j.LoggerFactory ;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class JWKSConfigController {

    private static final Logger logger = LoggerFactory.getLogger(OIDCConfigController.class);
    @Autowired
    private JWKSConfig config;
    @RequestMapping("/connect/jwks.json")
    public JWKSConfig getConfig() {
        return config ;
    }

}
