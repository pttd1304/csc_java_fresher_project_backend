package com.csc.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.csc.dao.ScurityUserInfoDAO;
import com.csc.model.UserInfo;

@Service
public class ScurityUserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private ScurityUserInfoDAO userRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserInfo user = userRepository.findUserInfo(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found");
		}

		Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
		List<String> roles = userRepository.getUserRoles(username);
		for (String role:roles) {
			grantedAuthorities.add(new SimpleGrantedAuthority(role));
		}

		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),
				grantedAuthorities);
	}
}
