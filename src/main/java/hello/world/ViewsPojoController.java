package hello.world;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.views.View;

@Controller("/viewspojo")
class ViewsPojoController {
    @View("home.html")
    @Get("/pojo")
    public HttpResponse<Person> pojo() {
        return HttpResponse.ok(new Person("sdelamo", true));
    }
}