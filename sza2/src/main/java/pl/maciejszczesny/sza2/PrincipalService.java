package pl.maciejszczesny.sza2;

import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.security.core.userdetails.User;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

public class PrincipalService {

    public static boolean checkIfPrincipalIsEmpty(Principal principal) {
        return principal == null;
    }

//    private Map<String, Integer> usersMap = new HashMap<>();
//
//    @EventListener(AuthenticationSuccessEvent.class)
//    private void handleUserAuthentication(AuthenticationSuccessEvent successEvent) {
//        User principal =  (User) successEvent.getAuthentication().getPrincipal();
//        String userName = principal.getUsername();
//        if(!usersMap.containsKey(userName)){
//            usersMap.put(userName,0);
//        }
//        int counter = usersMap.get(userName)+ 1;
//        usersMap.put(userName, counter);
//    }
//
//    public int getCounter(String userName) {
//        return usersMap.getOrDefault(userName, );
//    }
}
