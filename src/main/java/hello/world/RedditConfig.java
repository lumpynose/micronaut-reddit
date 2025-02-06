package hello.world;

import io.micronaut.context.annotation.Property;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class RedditConfig {
    private static final Logger log
            = LoggerFactory.getLogger(RedditConfig.class);

    @Property(name = "micronaut.server.host")
    private String host;

    @Property(name = "reddit.clientid")
    private String clientid;

    @Property(name = "reddit.secret")
    private String secret;

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public String getClientId() {
        return clientid;
    }

    public void setClientId(final String clientId) {
        this.clientid = clientId;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(final String secret) {
        this.secret = secret;
    }
}
