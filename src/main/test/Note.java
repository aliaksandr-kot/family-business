package main.test;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Note {
	
    @JsonIgnore
    @ManyToOne
    private User user;

    @Id
    @GeneratedValue
    private Long id;

    private Date date;
    
    private String text;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
    
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
