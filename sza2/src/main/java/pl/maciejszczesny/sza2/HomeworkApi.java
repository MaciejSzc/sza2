package pl.maciejszczesny.sza2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

import static pl.maciejszczesny.sza2.PrincipalService.checkIfPrincipalIsEmpty;

@RestController
public class HomeworkApi {

    @GetMapping("/")
    public String helloUnknown(Principal principal) {
        return checkIfPrincipalIsEmpty(principal) ? "Cześć nieznajomy" : "Cześć " + principal.getName();
    }

    @GetMapping("/adminGreet")
    public String helloAdmin(Principal principal) {
        return "Cześć admin " + principal.getName();
    }

    @GetMapping("/userGreet")
    public String helloUser(Principal principal) {
        return "Cześć user " + principal.getName();
    }

    @GetMapping("/bye")
    public String bye() {
        return "Papa";
    }
}
