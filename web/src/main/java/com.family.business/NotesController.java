package com.family.business;

import java.util.Collection;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.family.business.test.Note;
import com.family.business.test.NoteRepository;
import com.family.business.test.User;
import com.family.business.test.UserRepository;

@RestController // http://localhost:8080/vladson/notes
@RequestMapping("{username}/notes")
public class NotesController {
	@Autowired
	NoteRepository noteRepository;
	@Autowired
	UserRepository userRepository;

	@RequestMapping
	Collection<Note> readNotes(@PathVariable String username)
    {
		return noteRepository.findByUserUsername(username);
	}

	@RequestMapping(method=RequestMethod.POST)
	public void addNote(@PathVariable String username, @Valid @RequestBody Note note){
		User user = userRepository.findByUsername(username)
				.orElseThrow(
                        () -> new UserNotFoundException(username)
                );
		note.setUser(user);
		noteRepository.save(note);
	}

    @RequestMapping(method=RequestMethod.DELETE)
    public void deleteNote(Long id) {
        noteRepository.delete(id);
    }

    @RequestMapping("find")
    public Collection<Note> findNote(@PathVariable String username, String text) {

        return noteRepository.findByUserUsernameAndTextContaining(username, text);

    }
}

@ResponseStatus(HttpStatus.NOT_FOUND)
class UserNotFoundException extends RuntimeException
{

    public UserNotFoundException(String username) {
        super("could not find user '" + username + "'.");
    }
}
