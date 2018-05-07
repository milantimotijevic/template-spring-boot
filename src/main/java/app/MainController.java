package app;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class MainController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "Test successful";
    }

    @RequestMapping(value="/getperson")
    public Person getPerson() {
        return new Person("Pera", "Long Street");
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String login(HttpServletResponse response) {
        System.out.println("Login reached");
        response.setHeader("Access-Control-Allow-Origin", "*");
        return "kittycatzlol123";
    }

    @RequestMapping(value="/validatelogin/{token}")
    public boolean validateLoginToken(@PathVariable String token, HttpServletResponse response) {
        System.out.println("Validate login reached");
        response.setHeader("Access-Control-Allow-Origin", "*");
        return token.equals("kittycatzlol123");
    }

    @RequestMapping(value="/validatetweet", method = RequestMethod.POST)
    public ValidateTweetResponseDto validateTweet() {
        return new ValidateTweetResponseDto(true);
    }
}
