package hello.world;

import io.micronaut.context.env.PropertiesPropertySourceLoader;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Map;

@Singleton
public class PropertyLoader {
    private static final Logger log
            = LoggerFactory.getLogger(PropertyLoader.class);

    void loadProps() throws IOException {
        PropertiesPropertySourceLoader psl = new PropertiesPropertySourceLoader(true);
        Map<String, Object> map;

        log.info("starting loadProps");

//        FileSystemResourceLoader loader =
//                new DefaultFileSystemResourceLoader("/home/rusty/redditconfig.properties");
//        psl.loadEnv("reddit", loader, io.micronaut.context.env.DefaultEnvironment.class);

//        try (InputStream input = new FileInputStream("/home/rusty/redditconfig.properties")) {
//            map = psl.read("reddit", input);
//        }

//        for (String key : map.keySet()) {
//            log.info("property: {}, value: {}", key, map.get(key));
//        }
    }

}
