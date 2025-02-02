package hello.world;

import io.micronaut.core.util.*;
import io.micronaut.http.*;
import io.micronaut.http.annotation.*;
import io.micronaut.views.*;
import org.slf4j.*;

@Controller("/")
class ViewsTopController {
    private static final Logger log
            = LoggerFactory.getLogger(ViewsTopController.class);

    @View("home")
    @Get("/")
    public HttpResponse<?> index() {
        log.info("index");
        return HttpResponse.ok(CollectionUtils.mapOf("loggedIn", true, "username", "top"));
    }
}