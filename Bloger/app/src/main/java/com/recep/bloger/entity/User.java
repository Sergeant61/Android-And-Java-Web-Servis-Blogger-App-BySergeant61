package com.recep.bloger.entity;

public class User {

	private int id;

	private String username;

	private String password;

	private Rol rol;

	private UserKullAdd userKullAdd;

	public User(){
		rol = new Rol();
		userKullAdd = new UserKullAdd();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public UserKullAdd getUserKullAdd() {
		return userKullAdd;
	}

	public void setUserKullAdd(UserKullAdd userKullAdd) {
		this.userKullAdd = userKullAdd;
	}
}
