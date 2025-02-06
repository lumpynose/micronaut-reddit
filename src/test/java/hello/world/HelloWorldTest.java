package hello.world;

import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@MicronautTest
class HelloWorldTest {
    private static final Logger log = LoggerFactory.getLogger(hello.world.HelloWorldTest.class);

    @Inject
    EmbeddedApplication<?> application;

    @Inject
    RedditConfig redditConfig;

    @Test
    void testItWorks() {
        log.info("testItWorks: {}", application.getEnvironment().getActiveNames());
        log.info("testItWorks: {}", redditConfig.getSecret());

        Assertions.assertTrue(application.isRunning());
    }
}
