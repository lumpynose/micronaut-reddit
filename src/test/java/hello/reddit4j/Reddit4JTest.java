package hello.reddit4j;

import hello.world.RedditConfig;
import io.micronaut.context.ApplicationContext;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import masecla.reddit4j.client.Reddit4J;
import masecla.reddit4j.client.UserAgentBuilder;
import masecla.reddit4j.exceptions.AuthenticationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

@MicronautTest
class Reddit4JTest {
    private static final Logger log =
            LoggerFactory.getLogger(Reddit4JTest.class);

    @Inject
    ApplicationContext applicationContext;

    @Inject
    RedditConfig redditConfig;

    @Test
    void testItWorks()
            throws AuthenticationException, IOException, InterruptedException {
        log.info("testItWorks: {}",
                applicationContext.getEnvironment().getActiveNames());
        log.info("testItWorks: {}", redditConfig.getSecret());

        Assertions.assertTrue(applicationContext.isRunning());

//        Reddit4J client =
//                Reddit4J.rateLimited().setUsername(redditConfig.getUserName())
//                        .setPassword(redditConfig.getPassword())
//                        .setClientId(redditConfig.getClientId())
//                        .setClientSecret(redditConfig.getSecret()).setUserAgent(
//                                new UserAgentBuilder().appname("My App Name")
//                                        .author("My Name").version("1.0"));
//        client.connect();

        UserAgentBuilder userAgent =
                new UserAgentBuilder().appname("Reddit4J").author("masecla22")
                        .version("1.0");
        Reddit4J client =
                Reddit4J.rateLimited().setUsername(redditConfig.getUserName())
                        .setPassword(redditConfig.getPassword())
                        .setClientId(redditConfig.getClientId())
                        .setClientSecret(redditConfig.getSecret())
                        .setUserAgent(userAgent);

        client.connect();

        client.ensureConnection();
    }
}
