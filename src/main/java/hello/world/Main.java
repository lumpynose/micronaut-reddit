package hello.world;

import io.micronaut.runtime.Micronaut;

public class Main {
    public static void main(String[] args) {
//        try (ApplicationContext context = ApplicationContext.run()) {
//            log.info("clientId: {}", app.clientId);
//        }
        Micronaut.run(Main.class, args);
    }
}