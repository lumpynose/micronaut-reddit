package hello.world;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest // (1)
public class HelloClientSpec {

    @Inject
    HelloClient client; // (2)

    @Test
    public void testHelloWorldResponse() {
        assertEquals("Hello World", Mono.from(client.hello()).block());// (3)
    }
}