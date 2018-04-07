package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
// The above example does not specify GET vs. PUT, POST, and so forth,
// because @RequestMapping maps all HTTP operations by default.
// Use @RequestMapping(method=GET) to narrow this mapping.
@RestController
public class CabController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
// @RequestParam binds the value of the query string parameter name into
// the name parameter of the greeting() method. If the name parameter is absent in the request,
// the defaultValue of "World" is used.
    @RequestMapping("/cab")
    public Cab cab(@RequestParam(value="name", defaultValue="World") String name) {
        Coords coords = new Coords("1", "1");
        return new Cab(counter.incrementAndGet(), "free", "Opel", coords, "Madrid");
    }

    @RequestMapping("/coords")
    public Coords coords(@RequestParam(value="name", defaultValue="World") String name) {
        return new Coords("1", "1");
    }

}
