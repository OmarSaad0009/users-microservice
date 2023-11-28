package com.omar.users.service;

import com.omar.users.entities.Role;
import com.omar.users.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);


}
