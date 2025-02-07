package hello.world;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class HelloClientSpec {
    @Inject
    HelloClient client;

    @Test
    public void testHelloWorldResponse() {
        assertEquals("Hello World", Mono.from(client.hello()).block());// (3)
    }
}