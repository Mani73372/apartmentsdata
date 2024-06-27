package com.jgajzler.apartmently.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jgajzler.apartmently.entity.User;
import com.jgajzler.apartmently.repository.UserRepository;
import com.jgajzler.apartmently.security.UserDetails;


@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService{
    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findUserByUsername(s);
        return com.jgajzler.apartmently.security.UserDetails.build(user);
    }
}
