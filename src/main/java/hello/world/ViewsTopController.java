package hello.world;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.views.View;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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