package pl.edu.ug.hotel.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.edu.ug.hotel.domain.user.entity.User;
import pl.edu.ug.hotel.domain.user.service.UserServiceImp;

import java.util.Collection;

@Service
public class MyUserDetailsService implements UserDetailsService {

    private UserServiceImp userService;

    @Autowired
    public MyUserDetailsService (UserServiceImp userService){
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        User user = userService.findByUsername(username);
        System.out.println(user);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new MyUserDetails(user);
    }
}


