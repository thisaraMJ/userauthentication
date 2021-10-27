package com.persistent.userauthentication.service;

import com.persistent.userauthentication.model.AuthenticationRequest;
import com.persistent.userauthentication.repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service("authService")
@Transactional
public class AuthService implements UserDetailsService {

    @Autowired
    private final AuthRepository authRepository;


    public AuthService(AuthRepository authRepository) {
        this.authRepository = authRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

//      Optional<AuthenticationRequest> authenticationRequest = authRepository.getUserByUsername(userName);
      return new User("username","password", new ArrayList<>());
    }
}
