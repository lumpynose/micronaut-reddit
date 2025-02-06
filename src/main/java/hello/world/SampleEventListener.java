package hello.world;

import io.micronaut.context.event.ShutdownEvent;
import io.micronaut.context.event.StartupEvent;
import io.micronaut.runtime.event.annotation.EventListener;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class SampleEventListener {
    private static final Logger log
            = LoggerFactory.getLogger(SampleEventListener.class);

    @Inject
    PropertyLoader propertyLoader;

//    @Inject
//    RedditConfig redditConfig;

    @EventListener
    public void onStartupEvent(StartupEvent event) {
        log.info("onStartupEvent");

//        try {
//            propertyLoader.loadProps();
//        }
//        catch (java.io.IOException e) {
//            throw new RuntimeException(e);
//        }
    }

    @EventListener
    public void onShutdownEvent(ShutdownEvent event) {
        log.info("onShutdownEven");
    }
}