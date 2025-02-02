package hello.world;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.runtime.server.EmbeddedServer;

@Controller("/hello") // (1)
public class HelloController {
    private final String host;
    private final int port;
    // @Property(name = "micronaut.server.host")
    String name;

    public HelloController(EmbeddedServer embeddedServer) {
        host = embeddedServer.getHost();
        port = embeddedServer.getPort();
    }

    @Get(produces = MediaType.TEXT_PLAIN) // (2)
    public String index() {
        return "Hello World" + " " + host + " " + port; // (3)
    }
}


