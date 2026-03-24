package com.vtc;

public class User {
	private int id;
	private String name;
	private String email;
	
	public User(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
            return true;
        if((obj == null) || (obj.getClass() != this.getClass()))
            return false;
        
        User user = (User)obj;
        return id == user.id && (name != null && name.equals(user.name));
	}
	
	@Override
	public int hashCode() {
		final int seed = 7;
        int result = 1;
        result = seed * result + ((name == null) ? 0 : name.hashCode());
        result = seed * result + id;
        return result;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

}
