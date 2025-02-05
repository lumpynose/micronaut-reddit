package hello.world;

import io.micronaut.context.annotation.Value;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.views.View;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller("/viewspojo")
class ViewsPojoController {
    private static final Logger log
            = LoggerFactory.getLogger(ViewsPojoController.class);
    @Value("${micronaut.server.host}")
    private String host;

    @View("home")
    @Get("/{person}")
    public HttpResponse<Person> pojo(String person) {
        log.info("pojo; host={}", host);

        return HttpResponse.ok(new Person(person, true));
    }
}