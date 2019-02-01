package woolnough.jason.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private List<String> state;

    @GetMapping
    public String getString() {
        return String.join(" ", state);
    }
}
