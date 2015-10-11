package main.test;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

//    @OneToMany(mappedBy = "user")
//    private Set<Note> notes = new HashSet<>();
    
    @JsonIgnore
    @Column(name = "PASSWORD")
    public String password;
    @Column(name = "USER_NAME")
    public String username;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
//	public Set<Note> getNotes() {
//		return notes;
//	}
//	public void setNotes(Set<Note> notes) {
//		this.notes = notes;
//	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

    
    
}
