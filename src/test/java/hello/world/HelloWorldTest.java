package hello.world;

import io.micronaut.context.ApplicationContext;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@MicronautTest
class HelloWorldTest {
    private static final Logger log =
            LoggerFactory.getLogger(hello.world.HelloWorldTest.class);

    @Inject
    ApplicationContext applicationContext;

    @Inject
    RedditConfig redditConfig;

    @Test
    void testItWorks() {
        log.info("testItWorks: {}",
                applicationContext.getEnvironment().getActiveNames());
        log.info("testItWorks: {}", redditConfig.getSecret());

        Assertions.assertTrue(applicationContext.isRunning());
    }
}
