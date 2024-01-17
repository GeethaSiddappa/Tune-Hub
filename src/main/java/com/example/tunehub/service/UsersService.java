package com.example.tunehub.service;

import com.example.tunehub.entities.Users;

public interface UsersService {
	public String addUser(Users user);
	public boolean emailExists(String email);
	public boolean validateUser(String email,String password);
	public String getRole(String email);
	public Users getuser(String email);
	public void updateUser(Users user);

}