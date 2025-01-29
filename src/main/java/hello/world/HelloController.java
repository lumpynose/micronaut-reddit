package hello.world;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.context.annotation.Property;
import io.micronaut.runtime.server.EmbeddedServer;

@Controller("/hello") // (1)
public class HelloController {
    // @Property(name = "micronaut.server.host")
    String name;

    private final String host;
    private final int port;

    public HelloController(EmbeddedServer embeddedServer) {
        host = embeddedServer.getHost();
        port = embeddedServer.getPort();
    }

    @Get(produces = MediaType.TEXT_PLAIN) // (2)
    public String index() {
        return "Hello World" + " " + host + " " + port; // (3)
    }
}


