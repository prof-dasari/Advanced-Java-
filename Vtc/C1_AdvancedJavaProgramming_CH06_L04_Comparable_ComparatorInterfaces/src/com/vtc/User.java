package com.vtc;

public class User implements Comparable{
	private int id;
	private String name;
	
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

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	/**
     * Compare current user with specified user
     * return zero if id for both user is same
     * return negative if current id is less than specified one
     * return positive if specified id is greater than specified one
     */
    @Override
    public int compareTo(Object o) {
    	User u = (User) o;
        //return this.id - u.id;//this can cause overflow
        return (this.id < u.id ) ? -1: (this.id > u.id) ? 1:0 ;
    }

	/*@Override
	public int compareTo(Object o) {
		User u = (User) o;	
		int result = name.compareTo(u.name);
		return result == 0 ? name.compareTo(((User) u).name) : result;
	}*/
    
    @Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
    
}
