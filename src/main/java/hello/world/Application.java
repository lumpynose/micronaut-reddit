package hello.world;

import io.micronaut.context.DefaultApplicationContext;
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;

public class Application {
    public static void main(String[] args) {
        Micronaut.run(Application.class);
    }
}